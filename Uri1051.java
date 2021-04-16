import java.util.Scanner;
public class Uri1051 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double salario;
        double salariodif;
        double imposto;
        double valorimposto;
        double imposto1;
        double imposto2;
        salario = teclado.nextDouble();
        if (salario >= 0 && salario <= 2000) {
            System.out.println("Isento");
        }
        else if (salario > 2000 && salario <= 3000) {
            salariodif = salario - 2000;
            imposto = salariodif * 1.08;
            valorimposto = imposto - salariodif;
            System.out.printf("R$ %.2f%n", valorimposto);
        }
        else if (salario > 3000 && salario <= 4500) {
            imposto = 1000 * 1.08;
            salariodif = salario - 2000 - 1000;
            imposto1 = salariodif * 1.18;
            valorimposto = (imposto - 1000) + (imposto1 - salariodif);
            System.out.printf("R$ %.2f%n", valorimposto);
        }
        else{
            imposto = 1000 * 1.08;
            imposto1 = 1500 * 1.18;
            salariodif = salario - 2000 - 1000 - 1500;
            imposto2 = salariodif * 1.28;
            valorimposto = (imposto - 1000) + (imposto1 - 1500) + (imposto2 - salariodif);
            System.out.printf("R$ %.2f%n", valorimposto);
        }
    }
}
        