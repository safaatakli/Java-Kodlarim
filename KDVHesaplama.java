import java.util.Scanner;

class KDVHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int fiyat; 

        System.out.println("Lutfen ürünün fiyatını giriniz: ");
        fiyat = input.nextInt();

        System.out.println("Lutfen KDV oranını(%x) giriniz: ");
        int KDV = input.nextInt();

        double yeniFiyat = ((fiyat * KDV) / 100) + fiyat;

        System.out.println("Ürününüzün kdv dahil fiyatı: " + yeniFiyat);
        System.exit(0);

        input.close();
    }
}