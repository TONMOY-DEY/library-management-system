package Lmanagment;

public class User {
    private int userId;
    String username;
    Book books[];

    public User(){
        System.out.println("................");

    }
    public User(int userId,String username,int size){
        this.userId=userId;
        this.username=username;
        this.books=new Book[size];

    }
    public void setuserId(int id){
        this.userId=id;
    }
    public int userId(){
        return userId;
    }
    public void setusername(String name){
        this.username=name;
    }
    public String getusername(){
        return username;
    }
    
    public void addBook(Book b){
        for(int i=0;i<this.books.length;i++){
            if(books[i]==null){
                books[i]=b;
                break;
                
            }
        }
    }
    public void removeBook(Book b){
        for(int i=0;i<this.books.length;i++){
            if(books[i]==b){
                books[i]=null;
                break;
            }
        }
    }
    public void showAllBooks(){
        for(Book bx:books){
            if(bx!=null){
                bx.display();
            }
        }

    }
    
        
    }

    

