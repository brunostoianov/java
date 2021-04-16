import java.util.Scanner;
public class Uri1067 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int entrada = 0;
        int contador = 0;
        entrada = teclado.nextInt();
        while ( contador <= entrada){
            if (contador % 2 != 0){
                System.out.println(contador);
            }
            contador = contador +1;
            
        }
    }
}
        