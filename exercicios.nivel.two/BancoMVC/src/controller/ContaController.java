package controller;

import model.ContaBancaria;
import repository.ContaRepository;
import service.ContaService;

// Classe responsável por controlar as interações entre view, service e repository
public class ContaController {
    private ContaRepository contaRepo = new ContaRepository();
    private ContaService contaService = new ContaService();

    public void criarConta(double depositoInicial) {
        ContaBancaria conta = new ContaBancaria(depositoInicial);
        contaRepo.salvarConta(conta);
    }

    public void depositar(double valor) {
        ContaBancaria conta = contaRepo.buscarConta();
        contaService.depositar(conta, valor);
    }

    public void sacar(double valor) {
        ContaBancaria conta = contaRepo.buscarConta();
        boolean sucesso = contaService.sacar(conta, valor);

        if (!sucesso) {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void pagarBoleto(double valor) {
        ContaBancaria conta = contaRepo.buscarConta();
        boolean sucesso = contaService.pagarBoleto(conta, valor);

        if (!sucesso) {
            System.out.println("Não foi possível pagar o boleto. Verifique saldo.");
        }
    }

    public void mostrarSaldo() {
        ContaBancaria conta = contaRepo.buscarConta();
        System.out.println("Saldo atual: R$" + contaService.consultarSaldo(conta));
    }

    public void mostrarChequeEspecial() {
        ContaBancaria conta = contaRepo.buscarConta();
        System.out.println("Cheque especial disponível: R$" + contaService.consultarChequeEspecial(conta));
    }

    public void verificarUsoChequeEspecial() {
        ContaBancaria conta = contaRepo.buscarConta();

        if (contaService.estaUsandoChequeEspecial(conta)) {
            System.out.println("Você está usando o cheque especial.");
        } else {
            System.out.println("Você não está usando o cheque especial.");
        }
    }
}
