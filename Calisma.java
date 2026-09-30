import java.util.Scanner;

public class Calisma {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Lutfen sinav notunuzu giriniz: ");
    int sinavNotu = scan.nextInt();

    if(sinavNotu > 100 || sinavNotu < 0) {
        System.out.println("Gecersiz bir not araligi girdiniz!!");
        System.exit(1);
    }

    if (sinavNotu <= 100 && sinavNotu >= 90) {
        System.out.print("Harf Notunuz: AA");
    }else if (sinavNotu < 90 && sinavNotu >= 80) {
        System.out.print("Harf Notunuz: BA");
    }else if (sinavNotu < 80 && sinavNotu >= 70) {
        System.out.print("Harf Notunuz: BB");
    }else if (sinavNotu < 70) {
        System.out.println("Dersten kaldiniz");
    }


    scan.close();
    }
}
