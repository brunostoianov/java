import java.util.Scanner;
public class Uri1134 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int X = 0;
        int gasolina = 0;
        int alcool = 0;
        int diesel = 0;
        X = teclado.nextInt();
        while (X != 4){
            switch(X){
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
            }
            X = teclado.nextInt(); 
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}