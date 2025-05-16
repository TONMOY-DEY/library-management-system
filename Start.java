package Lmanagment;

public class Start {
    public static void main(String[] args) {
        User u1=new User(12345, "Tonmoy", 10);
        //Magazine M1=new Magazine(35648, "graphic", 5600);
        //TextBook T1=new TextBook("very impottant ", "graphic", 56000);
        Book b1=new TextBook("MAth", "TB101",450);
        Book b2=new Magazine(18, "MG202", 250);
        u1.addBook(b1);
        u1.addBook(b2);
        System.out.println("All Book for user");
        System.out.println("...................");
        u1.showAllBooks();
        u1.removeBook(b1);
        System.out.println("After Removing Book:");
        System.out.println("........................");
        u1.showAllBooks();

    }
    
}
