import java.util.Scanner;
public class Uri1115 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int X = 0;
        int Y = 0;
        X = teclado.nextInt();
        Y = teclado.nextInt();
        while(X != 0 || Y != 0){
            if (X > 0 && Y > 0){
                System.out.println("primeiro");
            }
            if (X < 0 && Y > 0){
                System.out.println("segundo");
            }
            if (X < 0 && Y < 0){
                System.out.println("terceiro");
            }
            if (X > 0 && Y < 0){
                System.out.println("quarto");
            }
            X = teclado.nextInt();
            Y = teclado.nextInt();
        }
    }
}
        