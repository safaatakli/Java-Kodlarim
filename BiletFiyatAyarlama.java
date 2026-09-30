import java.util.Scanner;

public class BiletFiyatAyarlama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int biletfiyati = 100;
        int bilet;
        
        System.out.println("Lutfen yasinizi giriniz: ");
        int yas = scan.nextInt();
        bilet = biletfiyati;

        if(yas < 18) {
            bilet = (biletfiyati - 10);
        }else if(yas >= 18 && yas < 65) {
            bilet = (biletfiyati - 20);
        }

        System.out.println("Lutfen bir film turu seciniz: ");
        System.out.println("1-Aksiyon \n2-Komedi \n3-Korku");
        int secim = scan.nextInt();

        if(secim > 3 || secim < 1) {
            System.out.println("Hatali giris yaptiniz!");
            System.exit(1);
        }
        
        switch(secim) {
            case 1:
                bilet += 20;
                break;
            case 2:
                bilet += 0;
                break;
            case 3:
                bilet += 10;
                break;
        }
        System.out.println("Odemeniz gereken toplam fiyat: " + bilet);
        scan.close();
        System.exit(0);
    }

    
}
