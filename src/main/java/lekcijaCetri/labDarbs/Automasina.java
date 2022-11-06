package lekcijaCetri.labDarbs;

public class Automasina {
    String marka = "Audi";
    String krāsa = "dzeltena";
    int nobraukums = 30000;
    int speed= 0;
    boolean vaiIrTehniska = true;

    public void printSpeed() {
        System.out.println(speed);
    }

    public String toString() {
        return "Automasina{" +
                "marka='" + marka + '\'' +
                ", krāsa='" + krāsa + '\'' +
                ", nobraukums=" + nobraukums +
                ", speed=" + speed +
                '}';
    }

    public void paatrinajums() {
        System.out.println("Velo paatrinas");
        speed = speed + 10;
    }


}





//    public void barotKaki(Fish zivs) {
//        if (zivs.species.equals("Renģe")) {
//            System.out.println("Fū, neēdīšu");
//        } else if (zivs.species.equals("Lasis")) {
//            vaiIzsalcis = false;
//        }
//
//    }



