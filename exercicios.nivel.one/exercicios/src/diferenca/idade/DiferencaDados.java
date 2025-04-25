package diferenca.idade;

import java.util.Scanner;
public class DiferencaDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome usuario 1: ");
        String nomeUm = scanner.next();

        System.out.print("Idade usuario 1: ");
        int idadeUm = scanner.nextInt();

        System.out.print("Nome usuario 2: ");
        String nomeDois = scanner.next();

        System.out.print("Idade usuario 2: ");
        int idadeDois = scanner.nextInt();

        int diferencaIdade = Math.abs(idadeUm - idadeDois);

        System.out.println(diferencaIdade);
    }
}
