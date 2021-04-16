import java.util.Scanner;
public class Uri1066 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int entrada = 0;
        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;
        for (int contador = 0;contador < 5;contador = contador +1){
            entrada = teclado.nextInt();
            if (entrada > 0){
                positivos = positivos + 1;
            }
            if (entrada < 0){
                negativos = negativos + 1;
            }
            if (entrada % 2 != 0){
                impares = impares + 1;
            }
            if (entrada % 2 == 0){
                pares = pares + 1;
            }

        }
        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");
    }
}