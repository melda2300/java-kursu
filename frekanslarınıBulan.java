import java.util.Scanner;
public class deneme2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen dizi uzunluğunu giriniz: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Lütfen dizi elemanlarını giriniz: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Hangi sayının frekansını bulmak istiyorsunuz? ");
        int x = scanner.nextInt();
        int frequency = 0;
        for (int num : arr) {
            if (num == x) {
                frequency++;
            }
        }
        System.out.println(x + " sayısı " + frequency + " kere tekrar edildi.");
    }

}
