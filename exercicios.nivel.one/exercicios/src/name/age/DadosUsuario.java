package name.age;

import java.util.InputMismatchException;
import java.util.Scanner;
public class DadosUsuario {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nQual seu nome? ");

        try {
            String nome = scanner.next();

            System.out.println("\n Qual sua idade ? ");
            int idade = scanner.nextInt();

            System.out.println("\nOla " + nome + " voce tem " + idade + " anos");
        } catch(InputMismatchException exception) {
            System.out.println("Digite somente o primeiro nome");
        }


    }
}