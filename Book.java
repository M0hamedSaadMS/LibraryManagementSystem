public class Book {

    private int id;
    private String name;
    private String author;
    private boolean isBorrowed;
    private String type;

    public void setId (int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public boolean isBorrowed() {
        return isBorrowed;
    }
    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
    public void setType (String type){
        this.type=type;
    }
    public String getType(){
        return type;
    }
    public Book(){}
    public Book (String name , String author , int id, String type , boolean isBorrowed){
        this.name=name;
        this.id=id;
        this.type=type;
        this.author=author;
        this.isBorrowed=isBorrowed;
    }
    public void displayInfo(){
        System.out.println("Book Name : "+name);
        System.out.println("Book Id : "+id);
        System.out.println("Book Type : "+type);
        System.out.println("Book Author : "+author);
        System.out.println("Borrowed : "+isBorrowed);
        System.out.println("============================");
    }
    public void displayInfoParameter(){
        displayInfo();
    }
}