import java.util.Scanner;
public class Uri1046 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int hora1;
        int hora2;
        int tempo ;
        hora1 = teclado.nextInt();
        hora2 = teclado.nextInt();
        if (hora1 - hora2 > 0) {
            tempo = 24 - (hora1 - hora2);
            System.out.println("O JOGO DUROU " + tempo + " HORA(S)");
        }
        else if (hora2 - hora1 > 0) {
            tempo = hora2 - hora1;
            System.out.println("O JOGO DUROU " + tempo + " HORA(S)");
        }
        else{
            tempo = 24;
            System.out.println("O JOGO DUROU " + tempo + " HORA(S)");
        }
    }
}
        