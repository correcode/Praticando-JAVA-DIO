package model;

// Classe responsável por representar a conta bancária (modelo de dados)
public class ContaBancaria {
    private double saldo;
    private double chequeEspecial;
    private double chequeEspecialUsado;

    // Construtor da conta
    public ContaBancaria(double depositoInicial) {
        this.saldo = depositoInicial;

        // Define o cheque especial com base no depósito inicial
        if (depositoInicial <= 500) {
            this.chequeEspecial = 50.0;
        } else {
            this.chequeEspecial = depositoInicial * 0.5;
        }

        this.chequeEspecialUsado = 0;
    }

    // Getters e setters
    public double getSaldo() {
        return saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public double getChequeEspecialUsado() {
        return chequeEspecialUsado;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setChequeEspecialUsado(double valor) {
        this.chequeEspecialUsado = valor;
    }

    public double getSaldoTotalDisponivel() {
        return saldo + (chequeEspecial - chequeEspecialUsado);
    }

    public boolean estaUsandoChequeEspecial() {
        return chequeEspecialUsado > 0;
    }
}
