import java.util.Scanner;

public class Main {
    public static int fib(int X) {
        if (X == 0 || X == 1) {
            return X;
        } else {
            return fib(X-1) + fib(X-2);
        }
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int entrada = ler.nextInt();

        for (int i = 0; i <= entrada; i++) {
            int result = fib(i);

            if (result == entrada) {
                System.out.println("faz parte da sequencia");
                return;
            } if (result > entrada) {
                System.out.println("nao faz parte da sequencia");
                return;
            }
        }
    }
}
