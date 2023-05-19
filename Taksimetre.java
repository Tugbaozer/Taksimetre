import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km;
        double perkm = 2.20, acilis = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden yazınız : " );
        km = input.nextInt();

        acilis += km * perkm;


        acilis = (acilis < 20) ? 20 : acilis;
        System.out.println("Toplam tutar : " + acilis);
    }
}
