import java.util.Scanner;
public class Uri1041 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double eixox;
        double eixoy;
        eixox = teclado.nextDouble();
        eixoy = teclado.nextDouble();
        if (eixox == 0 && eixoy == 0){
            System.out.println ("Origem");
        }
        else if (eixox ==0){
            System.out.println ("Eixo X");
        }
        else if (eixoy == 0){
            System.out.println ("Eixo Y");
        }
        else if (eixox > 0 && eixoy > 0){
            System.out.println ("Q1");
        }
        else if (eixox < 0 && eixoy > 0){
            System.out.println ("Q2");
        }
        else if (eixox < 0 && eixoy < 0){
            System.out.println ("Q3");
        }
        else {
        System.out.println ("Q4");
        }
    }
}