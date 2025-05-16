package Lmanagment;

public class TextBook extends Book{
    String subject;

    public TextBook(){
        System.out.println("..............");
    }
    public TextBook(String subject,String bookId,double price){
        super(bookId,price);
        this.subject=subject;

    }
    public void setsubject(String subject){
        this.subject=subject;
    }
    public String getsubjext(){
        return subject;
    }
    public void display(){
        super.display();
        System.out.println("Subject is :"+subject);
    }
    

    
}
