public class EBook extends Book {
    private double fileSize;

    public EBook(String title, String author, double fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }

    @Override
    public void borrow() {
        System.out.println(getTitle() + " is now downloading... (File size: " + fileSize + "MB)");
    }
}
