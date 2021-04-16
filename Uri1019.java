import java.util.Scanner;
public class Uri1019 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int dias;
        int anos;
        int meses;
        int d;
        dias = teclado.nextInt();
        anos = dias / 365;
        meses = (dias % 365) / 30;
        d = (dias % 365)%30;
        System.out.println (anos + " ano(s)");
        System.out.println (meses + " mes(es)");
        System.out.println (d + " dia(s)");

    }
}