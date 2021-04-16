import java.util.Scanner;
public class Uri1018 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int dinheiro;
        int cem;
        int cinquenta;
        int vinte;
        int dez;
        int cinco;
        int dois;
        int um;
        dinheiro = teclado.nextInt();
        cem = dinheiro / 100;
        cinquenta = (dinheiro % 100) / 50;
        vinte = ((dinheiro % 100) % 50) / 20;
        dez = (((dinheiro % 100) % 50) % 20) / 10;
        cinco = ((((dinheiro % 100) % 50) % 20) % 10) / 5;
        dois = (((((dinheiro % 100) % 50) % 20) % 10) % 5) / 2;
        um = (((((dinheiro % 100) % 50) % 20) % 10) % 5) % 2;
        System.out.println (dinheiro);
        System.out.println (cem + " nota(s) de R$ 100,00");
        System.out.println (cinquenta + " nota(s) de R$ 50,00");
        System.out.println (vinte + " nota(s) de R$ 20,00");
        System.out.println (dez + " nota(s) de R$ 10,00");
        System.out.println (cinco + " nota(s) de R$ 5,00");
        System.out.println (dois + " nota(s) de R$ 2,00");
        System.out.println (um + " nota(s) de R$ 1,00");

    }
}
