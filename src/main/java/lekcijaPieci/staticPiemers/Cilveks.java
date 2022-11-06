package lekcijaPieci.staticPiemers;

public class Cilveks {
    public static int id;
    public String name;

    public Cilveks(String name) {
        this.name = name;
        id++;
    }

    public void printName(){
        System.out.println("Cilveka vards ir: " + name);
    }

}
