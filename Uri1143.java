import java.util.Scanner;
public class Uri1143 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int entrada = 0;
        int contador = 1;
        int a = 0;
        int b = 0;
        int c = 0;
        entrada = teclado.nextInt();
        while(entrada >= contador){
            a = contador;
            b = contador * contador;
            c = contador * contador * contador;
            System.out.println(a + " " + b + " " + c);
            contador++;
        }
    }
}