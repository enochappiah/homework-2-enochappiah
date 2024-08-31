import java.util.LinkedHashSet;
public class Shelf {
    private LinkedHashSet<Item> items;
    
    public Shelf() {
        items = new LinkedHashSet<>();
    }
    
    public void addItem(Item item) {
        items.add(item);
    }
    
    public void removeItem(Item item) {
        items.remove(item);
    }
    

}
