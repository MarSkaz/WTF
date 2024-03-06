import java.util.Scanner;

public class IF {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj 2 liczby");
        System.out.println("A: ");
        System.out.println("B: ");

        float first = scan.nextInt();
        float sec = scan.nextInt();
        boolean check = first > sec;

        if (check == true) {
            System.out.println("Hej ale nie");
        }
        else if (check == false) {
            System.out.println("Hej ale tak");

        }

    }
}
