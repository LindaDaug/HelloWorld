package lekcijaViens.labDarbs;

public class Main {
    public static void main(String[] args) {
    //int integer satur veselu skaitli
        int vecums = 34;
        System.out.println("Mans vecums ir");
        System.out.println(vecums);
        int vecums2 = 66;
        System.out.println("Mans vecums ir:" + vecums2);
        int garums = 180;
        System.out.println("Mans garums ir:" + garums);
        int kurpjuIzmers = 40;
        System.out.println("Mans kurpju izmers ir:" + kurpjuIzmers);
        int darbaStazs = 10;
        System.out.println("Mans darba stazs ir:" + darbaStazs);
        int svars = 80;
        System.out.println("Mans svars ir:" + svars);

        System.out.println("VECUMS:" + vecums + "\nGARUMS: " + garums + "\nKurpju izmers:" + kurpjuIzmers);

        String name = "Reksis";
        String teksts = "Suņa vards:";
        System.out.println(name);
        System.out.println("Suņa vārds ir " + name);
        System.out.println(teksts + name);

        //Maksimālā integer vērtība
        int maxInt = 2147483647;
        //Min integer vērtība
        int minInt = -2147483648;


        int temperatura = -10;
        System.out.println("Ziemā būs: " + temperatura);

        //pieņem veselu skaitli no -127 līdz +127
        byte vecumsDivi = 99;

        short latvijasMazpilseta = 17000;



        double grauduSvars = 150.3;
        System.out.println("Tika pārdoti  " + grauduSvars + "kg graudi");


        //Šodien ir sestdiena, lielveikals ir atvērts
        boolean isSuperMarketOpen = true;
        //Turpretīm skolas ir slēgtas
        boolean isSchoolOpen = false;

        System.out.println("Vai veikals ir atvērts?" + isSuperMarketOpen);

        int a = 5;
        int b = 10;
        int summa;
        summa = a + b;


        System.out.println(summa);

        summa = a + a;

        System.out.println(summa);

        String name1 = "Juris";
        System.out.println(name1);
        name1 = "Janis";
        System.out.println(name1);

        int x= 10;
        int y = -45;
        int rezultats = x + y;
        System.out.println(rezultats);

        rezultats = x - y;
        System.out.println(rezultats);

        rezultats = x * y;
        System.out.println(rezultats);

        rezultats = x / y;
        System.out.println(rezultats);

        rezultats = 10/2;
        System.out.println(rezultats);

        rezultats = 11%2;
        System.out.println(rezultats);

        rezultats = 5*(3+7);
        System.out.println(rezultats);







    }
}
