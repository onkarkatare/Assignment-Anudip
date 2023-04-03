package inheritence;

class Vehicle { // parent class A
    void running() {
        System.out.println("Sports mode on-Class A");
    }
}

class Car extends Vehicle { // child class B whose parent class is Vehicle 
    void run() {
        System.out.println("Heater on-Class B");
    }
}

class ferary extends Car { // child class C whose parent class is Car 
    void speed() {
        System.out.println("It is a Lamborgini-Class C");
    }
}

public class MultilevelIn {
    public static void main(String[] args) {
        ferary d = new ferary(); // creating object
        d.running();
        d.run();
        d.speed();
    }
}

