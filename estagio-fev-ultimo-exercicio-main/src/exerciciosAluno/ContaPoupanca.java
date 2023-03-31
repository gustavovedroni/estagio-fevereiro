package exerciciosAluno;

public class ContaPoupanca extends exerciciosAluno.Conta {
    public ContaPoupanca(String identificadorConta)
    {
        super(identificadorConta);
        setTipo("Conta Poupanca");
    }

    public double rendimento()
    {
        double result = getSaldo() * 0.01;
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + " Rendimentos: " + rendimento();
    }
    /*public void imprimirSaldo()
    {
        System.out.printf("identifacor: %s, saldo: %.2f, tipo: %s, rendimento atual: R$%.2f.\n", getIndentificadorConta(), getSaldo(), getTipo(), rendimento());

    }*/
}