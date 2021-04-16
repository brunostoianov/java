import java.util.Scanner;
public class Uri1048 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double salario;
        double novosalario;
        double aumento;
        salario = teclado.nextDouble();
        if (salario >= 0 && salario <= 400){
            novosalario = salario * 1.15;
            aumento = novosalario - salario;
            System.out.printf("Novo salario: %.2f%n", novosalario);
            System.out.printf("Reajuste ganho: %.2f%n", aumento);
            System.out.println("Em percentual: 15 %");
        }
        else if (salario > 400 && salario <= 800 ){
            novosalario = salario * 1.12;
            aumento = novosalario - salario;
            System.out.printf("Novo salario: %.2f%n", novosalario);
            System.out.printf("Reajuste ganho: %.2f%n", aumento);
            System.out.println("Em percentual: 12 %");
        }
        else if (salario > 800 && salario <= 1200){
            novosalario = salario * 1.10;
            aumento = novosalario - salario;
            System.out.printf("Novo salario: %.2f%n", novosalario);
            System.out.printf("Reajuste ganho: %.2f%n", aumento);
            System.out.println("Em percentual: 10 %");
        }
        else if (salario > 1200 && salario <= 2000){
            novosalario = salario * 1.07;
            aumento = novosalario - salario;
            System.out.printf("Novo salario: %.2f%n", novosalario);
            System.out.printf("Reajuste ganho: %.2f%n", aumento);
            System.out.println("Em percentual: 7 %");
        }
        else if (salario > 2000){
            novosalario = salario * 1.04;
            aumento = novosalario - salario;
            System.out.printf("Novo salario: %.2f%n", novosalario);
            System.out.printf("Reajuste ganho: %.2f%n", aumento);
            System.out.println("Em percentual: 4 %");
        }
        else {
        System.out.println ("Salario nao pode ser negativo");
        }
    }
}