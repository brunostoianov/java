import java.util.Scanner;
public class Uri1074 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int entrada = 0;
        int contador = 0;
        int resultado = 0;
        int entrada1 = 0;
        entrada = teclado.nextInt();
        while(entrada > contador){
            entrada1 = teclado.nextInt();
            contador++;
            
            if (entrada1 % 2 == 0 && entrada1 > 0 && entrada1 != 0){
                System.out.println("EVEN POSITIVE");
            }
            if (entrada1 % 2 == 0 && entrada1 < 0){
                System.out.println("EVEN NEGATIVE");
            }
            if (entrada1 % 2 != 0 && entrada1 > 0){
                System.out.println("ODD POSITIVE");
            }
            if (entrada1 % 2 != 0 && entrada1 < 0){
                System.out.println("ODD NEGATIVE");
            }
            if (entrada1 == 0){
                System.out.println("NULL");
            }
            
        }
    }
}
        