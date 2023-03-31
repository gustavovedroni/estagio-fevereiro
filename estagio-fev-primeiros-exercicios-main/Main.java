public class Main {
    public static void main(String[] args)
    {
        int a = 5;
        while (a != 100) {
            a++;
            if (a < 40) {
                continue;
            }
            System.out.println("a vale " + a);
            if(a == 50) {
                System.out.println("Loop interrompido com a valendo " + a);
                break;
            }
        }
    }
}