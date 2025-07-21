public class Main {
    public static void main(String[] args) {
        Book normalBook = new Book("The Java Guide", "Alice Smith");
        EBook digitalBook = new EBook("Learn Java Fast", "John Doe", 5.2);

        normalBook.borrow();
        normalBook.borrow();
        normalBook.returnBook();

        System.out.println();

        digitalBook.borrow();
    }
}
