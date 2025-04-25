package repository;

import model.ContaBancaria;

// Simula o acesso ao "banco de dados"
public class ContaRepository {
    private ContaBancaria conta;

    public void salvarConta(ContaBancaria conta) {
        this.conta = conta;
    }

    public ContaBancaria buscarConta() {
        return conta;
    }
}
