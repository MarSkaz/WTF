import java.util.Scanner;

public class Logic {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean firstValue = true;
        boolean secValue = false;
        boolean thirdValue = false;
        boolean fourthValue = true;

        System.out.println(firstValue && secValue);
        System.out.println(firstValue && fourthValue);
        System.out.println(firstValue || fourthValue);
        System.out.println(firstValue || secValue);
    }



}
