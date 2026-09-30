import java.util.Scanner;

public class UcgenBulma {
    public static void main(String[] args) {
        int kenar1, kenar2, kenar3;
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir ucgenin uc kenarini giriniz: ");
        kenar1 = scan.nextInt();
        kenar2 = scan.nextInt();
        kenar3 = scan.nextInt();

        if(kenar1 <= 0 || kenar2 <= 0 || kenar3 <= 0) {
            System.out.println("Hatali tanimlama yaptiniz");
            System.exit(1);
        }

        if (kenar1 == kenar2 && kenar1 ==kenar3 && kenar2 == kenar3) {
            
            System.out.println("Bu ucgen eskenar ucgendir");
        }else if (kenar1 == kenar2 || kenar1 == kenar3 || kenar2 == kenar3) {
            System.out.println("Bu ucgen ikizkenar ucgendir");
        }else {
            System.out.println("Bu ucgen cesitkenar ucgendir");
        }

        scan.close();
        System.exit(0);

    }
    
}
