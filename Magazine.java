package Lmanagment;

public class Magazine extends Book {
    private int issuNumber;

    public Magazine(){
        System.out.println("..................");
    }
    public Magazine(int issuNumber,String bookId,double price){
        super(bookId,price);
        this.issuNumber=issuNumber;

    }
    public void setissueNumber(int issuNumber){
        this.issuNumber=issuNumber;
    }
    public int getissuNumber(){
        return issuNumber;
    }
    public void display(){
        super.display();
        System.out.println("issunumber is :"+issuNumber);

    }
}
