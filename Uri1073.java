import java.util.Scanner;
public class Uri1073 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int entrada = 0;
        int contador = 0;
        int resultado = 0;
        while (entrada > 2000 || entrada < 6){
            entrada = teclado.nextInt();
        }
        for (contador = 1; contador <= entrada; contador++){
            if (contador % 2 == 0){
                resultado = contador * contador;
                System.out.println(contador + "^2 = " + resultado);
            }
        }
    }
}
        