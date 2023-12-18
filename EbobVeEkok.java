import java.util.Scanner;

public class EbobVeEkok {
    public static void main(String[] args) {
        Scanner sayı = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz: ");
        int num1 = sayı.nextInt();

        System.out.println("2. sayıyı giriniz: ");
        int num2 = sayı.nextInt();
        int ebob;
        for (int x= 1;x<=num1;x++){
            if (num1%x==0&&num2%x==0){
                System.out.println(x);
                ebob=1;
            }
        }
        for ( int z=num1;z>=1;z--){
            if (num1%z==0&&num2%z==0){
                ebob=z;
                break;
            }
        }

    }
}
