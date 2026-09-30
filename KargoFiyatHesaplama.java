import java.util.Scanner;

public class KargoFiyatHesaplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int agirlik;
        int fiyat;
        System.out.println("Lutfen kargonuzun agirligini giriniz: ");
        agirlik = scan.nextInt();
        
        if(agirlik <= 0) {
            System.out.print("Hatali tuslama yaptiniz!");
            System.exit(1);
        }

        fiyat = (agirlik * 15);

        System.out.println("Lutfen bir teslimat bolgesi seciniz: ");
        System.out.println("1-Yurtici \n2-Avrupa \n3-Asya");
        int secim = scan.nextInt();

        switch(secim) {
            case 1:
                fiyat += 0;
                break;
            case 2:
                fiyat += 150;
                break;
            case 3:
                fiyat += 250;
                break;
            default: 
                System.out.println("Hatali giris yaptiniz!");
                System.exit(1);
        }
        if(fiyat >= 500) {
            fiyat -= 50;
        }

        System.out.println("Odemeniz gereken toplam tutar: " + fiyat);

        scan.close();
        System.exit(0);
    }
}
