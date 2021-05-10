
/**
 * Credit Card class
 *
 * @author Connie Xu
 * ITP 265, Spring 2021, Coffee Section
 * Assignment 03
 * Email: caxu@usc.edu
 */
public class CreditCard
{
    // instance variables
    private String name;
    private String cardNumber;
    private String expirationDate;
    private int cvv;
    private double balance;

    /**
     * Full constructor for objects of class CreditCard
     */
    public CreditCard(String name, String cardNumber, String expirationDate, int cvv, double balance)
    {
        // initialize instance variables
        this.name = name;
        this.cardNumber =  cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
        this.balance = balance;
    }

    /**
     * accessor for name
     */
    public String getName ()
    {
        return name;
    }
    
    /**
     * accessor for name
     */
    public double getBalance ()
    {
        return balance;
    }
    
    /**
     * mutator for name
     */
    public void setName (String name)
    {
        this.name = name;
    }
    
    /**
     * mutator for balance
     */
    public void setBalance (double balance)
    {
        this.balance = balance;
    }
    
    /**
     * toString convert method in readable format
     */
    public String toString ()
    {
        return name + "'s Credit Card Information: \n" + "Credit Card Number: " + cardNumber + "\nCVV: " + cvv + "\nExpiration Date: " + expirationDate + "\nBalance: " + balance + "\n";
    }
}
