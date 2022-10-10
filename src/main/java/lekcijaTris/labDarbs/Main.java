package lekcijaTris.labDarbs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sākās programma");
        printCard2("Pēteris","Kalniņš", "Preiļi", 56 );
        printCard2("Juris","Mazkalniņš", "Alūksne", 55 );
        printCard2("Pēteris","Lielkalniņš", "Kuldīga", 54 );
        printCard();
        printNewLine();
        printCard();
        System.out.println("Beidzās programma");
        int laukums = aprekinatTaisnsturaLaukumu(3, 10);
        System.out.println("Laukums ir : " + laukums);

        int [] monthlyCosts = {100,400,50,60,70,30};
        System.out.println("Masiva garums ir:" + monthlyCosts.length);
        String [] produktuSaraksts = {"piens", "maize", "salati", "olas", "siers"};
        System.out.println(produktuSaraksts[0]);
        System.out.println(produktuSaraksts[2]);
        produktuSaraksts[2] = "desa";
        System.out.println(produktuSaraksts[2]);

        String[] cars = {"Volvo","BMW","Nissan","Mercedes"};
        System.out.println("Masiva garums ir:" + cars.length);

        String[] studentuSaraksts = new String[23];
        studentuSaraksts[0] = "Jānis Bērziņs";
        studentuSaraksts[1] = "Juris Kreilis";

        System.out.println(  studentuSaraksts[0]);
        System.out.println(  studentuSaraksts[1]);
        System.out.println(  studentuSaraksts[2]);



        int [] menesiGada = new int[12];
        menesiGada[0]=1;

        whilecikls ();


    }
    public static void whilecikls(){
        int x = 5;
        while (x > 0) {
            System.out.println("X nav nulle, X = " + x);
            x= x-1; //x-- vai x++, ja x= x+1
        }
        String[] cars = {"Volvo", "BMW", "Nissan", "Mercedes"};

        System.out.println("kods sākās");
        int z = 0;
        while (z < 4) {
            System.out.println(cars[z]);
            z = z + 1;
        }

        System.out.println("kods turpinās");


        //uzdevums - izprintēt visus skaitlus no menesa tēriņi masīva uz ekrāna
        int[] menesaTerini = {100, 40, 23, -44, 55, 200};
        int t = 0;
        while (t < 6) { //(t <menesaTerini.lenght
            System.out.println(menesaTerini[t]);
            t++;
        }

        //uzdevums 2 - pieprasīt no lietotāja ievadīt veselu skaitli, kamēr skaitli ir pozitivi
        //saskaitīt tos un izvadīt uz ekrāna summu, ja ir ievadīta 0 vai negatīvs(Jāizmanto scanner)



       // Scanner ievade = new Scanner(System.in);
       // System.out.println("Ievadi skaitli...");
       // int number = ievade.nextInt();
       // int summa = 0;
        //while (number > 0) {
            //summa = summa + number;
           // System.out.println("Ievadi skaitli...");
           // number = ievade.nextInt();
       // }
        //System.out.println("summa ir:" + summa);



            String[] kartis = {"Pīķa dūzis", "Ercena kalps", "Kreiča dūzis"};
            for (int i = 0; i< kartis.length; i++)
                System.out.println(kartis[i] + " ");


        int q = 0;
        do {
            System.out.println("TEST TEST TEST");
            q++;
        } while (q < 10);

        //Scanner scanner = new Scanner(System.in);
      //  String parole = "SuperSecretPassword123";
       // String ievaditaParole;
       // do {
           // System.out.println("Ievadi paroli");
          //  ievaditaParole = scanner.next();
           // System.out.println("Pārbaudām paroli");
       // } while (!ievaditaParole.equals(parole));

        //System.out.println("Pareiza parole");

        String[] kartis2 = {"Pīķa dūzis", "Ercena kalps", "Kreiča dāma"};

        for (int j = 0; j < kartis2.length; j++) {
            System.out.println(kartis2[j]);
        }

        for (int v = 0; v <= 20; v = v + 2) {
            System.out.println(v);
        }
long [] telefonaNumuri = {123123,12341234, 1234565, 1234568};
        for (long numuri:telefonaNumuri){
            System.out.println(numuri);

    }
//mājas numuri 1-50
        int count = 0;
        for (int j = 1; j <= 50; j++) {
            if (!(j % 3 == 0 || j % 5 == 0)) {
                count++;
            }
        }
        System.out.println("der" + count + "māju numuri");


        //vards

        char [] name1 = {'L','i','n','d','a'};
        for (char letter :name1) {
            System.out.println(letter);
        }

        char[] vards = {'G','u','n','a'};
        for (char burts: vards){
            System.out.print(burts);
        }









    }
    public static int aprekinatTaisnsturaLaukumu (int platums, int garums){
        return platums * garums;

    }

    public static void printNewLine() {
        System.out.println("\n");
    }

    public static void printCard() {

        System.out.println("@@@@@@@@@@@@@");
        System.out.println("JURIS KREILIS");
        System.out.println("Rīga");
        System.out.println("$$$$$$$$$$$$$");
    }

    public static void printCard2(String vards, String uzvards, String pilseta, int vecums) {

        System.out.println("@@@@@@@@@@@@@");
        System.out.println(vards + " " + uzvards);
        System.out.println(pilseta);
        System.out.println("Vecums:" + vecums);
        System.out.println("$$$$$$$$$$$$$");
    }



}
