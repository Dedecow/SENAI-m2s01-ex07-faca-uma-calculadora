import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.println(" Escolha um número para iniciar a calculadora: 1. Soma, 2. Subtração 3. Multiplicação 4. Divisão ");
         int opcao = sc.nextInt();
         switch (opcao) {
            case 1:
                System.out.println("Realizar Soma");
                break;
            case 2:
                System.out.println("Realizar Subtração");
                break;
            case 3:
                System.out.println("Realizar Multiplicação");
                break;
            default:
                System.out.println("Realizar Divisão ");
                break;
        }
        sc.close();
    }
}