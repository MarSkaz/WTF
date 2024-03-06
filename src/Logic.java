import java.util.Scanner;

public class Logic {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean firstValue = true;
        boolean secValue = false;
        boolean thirdValue = false;
        boolean fourthValue = true;

        System.out.println("Podaj liczby A i B");
        System.out.println("A: ");
        int a = scan.nextInt();
        System.out.println("B: ");
        int b = scan.nextInt();

        boolean bol1 = a>b;
        boolean bol2 = b==a;

        System.out.println(firstValue && secValue);
        System.out.println(firstValue && fourthValue);
        System.out.println(firstValue || fourthValue);
        System.out.println(firstValue || secValue);
        System.out.println(!firstValue);

        System.out.println(bol1 && bol2);

    }



}
