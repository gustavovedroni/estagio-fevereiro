package persisti.estagio.cursoFev.exercicios;

import java.util.Scanner;

public class Exercicio002 {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);

        double nota1, nota2, nota3, nota4;

        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();
        nota3 = sc.nextDouble();
        nota4 = sc.nextDouble();

        double media = (nota1+nota2+nota3+nota4) /4;

        if(media > 6)
        {
            System.out.printf("Parabéns! Você aprovado com média: %.4f", media);
        }
        else
        {
            System.out.printf("Você foi reprovado com média: %.4f", media);
        }
    }
}
