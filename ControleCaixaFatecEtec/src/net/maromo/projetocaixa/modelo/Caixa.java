package net.maromo.projetocaixa.modelo;

public class Caixa {
    public double saldo;

    public boolean sacar(double valor){
        if(valor < saldo){
            saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean depositar(double valor){
        if(valor > 0){
            saldo += valor;
            return true;
        }
        return false;
    }
}
