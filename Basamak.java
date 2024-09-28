import java.util.Scanner;

public class Basamak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();
        int toplam = 0;

        while (sayi != 0) {
            toplam += sayi % 10;
            sayi /= 10;
        }

        System.out.println("Basamakların toplamı: " + toplam);
    }
}
