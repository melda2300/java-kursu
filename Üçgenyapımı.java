public class Üçgenyapımı {
    public static void main(String[] args) {
        int satırlar = 9;
        for (int i = 0; i <= satırlar; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= satırlar-1-i; k++) {
                System.out.print("*"+" " );
            }
            System.out.println();
        }
    }
}
