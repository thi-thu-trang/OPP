package Test1;

public class Book implements IBook {

    private int ID;
    private String Name;
    private String PublishDate;
    private String Author;
    private String Language;
    private float AveragePrice;

    public Book() {

    }

    public Book(int id, String Name, String PublishDate, String Author, float AveragePrice) {
        super();
        this.ID = id;
        this.Name = Name;
        this.PublishDate = PublishDate;
        this.Author = Author;
        this.AveragePrice = AveragePrice;

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public float getAveragePrice() {
        return AveragePrice;
    }

    public void setAveragePrice(float averagePrice) {
        AveragePrice = averagePrice;
    }

    @Override
    public void displaỵ() {
        System.out.println("Id: " + this.ID +
                " Name: " + this.Name +
                " Launguage: " + this.Language +
                " publishDate" + this.PublishDate +
                " Author: " + this.Author +
                " AveragePrice: " + this.AveragePrice);
    }
}
