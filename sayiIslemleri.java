import java.util.Scanner;

public class sayiIslemleri {
    public static void sayiIslemleri() {
        Scanner scr = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz");
        int sayi = scr.nextInt();


        System.out.println("2. sayıyı giriniz");
        int sayi1 = scr.nextInt();

        int a1 = sayi - sayi1;
        System.out.println(a1);
        int b = sayi * sayi1;
        System.out.println(b);
        int c = sayi / sayi1;
        System.out.println(c);
        int d = sayi + sayi1;
        System.out.println(d);

    }

    public static void main( String[] args ) {
        sayiIslemleri();
    }
}
