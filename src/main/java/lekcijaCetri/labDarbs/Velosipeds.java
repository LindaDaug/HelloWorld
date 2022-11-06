package lekcijaCetri.labDarbs;

import java.util.Date;

public class Velosipeds {
    String marka;
    int ramjaIzmers;
    int atrums = 0;
    Date izgatavošanasDatums;
    Velosipeds(){
        System.out.println("Taisām Jaunu VELO!!!!!");
        izgatavošanasDatums = new Date();
    }
    Velosipeds (String marka, int izmers, int atrums){
       {
            izgatavošanasDatums = new Date();
            this.marka = marka;
            this.ramjaIzmers=ramjaIzmers;
            this.atrums=atrums;
        }

    }

    public void printAtrums() {
        System.out.println(atrums);
    }

    public void paatrinajums() {
        System.out.println("Velo paatrinas");
        atrums = atrums + 5;
    }

    public void bremzesana() {
        if (atrums >= 5) {
            System.out.println("Velo Bremze");
            atrums = atrums - 5;
        } else {
            System.out.println("Beidz bremzēt, tu jau stāvi");
        }
    }
}
