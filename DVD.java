public class DVD implements Item {
    private String name;
    private int year;

    public DVD(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String getName() {
        return name;   
    }

    public int getYear() {
        return year;  
    }
}
