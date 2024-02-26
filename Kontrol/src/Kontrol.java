public class Kontrol {
    public static String kontrolEtme(int sayi) {
        if (0 < sayi) {
            System.out.println(sayi + " sayı  0 dan büyüktür");
            return sayi + " sayı  0 dan büyüktür";
        } else if (0 > sayi) {
            System.out.println(sayi + " sayı 0 dan küçüktür");
            return sayi + " sayı 0 dan küçüktür";
        } else {
            System.out.println(sayi + " sayı 0 a eşittir");
            return sayi + " sayı 0 a eşittir";
        }

    }

    public static float toplama(int a, float b) {
        return a + b;
    }

    public static String meldaBulma(String isim){
        String[] kullanıcı={"melda","furkan","alperen"};
        for (String i : kullanıcı) {
            if (isim=="melda"){
                return "melda bulundu";
            }
            }
        return "melda bulunmadı";
        }

}
