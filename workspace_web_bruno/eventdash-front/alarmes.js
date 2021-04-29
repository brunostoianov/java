function verificaUsuario(){
    if (!localStorage.getItem("userDASH")){
        window.location = "index.html";
    }
    gerarRelatorio();
}

function gerarRelatorio(){
    fetch("http://localhost:8080/alarmes")
    .then(res => res.json())
    .then(lista => preencheRelatorio(lista));
}

function preencheRelatorio(lista){
    var strTable = `<table class="table table-hover">
                       <thead>
                          <tr>
                             <th>#</th>
                             <th>Nome</th>
                             <th>Descricao</th>
                         </tr>
                       </thead>
                       <tbody>`;
    for (i=0; i<lista.length; i++){
        var evento = lista[i];
        strTable = strTable + `<tr>
                                  <td>${evento.id}</td>
                                  <td>${evento.nome}</td>
                                  <td>${evento.descricao}</td>
                               </tr>`;
    }
    strTable += `     </tbody>
                  </table>`;
    
    document.getElementById("relatorio").innerHTML = strTable;
}