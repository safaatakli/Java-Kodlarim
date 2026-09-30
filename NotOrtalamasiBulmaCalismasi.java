import java.util.Scanner;

class NotOrtalamasiBulmaCalismasi {
    public static void main(String[] args) {
        int vizeNotu, finalNotu, quizNotu;

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen vize notunuzu giriniz: ");
        vizeNotu = input.nextInt();
        System.out.println("Lutfen final notunuzu giriniz: ");
        finalNotu = input.nextInt();
        System.out.println("Lutfen quizden aldiginiz notu giriniz: ");
        quizNotu = input.nextInt();

        if (vizeNotu < 0 || finalNotu < 0 || quizNotu < 0) {
            System.out.println("Hatali not girisi yaptiniz!!!");
            System.exit(1);
        }

        double ortalama;

        ortalama = (quizNotu * 0.15) + (vizeNotu * 0.35) + (finalNotu * 0.50);

        if (ortalama < 60) {
            System.out.println("Sinavi gecemediniz!!!");
            System.out.println("Not ortalamaniz: " + ortalama);
            System.exit(0);
        }
        if (ortalama >= 60) {
            System.out.println("Tebrikler sinavi basariyla gectiniz...");
            System.out.println("Not ortalamaniz: " + ortalama);
            System.exit(0);
        }
    }
}