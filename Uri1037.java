import java.util.Scanner;
public class Uri1037 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double ddd;
        ddd = teclado.nextDouble();
        if (ddd > 0 && ddd <= 25){
            System.out.println ("Intervalo (0,25]");
        }
        else if (ddd > 25 && ddd <= 50){
            System.out.println ("Intervalo (25,50]");
        }
        else if (ddd > 50 && ddd <= 75){
            System.out.println ("Intervalo (50,75]");
        }
        else if (ddd > 75 && ddd <= 100 ){
            System.out.println ("Intervalo (75,100]");
        }
        else {
            System.out.println ("Fora de intervalo");
        }
    }
}