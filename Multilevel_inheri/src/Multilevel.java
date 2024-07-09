// Parent class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Intermediate class
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Child class
class Puppy extends Dog {
    void weep() {
        System.out.println("The puppy weeps.");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.eat(); // Inherited from Animal
        puppy.bark(); // Inherited from Dog
        puppy.weep(); // Method of Puppy class
    }
}
