/**
 * Book class
 *
 * @author Connie Xu
 * ITP 265, Spring 2021, Coffee Section
 * Assignment 03
 * Email: caxu@usc.edu
 */
public class Book
{
    // instance variables
    private String title;
    private String author;
    private double price;
    private String format;
    private int numPages;

    /**
     * constructor for book (ALL instance vars)
     */
    public Book(String bookTitle, String bookAuthor, double bookPrice, String bookFormat, int bookNumPages)
    {
        // initialize instance variables
        title = bookTitle;
        author = bookAuthor;
        price = bookPrice;
        format = bookFormat;
        numPages = bookNumPages;
    }
    
    /**
     * constructor for book
     */
    public Book(String title, String author, int numPages){
        this(title, author, 9.99, "paperback", numPages);
    }
    
    /**
     * create accessor for title
     */
    public String getTitle(){
        return title;
    }
    
    /**
     * create accessor for author
     */
    public String getAuthor(){
        return author;
    }
    
    /**
     * create accessor for price
     */
    public double getPrice(){
        return price;
    }
    
    /**
     * create accessor for format
     */
    public String getFormat(){
        return format;
    }
    
    /**
     * create accessor for numPages
     */
    public int getNumPages(){
        return numPages;
    }
    
    /**
     * create mutator for price
     */
    public void setPrice(double bookPrice){
        price = bookPrice;
    }
    
    /**
     * create mutator for format
     */
    public void setFormat(String bookFormat){
        format = bookFormat;
    }
    
    /**
     * create mutator for numPages
     */
    public void setNumPages(int bookNumPages){
        numPages = bookNumPages;
    }
    
    /**
     * toString method to return book's information
     */
    public String toString(){
        return "\"" + title + "\"" + " by " + author + " (" + format + "; " + numPages + " pages)" + " $" + price; 
    }
    
    /**
     * equals method to check if two books are the same
     */
    public boolean equals (Book other) {
        return (
            this.getTitle().equalsIgnoreCase(other.title)
            && this.getAuthor().equals(other.author)
            && Math.abs(this.getPrice() - other.price) <= 0.0001
            && this.getFormat().equals(other.format)
            && this.getNumPages() == other.numPages
        );
    }
}
