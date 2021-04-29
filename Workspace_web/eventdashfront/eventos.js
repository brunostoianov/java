function validaUser() {
    var userStr = localStorage.getItem("userDASH");
    if (!userStr) {
        window.location = "index.html";
        return;
    }
}

function gerarRelatorio() {
    /*
    - recuperar os valores digitados nos campos de data
    - montar a URL para acessar esse back end
    - ao receber a resposta, extrair o JSON dela e montar o relatório
    */

    var txtIni = document.getElementById("txtDataInicio").value;
    var txtFim = document.getElementById("txtDataFim").value;
    var msgBody = { inicio: txtIni, fim: txtFim }
    var cabecalho = { method: "POST", body: JSON.stringify(msgBody), headers: { "content-type": "application/json" } }
    var url = `http://localhost:8080/eventosporperiodo`;

    fetch(url, cabecalho).then(resposta => resposta.json()).then(lista => preencheRelatorio(lista));
}

function preencheRelatorio(lista) {
    /*
    estrutura do objeto evento
         {
            "numSeq": 223,                       -----> col-1                   ---> col-6
            "dataEvento": "2020-01-01",          -----> col-2                   ---> col-6
            "alarme": {
                "idAlarme": 1,
                "nome": "FAIL_LINK",             -----> col-2                   ---> col-6
                "descricao": "Link de comunicacao indisponivel" ----> col->3    ---> col-6
            },
            "equipamento": {
                "idEquipamento": 11,
                "hostname": "ROUTER_AG_075",      ----> col-2                   ---> col-6
                "ipAddr": "10.2.75.1"             ----> col-2                   ---> col-6
            }
        },
    */

    // vamos percorrer a lista e montar uma grande STRING com todo o conteúdo


    var strTable = `<table class="table table-hover">
   <thead>
      <tr>
         <th>#</th>
         <th>Data</th>
         <th>Alarme</th>
         <th>Equipamento</th>
         <th>IP</th>
     </tr>
   </thead>
   <tbody>`;
    for (i = 0; i < lista.length; i++) {
        var evento = lista[i];
        strTable = strTable + `<tr>
                                 <td>${evento.numSeq}</td>
                                 <td>${evento.data}</td>
                                 <td>${evento.alarme.nome}</td>
                                 <td>${evento.equipamento.hostname}</td>
                                 <td>${evento.equipamento.ipaddr}</td>
                              </tr>`;
    }


    strTable += `     </tbody>
   </table>`;

    document.getElementById("relatorio").innerHTML = strTable;
}

function botaoVoltar() {
    window.location = "relatorio.html";
    return;
}