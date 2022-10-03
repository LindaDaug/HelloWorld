package lekcijaViens.majasDarbs;

public class FirstClass {
    public static void main(String[] args) {

        String name = "Igaunija";
        System.out.println(name);
        int population = 1329460;
        System.out.println(population);
        int area = 45339;
        System.out.println (area);
        String capital = "Tallina";
        System.out.println(capital);
        String language = "igauņu";
        System.out.println(language);
        boolean isMemberEU = true;
        System.out.println(isMemberEU);
        char currency = '€';
        System.out.println(currency);

        System.out.println(name + " ir valsts Ziemeļeiropā. Tās platība ir "+ area + " kvadrātkilometri, uz kuras dzīvo aptuveni " + population + " iedzīvotāju. \nLielākā daļa iedzīvotāju runā " + language + " valodā. Igaunijas galvaspilsēta ir " + capital + ". Igaunijas valūta no 2011.gada ir " + currency + ".");

        int a = 20;
        int b = 5;
        int result;

        result =a + b;
        System.out.println(result);

        result =a-b;
        System.out.println(result);

        result = a*b;
        System.out.println(result);

        result =a/b;
        System.out.println(result);

        result = (a-b)/b;
        System.out.println(result);

        float x = 14;
        float y = 6;
        float result2 = x/y;
        System.out.println(result2);


    }
}


//Nosaukums
//Iedzīvotājus skaits
//Platība
//Galvaspilsēta
//Oficiāla valoda
//Vai ir ES dalībvalsts
//Valūta (viens simbols)
//Jāuzraksta dažus teikumus par brīvu tēmu izmantojot konkatenāciju
//Jāuzraksta pa trīs piemēriem uz katru aritmētisko operatoru.