import java.util.Scanner;

public class DaireAlanHacimHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double pi = 3.14;
        double r, alan, cevre;

        System.out.println("Dairenin yariçapini giriniz: ");
        r = input.nextInt();

        alan =  pi * (r * r);

        cevre = 2 * pi * r;

        System.out.println("Dairenin çevresi : " + cevre);
        System.out.println("Dairenin alani : " + alan);

        System.exit(0);
        input.close();

        
        

    }
}
