package persisti.estagio.cursoFev.exercicios;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercicio003 {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);

        double i = 0,  entradaValor = sc.nextDouble();

        sc.nextLine();

        String entradaFrase = sc.nextLine();

        StringBuffer stringBuffer = new StringBuffer(entradaFrase.toUpperCase());

        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
        Date date = new Date();


        if(entradaValor%2==0)
        {
            for(i = 0; i < 4;i++)
            {
                System.out.println("O valor é par \n");
            }
        }
        else
        {
            for (i = 0; i < 3; i++)
            {
                System.out.println("O valor é impar \n");
            }
        }

        System.out.println(stringBuffer.reverse().toString());

        System.out.println("\nA data atual: "+ sdf3.format(date));

        sc.close();
    }
}
