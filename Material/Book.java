package Material;

import java.time.LocalDate;
public class Book implements Material{
    private String name;
    private long id;
    private String author;
    private String isbn;
    private boolean borrowed;
    private String description;
    private LocalDate dueDate;
    private LocalDate borrowDate;

    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public long getId(){
        return id;
    }
    @Override
    public String getMoreInfo(){
        return isbn + " - " + author;
    }
    @Override
    public String getDescription(){
        return description;
    }
    @Override 
    public LocalDate getDueDate(){
        return dueDate;
    }
    @Override
    public LocalDate getBorrowDate(){
        return borrowDate;
    }
    @Override
    public void borrow(){
        if(borrowed == true){
            System.out.println("Book already borrowed");
        }
        borrowed = true;
        
    }
    @Override
    public void giveBack(){
        if(borrowed == false){
            System.out.println("Book not borrowed");
        }
        borrowed = false;
    }


    
    public Book(long id, )

}