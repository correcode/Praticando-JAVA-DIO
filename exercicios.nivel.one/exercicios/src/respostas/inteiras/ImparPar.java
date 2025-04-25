package respostas.inteiras;

import java.util.Scanner;

public class ImparPar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDigite o primeiro numero: ");
        int primeiroNumero = scanner.nextInt();

        System.out.println("\nDigite o segundo numero (deve ser maior que o primeiro): ");
        int segundoNumero = scanner.nextInt();

        while(segundoNumero <= primeiroNumero) {
            System.out.println("O segundo numero deve ser maior que o primeiro, Tente novamente: ");
            segundoNumero = scanner.nextInt();
        }

        System.out.println("\nDeseja ver os numeros (par) ou (impar)? :");
        String escolha = scanner.next();

        for(int i = segundoNumero; i >= primeiroNumero; i--) {
            if (escolha.equalsIgnoreCase("par") && i % 2 == 0) {
                System.out.println(i);
            } else if (escolha.equalsIgnoreCase("impar") && i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}