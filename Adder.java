package inheritence;

class Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {
    public static void main(String[] args) {
        Adder ob = new Adder(); // Create an object of Adder class
        System.out.println(ob.add(5, 7)); // Call add() method on Adder object and print the result
    }
}

