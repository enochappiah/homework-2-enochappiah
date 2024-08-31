public class DVD extends Item {
    private int year;

    public DVD(String name, int year) {
        super(name);
        this.year = year;
    }


    public int getYear() {
        return year;  
    }
}
