import java.util.Scanner;

public class ATMParaCekme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Lutfen hesabinizdaki bakiyeyi giriniz: ");
        int bakiye = scan.nextInt();
        System.out.print("Lutfen cekmek istediginiz tutari giriniz: ");
        int tutar = scan.nextInt();

        if(bakiye < 0 || tutar < 0) {
            System.out.println("Hatali degerler tusladiniz");
            System.exit(1);
        }

        if(tutar > bakiye) {
            System.out.print("Yetersiz bakiye!");
            System.exit(1);
        }
        if(tutar %10 != 0) {
            System.out.println("Girdiginiz tutar 10'un katlari olmak zorundadir!");
            System.exit(1);
        }else{
            System.out.println("Isleminiz basariyla gerceklestirilmistir");
            int kalanBakiye = (bakiye - tutar);
            System.out.println("Kalan bakiye: " + kalanBakiye);
        }
       
        scan.close();
        System.exit(0);
    }
    
}
