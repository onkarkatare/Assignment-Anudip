package assignment;

class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void speak() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}

class Student extends Person {
    private int grade;
    
    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }
    
    public void study() {
        System.out.println("I am currently studying in grade " + grade + ".");
    }
}

class marks {
    public static void main(String[] args) {
        Student s = new Student("John Wick", 19, 12);
        s.speak();
        s.study();
    }
}

