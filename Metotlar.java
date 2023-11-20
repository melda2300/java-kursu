public class Metotlar {
    public static String ikisayıyıkarsılastır(int i, int l) {
        if (i > l) {
            return "i büyüktür";
        } else {
            return "l büyüktür";
        }
    }

    public static void main(String[] args) {


      String sonuc= ikisayıyıkarsılastır(23,20);

        System.out.println(sonuc);
    }
}
