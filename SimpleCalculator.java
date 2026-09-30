import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float sonuc;

        System.out.print("Lutfen bir sayi giriniz: ");
        float sayi1 = scan.nextFloat();

        System.out.print("Bir sayi daha giriniz: ");
        float sayi2 = scan.nextFloat();

        System.out.println("Lutfen yapmak istediginiz islemin sayi karsiliğini tuslayiniz: ");
        System.out.println("1-Toplama \n2-Cikarma \n3-Carpma \n4-Bolme");
        while(true) {
            int secenek = scan.nextInt();
            if(secenek > 4 || secenek < 1) {
                System.out.println("Hatali islem sectiniz, tekrar deneyin...");
                continue;
            }
            switch(secenek) {
                case 1:
                    sonuc = (sayi1 + sayi2);
                    System.out.print("Isleminizin sonucu: " + sonuc);
                    break;
                case 2:
                    sonuc = (sayi1 - sayi2);
                    System.out.print("Isleminizin sonucu: " + sonuc);
                    break;
                case 3:
                    sonuc = (sayi1 * sayi2);
                    System.out.print("Isleminizin sonucu: " + sonuc);
                    break;
                case 4:
                    if(sayi2 == 0) {
                        System.out.print("Sifira bolum tanimsizdir!");
                        break;
                    }else {
                        sonuc = (sayi1 / sayi2);
                        System.out.print("Isleminizin sonucu: " + sonuc);
                        break;
                    }
                    
            }
            break;
        }
        scan.close();
        System.exit(0);
    }
    
}
