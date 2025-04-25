package service;

import model.ContaBancaria;

// Classe responsável pelas regras de negócio
public class ContaService {

    public void depositar(ContaBancaria conta, double valor) {
        if (conta.estaUsandoChequeEspecial()) {
            // Se estiver usando cheque especial, cobra taxa de 20%
            double taxa = conta.getChequeEspecialUsado() * 0.2;
            double valorRestante = valor - taxa;

            if (valorRestante < 0) {
                valorRestante = 0;
            }

            // Paga o cheque especial primeiro
            double novoChequeUsado = conta.getChequeEspecialUsado() - valorRestante;

            if (novoChequeUsado < 0) {
                conta.setSaldo(-novoChequeUsado);
                conta.setChequeEspecialUsado(0);
            } else {
                conta.setChequeEspecialUsado(novoChequeUsado);
            }
        } else {
            // Se não estiver usando cheque especial, adiciona direto ao saldo
            conta.setSaldo(conta.getSaldo() + valor);
        }
    }

    public boolean sacar(ContaBancaria conta, double valor) {
        double saldoTotal = conta.getSaldoTotalDisponivel();

        if (valor <= saldoTotal) {
            double novoSaldo = conta.getSaldo() - valor;

            if (novoSaldo >= 0) {
                conta.setSaldo(novoSaldo);
            } else {
                // Usando cheque especial
                conta.setSaldo(0);
                conta.setChequeEspecialUsado(Math.abs(novoSaldo));
            }

            return true;
        } else {
            return false;
        }
    }

    public boolean pagarBoleto(ContaBancaria conta, double valor) {
        return sacar(conta, valor); // mesma lógica de saque
    }

    public double consultarSaldo(ContaBancaria conta) {
        return conta.getSaldo();
    }

    public double consultarChequeEspecial(ContaBancaria conta) {
        return conta.getChequeEspecial() - conta.getChequeEspecialUsado();
    }

    public boolean estaUsandoChequeEspecial(ContaBancaria conta) {
        return conta.estaUsandoChequeEspecial();
    }
}
