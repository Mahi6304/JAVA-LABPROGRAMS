class Animal {
    public void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking.");
    }
}

class Labrador extends Dog {
    public void run() {
        System.out.println("Labrador is running.");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Labrador labrador = new Labrador();
        labrador.eat();  // Inherited from Animal class
        labrador.bark(); // Inherited from Dog class
        labrador.run();  // Defined in Labrador class
    }
}
