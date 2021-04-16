import java.util.Scanner;
public class Uri1070 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int entrada = 0;
        int contador = 0;
        entrada = teclado.nextInt();
        for (contador = 0; contador < 12; contador++){
            if (entrada % 2 != 0){
                System.out.println(entrada);
            }
            entrada++;
        }
    }
}
        