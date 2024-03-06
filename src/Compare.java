import java.util.Scanner;

public class Compare {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj liczbe pierwsza: ");
        int one = scan.nextInt();
        System.out.println("Podaj liczbe druga: ");
        int two = scan.nextInt();

        boolean result = false;
        System.out.println(result + " : To wynik");

        System.out.println(one > two);
        System.out.println(one < two);
        System.out.println(one == two);


    }




}
