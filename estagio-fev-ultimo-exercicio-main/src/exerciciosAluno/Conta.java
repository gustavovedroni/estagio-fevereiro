package exerciciosAluno;
public class Conta {
    private String indentificadorConta;
    private double saldo;
    private String tipo;

    public Conta(String indentificadorConta)
    {
        this.indentificadorConta = indentificadorConta;
    }

    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    public void sacar(double valor) {
        if (valor > this.saldo) {
            System.out.println("Valor do saque é maior que o saldo da conta!");
        } else {
            this.saldo = this.saldo - valor;
        }
    }

    @Override
    public String toString() {
        return "Identificador: " + this.indentificadorConta
                + " Seu saldo: " + this.saldo
                + " Tipo de conta: " + this.tipo;
    }

    public String getIndentificadorConta() {
        return indentificadorConta;
    }

    public void setIndentificadorConta(String indentificadorConta) {
        this.indentificadorConta = indentificadorConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}