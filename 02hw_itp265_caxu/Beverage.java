/**
 * Beverage class
 *
 * @author Connie Xu
 * ITP 265, Spring 2021, Coffee Section
 * Assignment 02
 * Email: caxu@usc.edu
 */
public class Beverage
{
    // instance variables
    private String name;
    private double price;
    
    /**
     * constructor that takes in name and price
     */
    public Beverage(String name, double price)
    {
        //create constructors
        this.name = name;
        this.price = price;
    }
    
    /**
     * accessor for name
     */
    public String getName () {
        return name;
    }
    
    /**
     * accessor for price
     */
    public double getPrice () {
        return price;
    }
    
    /**
     * mutator for name
     */
    public void setName (String beverageName) {
        name = beverageName;
    }
    
    /**
     * mutator for price
     */
    public void setPrice (double beveragePrice) {
        price = beveragePrice;
    }
    
    /**
     * toString method to return name and price
     */
    public String toString() {
        return name + ": $" + price;
    }
    
    /**
     * equals method to check if two beverages are the same
     */
    public boolean equals(Beverage other) {
        return (this.getName().equals(other.name)
        && Math.abs(this.getPrice() - other.price) <= 0.0001);
    }
}
