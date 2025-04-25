import controller.ContaController;
import java.util.Scanner;

// Classe principal para simular uso do sistema bancário
public class Main {
    public static void main(String[] args) {
        ContaController controller = new ContaController();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor para criar a conta: R$ ");
        double depositoInicial = sc.nextDouble();
        controller.criarConta(depositoInicial);

        int opcao;

        do {
            System.out.println("\n1. Consultar saldo");
            System.out.println("2. Consultar cheque especial");
            System.out.println("3. Depositar");
            System.out.println("4. Sacar");
            System.out.println("5. Pagar boleto");
            System.out.println("6. Verificar uso de cheque especial");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> controller.mostrarSaldo();
                case 2 -> controller.mostrarChequeEspecial();
                case 3 -> {
                    System.out.print("Valor do depósito: R$ ");
                    double valor = sc.nextDouble();
                    controller.depositar(valor);
                }
                case 4 -> {
                    System.out.print("Valor do saque: R$ ");
                    double valor = sc.nextDouble();
                    controller.sacar(valor);
                }
                case 5 -> {
                    System.out.print("Valor do boleto: R$ ");
                    double valor = sc.nextDouble();
                    controller.pagarBoleto(valor);
                }
                case 6 -> controller.verificarUsoChequeEspecial();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        sc.close();
    }
}
