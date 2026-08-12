interface Swimmer {
    void swim();
}

interface Flyer {
    void fly();
}

class Duck implements Swimmer, Flyer {
    public void swim() {
        System.out.println("The duck swims.");
    }

    public void fly() {
        System.out.println("The duck flies.");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.swim();
        duck.fly();
    }
}
