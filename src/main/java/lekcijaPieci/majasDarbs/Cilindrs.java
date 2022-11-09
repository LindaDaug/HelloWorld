package lekcijaPieci.majasDarbs;

public class Cilindrs {

        private int r;
        private int h;

    double PI = 3.14;
        public Cilindrs(int r, int h) {
            this.r = r;
            this.h = h;
        }

        public Cilindrs() {
        }

        public int getR() {
            return r;
        }

        public void setR(int r) {
            this.r = r;
        }

        public int getH() {
            return h;
        }

        public void setH(int h) {
            this.h = h;
        }
        //pi*(r*r)*h
public double cilindraTilpums ()
{
    return PI*(r*r)*h;
}
public void printTilpums(){
    System.out.println(cilindraTilpums());
}

public double cilindraPamataLaukumi () {return 2*(PI*(r*r)); }
public double cilindraSānuVirsma ( ) {return 2*PI*r*h; }
    public double cilindraVirsmaslaukums ()
    {
return cilindraPamataLaukumi()+ cilindraSānuVirsma();
    }
    public void printCilindraVirsmasLaukums(){
        System.out.println((cilindraVirsmaslaukums()));
    }

    }

