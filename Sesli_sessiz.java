import java.util.Scanner;

public class Sesli_sessiz {
    public static void main(String[] args) {
        String[] sesli = new String[]{
                "a", "e", "ı", "i", "o", "ö", "u", "ü"
        };
        String[] sessiz = new String[]{
                "z", "y", "v", "t", "ş", "s", "r", "p", "n", "r", "m", "l", "k", "h", "j", "ğ", " g", "d", "ç", "c", "b"
        };
        int[] sayı = new int[]{
                '1', '2', '3', '4', '5', '6', '7', '8', '9',
        };
        Scanner scr = new Scanner(System.in);
        System.out.print("bir harf yd sayı girin:");
        String karater = scr.next();

        if (isHarfInArray(karater, sesli)) {
            System.out.println("sesli harf");
        } else if (isHarfInArray(karater, sessiz)) {
            System.out.println("sessiz harf");
        } else if (isNumberInArray(karater, sayı)) {
            System.out.println("sayıdır");
        } else {
            System.out.println("hata");
        }
    }
    private static boolean isHarfInArray(String harf, String[] array) {
        for (String s : array) {
            if (s.equals(harf)) {
                return true;
            }
        }
        return false;
    }

    //İşlev isHarfInArray(String harf, String[] array) bir String nesnesi alıyor ve onu belirtilen
    //String dizisinde arıyor. İşlev harf nesnesini array dizisinde bulursa true döndürür, aksi takdirde false döndürür.
    private static boolean isNumberInArray(String harf, int[] array) {
        for (int i : array) {
            if (harf.charAt(0) == i) {
                return true;
            }
        }
        return false;
    }
      // İşlev isNumberInArray(String harf, int[] array) bir String nesnesi alıyor ve onu belirtilen int dizisinde arıyor.
      // İşlev harf nesnesini array dizisinde bulursa true döndürür, aksi takdirde false döndürür.
}
