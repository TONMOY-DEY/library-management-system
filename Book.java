package Lmanagment;

public class Book {
    private String bookId;
    private double price;

    public Book(){
        System.out.println("............");
    }
    public Book(String bookId,double price){
        this.bookId=bookId;
        this.price=price;
    }
    public void setbookId(String bookId){
        this.bookId=bookId;
    }
    public String getbookId(){
        return bookId;
    }
    public void setprice(double price){
        this.price=price;
    }
    public double getprice(){
        return price;
    }
    public void display(){
        System.out.println("Book id is:"+bookId);
        System.out.println("Book price is:"+price);
    }

    
}
