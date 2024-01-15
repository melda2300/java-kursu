import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci serisi için eleman sayısını girin: ");
        int elemanSayisi = scanner.nextInt();

        System.out.println(elemanSayisi + " Elemanlı Fibonacci Serisi:");

        int fib1 = 0, fib2 = 1;

        for (int i = 0; i < elemanSayisi; i++) {
            System.out.print(fib1 + " ");

            int yeniEleman = fib1 + fib2;
            fib1 = fib2;
            fib2 = yeniEleman;
        }

        scanner.close();
    }
}
