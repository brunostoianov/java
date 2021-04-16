import java.util.Scanner;
public class Algoritimosjava2c {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double a;
        double b;
        double r;
        System.out.println ("Digite a base do triangulo e pressione enter");
        a = teclado.nextFloat();
        System.out.println ("Digite a altura do triangulo e pressione enter");
        b = teclado.nextFloat();
        r = (a*b)/2.0;
        System.out.println ("A area do triangulo eh: " +r);

    }
}
