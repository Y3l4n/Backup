package dsai.DigitalVideoDisc;


public class DigitalVideoDisc {

    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private static int nbDigitalVideoDisc = 0;
    private int id;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCategory() {
        return category;
    }
    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
    public float getCost() {
        return cost;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
        nbDigitalVideoDisc++;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbDigitalVideoDisc++;
    }

    
    public DigitalVideoDisc(String title, String category, float cost, int id) {
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = id;
        nbDigitalVideoDisc++;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        nbDigitalVideoDisc++;
    }
    
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        nbDigitalVideoDisc++;
    }
    
    public DigitalVideoDisc(String title, String category, String director, int length, float cost, int id) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        this.id = id;
        nbDigitalVideoDisc++;
    }
    
    @Override
    public String toString(){
        String output = title + " - " + category + " - " + director + " - " + length + ": " + cost;
        return output;
    }
}