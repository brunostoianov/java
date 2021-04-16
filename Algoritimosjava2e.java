import java.util.Scanner;
public class Algoritimosjava2e {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double a;
        double b;
        double c;
        double r;
        System.out.println ("Digite a base maior do trapezio e pressione enter");
        a = teclado.nextFloat();
        System.out.println ("Digite a base menor do trapezio e pressione enter");
        b = teclado.nextFloat();
        System.out.println ("Digite a altura do trapezio e pressione enter");
        c = teclado.nextFloat();
        r = (a+b)*c/2.0;
        System.out.println ("A area do trapezio eh: " +r);

    }
}
