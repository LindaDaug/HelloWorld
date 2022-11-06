package lekcijaPieci;

public class House {
    private int stavuDaudzums;
    private int loguSkaits;
    private int durvjuSkaits;
    private String adrese;
    private double griestuAugstums;
    private long kadastralaVertiba;
    private boolean vaiPrivatipasums;

    public House(int stavuDaudzums, int loguSkaits, int durvjuSkaits, String adrese, double griestuAugstums, long kadastralaVertiba, boolean vaiPrivatipasums) {
        this.stavuDaudzums = stavuDaudzums;
        this.loguSkaits = loguSkaits;
        this.durvjuSkaits = durvjuSkaits;
        this.adrese = adrese;
        this.griestuAugstums = griestuAugstums;
        this.kadastralaVertiba = kadastralaVertiba;
        this.vaiPrivatipasums = vaiPrivatipasums;
    }

    public String printHouse() {
        return "House{" +
                "stavuDaudzums=" + stavuDaudzums +
                ", loguSkaits=" + loguSkaits +
                ", durvjuSkaits=" + durvjuSkaits +
                ", adrese='" + adrese + '\'' +
                ", griestuAugstums=" + griestuAugstums +
                ", kadastralaVertiba=" + kadastralaVertiba +
                ", vaiPrivatipasums=" + vaiPrivatipasums +
                '}';


//        public void printHouse() {
//            System.out.println("House{" +
//                    "stavuDaudzums=" + stavuDaudzums +
//                    ", loguSkaits=" + loguSkaits +
//                    ", durvjuSkaits=" + durvjuSkaits +
//                    ", adrese='" + adrese + '\'' +
//                    ", griestuAugstums=" + griestuAugstums +
//                    ", kadastralaVertiba=" + kadastralaVertiba +
//                    ", vaiPrivatipasums=" + vaiPrivatipasums +
//                    '}');
        }

    }


