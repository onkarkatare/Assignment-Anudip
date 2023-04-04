package assignment;

class Book {
    String name;
    int price;
    Author author;
    Publisher publisher;

    public Book(String name, int price, Author author, Publisher publisher) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.publisher = publisher;
    }

    public void display() {
        System.out.println("Book name: " + name);
        System.out.println("Book price: " + price);
        System.out.println("---------------------Author Details------------------------");
        System.out.println("Author Name: " + author.name);
        System.out.println("Author Age: " + author.age);
        System.out.println("Author Place: " + author.place);
        System.out.println("---------------------Publisher Details------------------------");
        System.out.println("Publisher Name: " + publisher.name);
        System.out.println("Publisher ID: " + publisher.id);
        System.out.println("Publisher City: " + publisher.city);
    }
    public static void main(String[] args) {
        Author author = new Author("Micheal", 32, "USA");
        Publisher publisher = new Publisher("Sun Publisher", "ABC-1110", "London");
        Book book = new Book("Core Java", 800, author, publisher);
        book.display();
    }
}

