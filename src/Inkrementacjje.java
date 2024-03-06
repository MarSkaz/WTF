import java.util.Scanner;

public class Inkrementacjje {

    Integer Pierwszy = 1;
    Integer Drugi = 2;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        System.out.println("Podaj wartosc");
//        Integer jeden = scan.nextInt();
//
//        System.out.println("Wartosc jeden to: " + jeden);
//        Integer dwa = ++jeden;
//        System.out.println("Wartosc dwa to: " + dwa);
//        Integer trzy = ++dwa;
//        System.out.println("Wartosc trzy to: " + trzy);
//        Integer cztery = trzy++;
//        System.out.println("Wartosc cztery to: " + cztery);
//        Integer piec = cztery++;
//        System.out.println("Wartosc piec to: " + piec);



        int a = 0;
        System.out.println(a);
        int b = a++;
        System.out.println(b);
        System.out.println(a);
        int c = ++a;
        System.out.println(c);
        System.out.println(a);

        int d = --a;
        System.out.println(d);
        System.out.println(d);
    }

}

