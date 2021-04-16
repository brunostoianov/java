import java.util.Scanner;
public class Uri1064 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double a = 0;
        int b = 0;
        double c = 0;
        double d = 0;
        for (int entrada = 0;entrada < 6;entrada = entrada +1){
            a = teclado.nextDouble();
            if (a > 0){
                b = b + 1;
                c = c + a;
            }
        }
        System.out.println(b + " valores positivos");
        d = c / b;
        System.out.printf("%.1f%n", d);
    }
}