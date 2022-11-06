package lekcijaCetri.majasDarbs.labDarbs;

public class Main {
    public static void main(String[] args) {
        Cat muris = new Cat();
        Dog reksis = new Dog();

        Cow govs = new Cow();

        muris.breathe();
        reksis.breathe();
        muris.makeSound();
        reksis.makeSound();
        muris.eat();
        reksis.eat();
        muris.canClimbeTrees = true;
    }
}
