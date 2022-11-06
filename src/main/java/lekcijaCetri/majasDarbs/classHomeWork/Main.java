package lekcijaCetri.majasDarbs.classHomeWork;

public class Main {
    public static void main(String[] args) {
        Trissturis pirmaisTrissturis = new Trissturis();


        System.out.println(pirmaisTrissturis.pusperimetrsP());
        pirmaisTrissturis.printLaukums();

        System.out.println("Vienadsānu : "+ pirmaisTrissturis.isVienadSanu());
        System.out.println("Vienādmalu : " +pirmaisTrissturis.isVienadmalu());

Trissturis otraisTrissturis = new Trissturis( );
otraisTrissturis.malaA =7;
otraisTrissturis.malaB =7;
otraisTrissturis.malaC =7;

        System.out.println("Vienadsānu : "+ pirmaisTrissturis.isVienadSanu());
        System.out.println("Vienādmalu : " +pirmaisTrissturis.isVienadmalu());
    }

    }

