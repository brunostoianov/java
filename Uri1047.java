import java.util.Scanner;
public class Uri1047 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int hora1;
        int minuto1;
        int hora2;
        int minuto2 ;
        int totalminutos;
        int total1minutos;
        int total2minutos;
        int tempohoras;
        int tempominutos;
        hora1 = teclado.nextInt();
        minuto1 = teclado.nextInt();
        hora2 = teclado.nextInt();
        minuto2 = teclado.nextInt();
        total1minutos = (hora1 * 60) + minuto1;
        total2minutos = (hora2 * 60) + minuto2;
        if (total1minutos - total2minutos > 0) {
            totalminutos = 1440 - (total1minutos - total2minutos);
            tempohoras = totalminutos / 60;
            tempominutos= totalminutos % 60;
            System.out.println("O JOGO DUROU " + tempohoras + " HORA(S) E " + tempominutos + " MINUTO(S)");
        }
        else if (total2minutos - total1minutos > 0) {
            totalminutos = total2minutos - total1minutos;
            tempohoras = totalminutos / 60;
            tempominutos = totalminutos % 60;
            System.out.println("O JOGO DUROU " + tempohoras + " HORA(S) E " + tempominutos + " MINUTO(S)");
        }
        else{
            tempohoras = 24;
            tempominutos = 0;
            System.out.println("O JOGO DUROU " + tempohoras + " HORA(S) E " + tempominutos + " MINUTO(S)");
        }
    }
}
        