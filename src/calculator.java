import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n1, n2, select;

        System.out.print("İlk sayıyı giriniz : ");
        n1 = inp.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        n2 = inp.nextInt();
        System.out.println("Yapacağınız işlemi seçiniz : \n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        select = inp.nextInt();

        switch(select){
            case 1:
                System.out.print("Sonuç: " + (n1 + n2));
                break;
            case 2:
                System.out.print("Sonuç: " + (n1 - n2));
                break;
            case 3:
                System.out.print("Sonuç: " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.print("Sonuç: " + (n1 / n2));
                } else {
                    System.out.print("Bir sayı 0'a bölünemez!");
                }
                break;
            default:
                System.out.print("Hatalı seçim yaptınız. Tekrar deneyiniz.");
        }
    }
}
