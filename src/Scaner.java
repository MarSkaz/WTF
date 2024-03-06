import java.util.Scanner;

public class Scaner {

    public static void main(String[] args) {

        Scanner scan =  new Scanner(System.in);

        System.out.println("Podaj Swoje Imie: ");
        String imie = scan.nextLine();

        System.out.println("Podaj liczbe kilometrow: ");
        Double KM = scan.nextDouble();
        System.out.println("Podaj koszt 1 Litra paliwa: ");
        Double koszt_paliwa = scan.nextDouble();
        System.out.println("Podaj spalanie na 100 km: ");
        Double spalanie = scan.nextDouble();

        System.out.println(imie +", Twoj Koszt przejazdu to: " + KM * koszt_paliwa * spalanie/100 + " zł");

    }
}
