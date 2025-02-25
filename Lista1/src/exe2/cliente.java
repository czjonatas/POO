
package exe2;

import javax.swing.*;

public class cliente {
    public int nroAgencia, nroConta;
    public String nome;
    public float saldo;

    //construtores
    public cliente() {
        this.nome = "sem valor";
    }

    public cliente(int nroAgencia, int nroConta, String nome, float saldo) {
        this.nroAgencia = nroAgencia;
        this.nroConta = nroConta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void depositar(float valor) {
        this.saldo += valor;
    }

    public void sacar(float valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            JOptionPane.showMessageDialog(null, "saldo insuficiente ");
        }
    }

    public void exibeDetalhes() {

        JOptionPane.showMessageDialog(null, "conta " + this.nroConta + "nome" + this.nome + " saldo " + this.saldo);
    }
}