package exerciciosAluno;

public class ContaCorrente extends Conta {
    public ContaCorrente(String identificadorConta)
    {
        super(identificadorConta);
        setTipo("Conta corrente");
    }

   /* @Override
    public String toString() {
        return "Identificador: " + getIndentificadorConta()
                + " Seu saldo: " + getSaldo()
                + " Tipo de conta: " + getTipo();
    }

    public void imprimirSaldo()
    {
        System.out.printf("identifacor: %s, saldo: %.2f, tipo: %s. \n",getIndentificadorConta(), getSaldo(), getTipo());
        MEU TOSTRING NÃO PRECISA SER REESCRITO AQUI, PORQUE ELE RETORNA OS MESMOS PARAMETROS DA TOSTRING DE CONTA QUE ELE ESTÁ HERDANDO.
    }*/
}