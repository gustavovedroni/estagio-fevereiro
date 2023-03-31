package persisti.estagio.cursoFev.exercicios;

import java.util.Scanner;
public class Exercicio001 {
    public static void main(String [] args)
    {
        Scanner sc  = new Scanner(System.in);

        int ValorX = sc.nextInt();
        int ValorY = sc.nextInt();

        double soma = ValorX + ValorY;

        System.out.println(soma);
        System.out.printf("O valor da raiz quadrado do numero" + soma + " é %.4f", Math.sqrt(soma));

    }
}
