package lekcijaCetri.labDarbs;

public class Rinkis {
    double r;
    final double PI = 3.14;

    public Rinkis(double r) {
        this.r = r;
    }

    public double rekinatLaukumu (){
        return r*r*3.14;
    }

    public double rekinatLinGarumu() {
        return 2*PI*r;
    }
}

