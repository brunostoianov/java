import java.util.Scanner;
public class Algoritimosjava2a {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double a;
        double r;
        System.out.println ("Digite o lado do quadrado e pressione enter");
        a = teclado.nextFloat();
        r = a*a;
        System.out.println ("A area do quadrado eh: " +r);

    }
}
