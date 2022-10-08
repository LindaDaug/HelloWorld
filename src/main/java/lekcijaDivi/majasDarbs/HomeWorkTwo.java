package lekcijaDivi.majasDarbs;

import java.util.Scanner;

public class HomeWorkTwo {

    public static void main(String[] args) {


        //1.uzdevums
        int x = 6;
        System.out.println(x > 0);
        System.out.println(x < 0);
        System.out.println(x > 5 && x <= 10);
        System.out.println(!(x <= 5) && x < 10);
        System.out.println(x == 0 || x == 10);
        System.out.println(x * x > 10);

        //2.uzdevums
        int menešaNumurs = 1;
        switch (menešaNumurs) {
            case 1:
                System.out.println("Janvāris");
                break;
            case 2:
                System.out.println("Februaris");
                break;
            case 3:
                System.out.println("Marts");
                break;

            default:
                System.out.println("Šāds menesisneeksistē");
        }

        // 3.uzdevums
        int a = 10;
        int b = 20;
        int c = 30;
        if (a >= b && a >= c)
            System.out.println(a);
        else if (b >= a && b >= c)
            System.out.println(b);
        else
            System.out.println(c);

        //4.uzdevums

        String krasa;
        System.out.println("Ievadi luksofora krāsu (sarkana, zaļa vai dzeltena):");
        Scanner scanner = new Scanner(System.in);
        krasa = scanner.nextLine();
        if (krasa.equals("sarkana")) {
            System.out.println("Stāvi!");
        } else if (krasa.equals("dzeltena")) {
            System.out.println("Gaidi!");
        } else if (krasa.equals("zaļa")) {
            System.out.println("Vari iet!");
        } else {
            System.out.println("nepareiza krāsa!");
        }
// 5.uzdevums
        printBusinessCard();

        //6.uzdevums

        printBusinessCardTwo("LĪga", "Kalniņa","371 12341234", 1988);
        printBusinessCardTwo("Juris", "Krūmiņš","371 12312345", 1989);
    }

    public static void printBusinessCardTwo(String name, String surname, String phone, int dateOfbirth) {
        System.out.println("Vīzītkarte"+ "\n###########" + "\nVārds: " + name + "\nUzvārds:" + surname + "\nTelefons: " + phone + "\nDzimšanas gads: " + dateOfbirth + "\n############");
    }


    public static void printBusinessCard() {
        int i = 0;
        while (i < 3) {

            String card = "Vizitkarte";
            System.out.println(card);
            String reste = "##########";
            System.out.println(reste);
            String name = "Janis";
            System.out.println("Vārds: " + name);
            String surname = "Bērziņš";
            System.out.println("Uzvārds: " + surname);
            String telephone = "+371 12345678";
            System.out.println("Telefona numurs: " + telephone);
            String birthYear = "1990";
            System.out.println("Dzimšanas gads: " + birthYear);
            System.out.println(reste);
            i++;

        }
    }
}

