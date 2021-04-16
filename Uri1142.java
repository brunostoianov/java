import java.util.Scanner;
public class Uri1142 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int entrada = 0;
        int contador = 0;
        int a = 1;
        int b = 2;
        int c = 3;
        entrada = teclado.nextInt();
        while((entrada * 4) > contador){
            if (contador % 4 == 0 ){
                System.out.println(a + " " + b + " " + c + " PUM");
                a = a + 4;
                b = b + 4;
                c = c + 4;
            }
            contador++;
        }
    }
}