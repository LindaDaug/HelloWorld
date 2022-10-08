//package lekcijaDivi.labDarbs;
//
//import java.util.Scanner;
//
//public class LekcijaDiviLabDarbs {
//    public static void main(String[] args) {
////lielāks
//        int x = 3;
//        int y = 2;
//        System.out.println(x > y);
//        y = 5;
//        System.out.println(x > y);
////mazāks
//        x = 5;
//        y = 3;
//        System.out.println(x < y);
//        y = 10;
//        System.out.println(x < y);
//        //vienāds
//        x=4;
//        y=5;
//        System.out.println(x == y);
////stringu salīdzināšana
//        String luksaforaKrasa = "green";
//        System.out.println(luksaforaKrasa.equals("green"));
//        System.out.println(luksaforaKrasa.equals("red"));
//        //System.out.println(!luksaforaKrasa.equals("red"));
//
//        //nav vienāds !=
//        System.out.println(x != y);
//        System.out.println(!luksaforaKrasa.equals("red"));
////lielaks vienads
//        int vecums = 18;
//        System.out.println("Vai cilvēks var balsot(kļūdains vairants)?" + (vecums > 18));
//        System.out.println("Vai cilvēks var balsot?" + (vecums >= 18));
//
//        //loģiskie nosacijumi
//        System.out.println(x<4 && y>=5);
//        System.out.println(x<=4 || y>6);
////nosacijumi if
//        int age= 18;
//        System.out.println("paskaties cilvēka pasē");
//        if (age >= 18) {
//            System.out.println("drīkst balsot");
//        }
//        System.out.println("tālākās darbības");
//
//        int age2 = 18;
//        boolean hasVoted = false;
//
//        System.out.println("Paskaties cilvēka pasē");
//        if (age2 >= 18 && hasVoted==false) {
//            System.out.println("Drīkst balsot");
//        }
//
//        //es aizeju un nobalsoju
//        hasVoted = true;
//
//        if (age2 >= 18 && hasVoted==false) {
//            System.out.println("Drīkst balsot");
//        }else{
//            System.out.println("nedrīkt balsot!");
//        }
//
//        System.out.println("tālākās darbības");
//
//        //pārbaudīt vai skaitlis ir
//        int skaitlis = -5;
//
//        if (skaitlis<0){
//            System.out.println("Negatīvs");
//        }
//
//        System.out.println("ievadisim skaitli");
//        int i = 17;
//        if (i== 10) {
//            System.out.println("skaitlis ir 10");
//        } else if (i == 15) {
//            System.out.println("skaitlis ir 20");
//        } else if (i == 20) {
//            System.out.println("skaitlis ir 20");
//        } else {System.out.println("nav neviens");}
//
//        int monthNumber= 4;
//        switch (monthNumber){
//            case 1:System.out.println("Janvāris");
//                break;
//            case 2:
//                System.out.println("Februaris");
//                break;
//            case 3:
//                System.out.println("Marts");
//                break;
//            case 4:
//                System.out.println("Aprilis");
//                break;
//            default:
//                System.out.println("Šāds menesisneeksistē");
//
//        }
//
//
//
//
//        // KODS - LUKSOFORS
//        //String trafficLight;
//        //System.out.println("Enter traffic light color (red, yellow or green):");
//        Scanner scanner = new Scanner(System.in);
//        //trafficLight = scanner.nextLine();
//
//        //if (trafficLight.equals("red")){
//            //System.out.println("Stay!");
//        //} else if (trafficLight.equals("yellow")) {
//            //System.out.println("Wait!");
//       // } else if (trafficLight.equals("green")){
//            //System.out.println("Go!");
//        //} else {
//            //System.out.println("Wrong color!");
//        //}
////noteikt vai ievadītais skaitlis ir pāra vai nepāra skaitlis
//        int number = scanner.nextInt();
//        //te uzrakstīt kodu, kurš izvada vai skaitlis ir para vai nepara
//        if (number % 2 == 0) {
//            System.out.println(number + " ir pāra skaitlis");
//        } else {
//            System.out.println(number + " ir nepāra skaitlis");
//        }
//
//        int number3 = scanner.nextInt();
//        if (number3 >=0) {
//            System.out.println("pozotīvs");
//        }
//
//        //String animal = "DOG";
//        //String result;
//        //switch (animal) {
//            //case "DOG":
//            //case "CAT":
//                //result = "Domestic animal";
//                //break;
//            //case "TIGER":
//                //result = "Wild animal";
//            //default:
//                //result = "Unknown animal";
//        }
//
//    }
//
//    }
//
//
////        Scanner scanner = new Scanner (System.in);
////        System.out.println("Hello lekcija 2");
////
////        int vecums;
////        System.out.println("Kā tevi sauc?");
////        String name = scanner.nextLine();
////        System.out.println("Labdien, " + name + " !. Esi sveicināts/a manā programmā");
////
////        System.out.println("Ievadi cilveka vecumu...");
////        vecums = scanner.nextInt();
//
//
//
//
//
//
//
