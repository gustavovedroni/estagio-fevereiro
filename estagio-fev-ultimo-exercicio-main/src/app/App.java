package app;

import exerciciosAluno.Conta;
import exerciciosAluno.ContaCorrente;
import exerciciosAluno.ContaPoupanca;

import java.util.LinkedList;
public class App {
    public static void main (String [] args) {
        ContaCorrente contaCorrente = new ContaCorrente("123456-0");
        contaCorrente.depositar(100.00);
        contaCorrente.sacar(70.00);

        ContaCorrente contaCorrente2 = new ContaCorrente("923456-0");
        contaCorrente2.depositar(1000.00);

        ContaPoupanca contaPoupanca = new ContaPoupanca("11789-0");
        contaPoupanca.depositar(5000);
        ContaPoupanca contaPoupanca2 = new ContaPoupanca("18789-0");
        contaPoupanca2.depositar(500);

        LinkedList<Conta> contas = new LinkedList<>();

        contas.add(contaCorrente);
        contas.add(contaCorrente2);
        contas.add(contaPoupanca);
        contas.add(contaPoupanca2);

        for(Conta item : contas) {
            System.out.println(item.toString());
        }
    }
}