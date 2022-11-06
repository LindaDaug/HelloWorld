package lekcijaCetri.majasDarbs.classHomeWork;

//No-arg konstruktors:
public class Trissturis {

    public boolean isVienadmalu;
    public boolean isVienadSanu;
    double malaA;
    double malaB;
    double malaC;

    public Trissturis ()
    {
        System.out.println("Veidojam trīssturi ...");
        malaA = 4;
        malaB = 5;
        malaC = 5;
    }

    public double pusperimetrsP() {
        return (malaA + malaB + malaC) / 2;
    }

    public double trissturisLaukums() {
        return Math.sqrt((pusperimetrsP() * (pusperimetrsP() - malaA) * (pusperimetrsP() - malaB) * (pusperimetrsP()) - malaC));
    }

    public void printLaukums() {
        System.out.println(trissturisLaukums());
    }

    //    //Arg konstruktors
    Trissturis(double malaA, double malaB, double malaC) {
        this.malaA = malaA;
        this.malaB = malaB;
        this.malaC = malaC;
    }
    public boolean isVienadmalu() {
        if (malaA == malaB && malaB == malaC) {
            return true;
        } else {
            return false;
        }
    }

    public boolean  isVienadSanu () {
        if (malaB == malaC || malaC == malaA || malaA == malaB) {
            return true;
        } else {
            return false;
        }


    }
    }


