public class testShelf {
    public static void main(String[] args) {
        Shelf s = new Shelf();
        Book b = new Book("Book1", "Author1");
        DVD d = new DVD("DVD1", 2000);
        s.addItem(b);
        s.addItem(d);
        s.removeItem(b);
    }
}
