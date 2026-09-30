package in.pavan.Library;

public class Book {

    private int bookId;
    private String bookName;
    private String author;
    private boolean isAvailable;


    public Book(int bookId, String bookName, String author, boolean isAvailable){

        this.bookId=bookId;
        this.bookName=bookName;
        this.author=author;
        this.isAvailable=isAvailable;

    }
    public void setBookId(int bookId){

        this.bookId=bookId;
    }

    public int getBookId(){
        return bookId;
    }


    public void setBookName(String bookName){
        this.bookName=bookName;
    }

    public String getBookName(){
        return bookName;
    }

    public void setAuthor(String author){
        this.author=author;
    }
    public String getAuthor(){
        return author;
    }

//    public void setIsAvailable(boolean isAvailable){
//        this.isAvailable=isAvailable;
//    }
    public boolean getIsAvailable(){
        return isAvailable;
    }

    public void issueBook(){

        if(isAvailable){
            System.out.println("Book are issue to you ");
            isAvailable=false;
        }
        else{
            System.out.println("Book are alredy issu to you ! ");
        }

    }

    public void returnBook(){
        if (!isAvailable){
            System.out.println("Book returned successfully!");
            isAvailable=true;
        }
        else {
            System.out.println("Book are availabel ! ");
        }

    }

}

