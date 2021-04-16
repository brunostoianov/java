import java.util.Scanner;
public class Uri1008 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int a;
        int b;
        int c;
        int d;
        double e;
        double f;
        double r;
        a = teclado.nextInt();
        b = teclado.nextInt();
        e = teclado.nextDouble();
        c = teclado.nextInt();
        d = teclado.nextInt();
        f = teclado.nextDouble();
        r =  (b*e)+(d*f);
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", r);
    }
}
