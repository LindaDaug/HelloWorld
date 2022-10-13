package lekcijaTris.majasDarbs;

import java.awt.*;
import java.util.Scanner;

public class LoopHomeWork {

    public static void main(String[] args) {

//1.uzdevums

        Scanner ievade = new Scanner(System.in);

         int number;
         int summa = 0;
        while (summa < 100) {

        System.out.println("Ievadi skaitli...");
        number = ievade.nextInt();
            summa = summa + number;

        }
        System.out.println("Gatavs");
        System.out.println("\n##################");

//2.uzdevums

        int [] kurpjuIzmeri = {36,37,38};
        String [] klientuVardi = {"Andris", "Ieva", "Zane"};
        char [] simboluSaraksts = {'#', '%', '&'};

        //While loop
        int index1 = 0;
        while (index1 < kurpjuIzmeri.length) {
            int izmeri = kurpjuIzmeri[index1];
            System.out.println(izmeri);
            index1++;
        }
        int index2 = 0;
        while (index2 < klientuVardi.length) {
            String vardi = klientuVardi[index2];
            System.out.println(vardi);
            index2++;
        }
        int index3 = 0;
        while (index3 < simboluSaraksts.length) {
            char simboli = simboluSaraksts[index3];
            System.out.println(simboli);
            index3++;
        }
        System.out.println("\n#######################");

        // do while
        int a= 0;
        do {
            int izmeri = kurpjuIzmeri[a];
            System.out.println(izmeri);
            a++;
        }
        while (a < kurpjuIzmeri.length);

        int b= 0;
        do {
            String vardi = klientuVardi[b];
            System.out.println(vardi);
            b++;
        }
        while (b< klientuVardi.length);

        int c = 0;
        do{
            char simboli = simboluSaraksts[c];
            System.out.println(simboli);
            c++;
        }
        while (c < simboluSaraksts.length);
        System.out.println("\n#######################");

        //for

        for (int j = 0; j < kurpjuIzmeri.length; j++) {
            System.out.println(kurpjuIzmeri[j]);
        }

        for (int j = 0; j < klientuVardi.length; j++) {
            System.out.println(klientuVardi[j]);
        }
        for (int j = 0; j < simboluSaraksts.length; j++) {
            System.out.println(simboluSaraksts[j]);
        }
        System.out.println("\n#######################");

         //for each

        for (int izmers : kurpjuIzmeri) {
            System.out.println(izmers);
        }
        for (String klients : klientuVardi) {
            System.out.println(klients);
        }
        for (char simbols : simboluSaraksts) {
            System.out.println(simbols);
        }
        System.out.println("\n#######################");

        //3.uzdevums


        for (int j = 0; j <= 100; j++) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }


        }
        System.out.println("\n######## Majas darba nobeigums ###############");
;
    }

}










