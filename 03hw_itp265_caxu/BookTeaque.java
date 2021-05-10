import java.util.*; //import util
/**
 * BookTeaque class (see beverages and books to purchase)
 *
 * @author Connie Xu
 * ITP 265, Spring 2021, Coffee Section
 * Assignment 03
 * Email: caxu@usc.edu
 */
public class BookTeaque
{
    // instance variables
    private CreditCard CreditCard1;
    private double newBalance;
    private String storeName;
    private Book Book1;
    private Book Book2;
    private Book Book3;
    private Book Book4;
    private Book Book5;
    private Beverage Beverage1;
    private Beverage Beverage2;
    private Beverage Beverage3;
    private String currentOrder;
    private String userChoice;
    Scanner scnr = new Scanner(System.in);
    private ITPHelper helper;

    /**
     * constructor for BookTeaque
     */
    public BookTeaque()
    {
        //create value for storeName
        this.storeName = "Connie's store";
        this.currentOrder = "";
        createUser();

        //constructs all objects for BookTeaque
        Book1 = new Book("God Bless You, Mr. Rosewater", "Kurt Vonnegut",13.99, "Paperback", 290);
        Book2 = new Book("The Three Body Problem", "Cixin Liu", 11.99, "Hardcover", 400);
        Book3 = new Book("Song of Solomon", "Toni Morrison", 14.99, "Paperback", 337);
        Book4 = new Book("The Golden Compass", "Phillip Pullman", 9.99, "Paperback", 399);
        Book5 = new Book("The Shadow of the Wind", "Carlos Ruiz Zaforn", 14.99, "Hardcover", 530);

        Beverage1 = new Beverage("Water", 1.00);
        Beverage2 = new Beverage("Almond Milk", 4.50);
        Beverage3 = new Beverage("Sweet Tea", 3.50);
    }

    /**
     * create user credit card information
     */
    private void createUser() {
        System.out.println("Let's set up your credit card!");


        System.out.println("What is your full name?");
        String creditName = scnr.nextLine();

        //String creditName = helper.inputLine("What is your full name?");

        System.out.println("Enter your credit card number in the following format (XXXX XXXX XXXX XXXX):");
        String creditNumber = scnr.nextLine();

        //String creditNumber = helper.inputLine("Enter your credit card number in the following format (XXXX XXXX XXXX XXXX):");

        System.out.println("Enter your CVV (Card Security Code) in the following format (XXX):");
        int creditCvv = scnr.nextInt();
        scnr.nextLine();

        //int creditCvv = helper.inputInt("Enter your CVV (Card Security Code) in the following format (XXX):", 100, 999);

        System.out.println("Enter your expiration date in the following format (MM/YY):");
        String creditExpirationDate = scnr.nextLine();

        //String creditExpirationDate = helper.inputLine("Enter your expiration date in the following format (MM/YY):");

        //auto set balance to $1,000.00
        CreditCard1 = new CreditCard (creditName, creditNumber, creditExpirationDate, creditCvv, 1000.00);
    }

    /**
     * print info for 5 books and 3 beverages
     */
    public void printInventory()
    {
        System.out.println("Welcome to " + storeName + "! We are happy to have you here today!");
        System.out.println(storeName + " Inventory List");
        System.out.println();

        System.out.println("Your Credit Card Information:");
        System.out.println(CreditCard1.toString());

        System.out.println("Our Books:");
        System.out.println(Book1.toString());
        System.out.println(Book2.toString());
        System.out.println(Book3.toString());
        System.out.println(Book4.toString());
        System.out.println(Book5.toString());

        System.out.println();

        System.out.println("Our Bevereges:");
        System.out.println(Beverage1.toString());
        System.out.println(Beverage2.toString());
        System.out.println(Beverage3.toString());

        System.out.println();
    }

    /**
     * series of checkers for user input
     */
    public int bookInputRangeChecker(String input, int min, int max)
    {
        int num = bookInputIntChecker(input);
        while (num < min || num > max){
            System.out.println(num + " is not in the allowed range, " + min + " - " + max);
            num = bookInputIntChecker(input);
        }

        return num;
    }

    public int bookInputIntChecker(String input)
    {
        System.out.println(input);

        while(scnr.hasNextInt() == false) {
            String garbage = scnr.nextLine();
            System.out.println(garbage + " was not an int.");
            System.out.println(input);
        }

        int i = scnr.nextInt();
        scnr.nextLine();
        return i;
    }

    public String bookChecker(int userBookChoice)
    {
        switch (userBookChoice){
            case 1:
            System.out.println("You purchased book1!");
            currentOrder = currentOrder + " book1 ";
            newBalance = Book1.getPrice();
            CreditCard1.setBalance(CreditCard1.getBalance() - newBalance);
            break;
            case 2:
            System.out.println("You purchased book2!");
            currentOrder = currentOrder + " book2 ";
            newBalance = Book2.getPrice();
            CreditCard1.setBalance(CreditCard1.getBalance() - newBalance);
            break;  
            case 3:
            System.out.println("You purchased book3!");
            currentOrder = currentOrder + " book3 ";
            newBalance = Book3.getPrice();
            CreditCard1.setBalance(CreditCard1.getBalance() - newBalance);
            break; 
            case 4:
            System.out.println("You purchased book4!");
            currentOrder = currentOrder + " book4 ";
            newBalance = Book4.getPrice();
            CreditCard1.setBalance(CreditCard1.getBalance() - newBalance);
            break; 
            case 5:
            System.out.println("You purchased book5!");
            currentOrder = currentOrder + " book5 ";
            newBalance = Book5.getPrice();
            CreditCard1.setBalance(CreditCard1.getBalance() - newBalance);
            break; 
        }

        return currentOrder;
    }

    public int beverageInputRangeChecker(String input, int min, int max)
    {
        int num = beverageInputIntChecker(input);

        while(num < min || num > max){
            System.out.println(num + " is not in the allowed range, " + min + " - " + max);
            num = beverageInputIntChecker(input);
        }

        return num;
    }

    public int beverageInputIntChecker(String input)
    {
        System.out.println(input);

        while(scnr.hasNextInt() == false){
            String garbage = scnr.nextLine();
            System.out.println(garbage + " was not an int.");
            System.out.println(input);
        }

        int i = scnr.nextInt();
        scnr.nextLine();
        return i;
    }

    public String beverageChecker(int userBeverageChoice)
    {
        switch (userBeverageChoice){
            case 1:
            System.out.println("You purchased beverage1!");
            currentOrder = currentOrder + " beverage1 ";
            newBalance = Beverage1.getPrice();
            CreditCard1.setBalance(CreditCard1.getBalance() - newBalance);
            break;
            case 2:
            System.out.println("You purchased beverage2!");
            currentOrder = currentOrder + " beverage2 ";
            newBalance = Beverage2.getPrice();
            CreditCard1.setBalance(CreditCard1.getBalance() - newBalance);
            break;
            case 3:
            System.out.println("You purchased beverage3!");
            currentOrder = currentOrder + " beverage3 ";
            newBalance = Beverage3.getPrice();
            CreditCard1.setBalance(CreditCard1.getBalance() - newBalance);
            break;
        }

        return currentOrder;
    }

    /**
     * shop method for users to purchase items
     */
    public void shop(){
        boolean loop = true;

        printInventory();

        while (loop){
            System.out.println("Would you like to buy a book or a beverage or are you ready to checkout?");
            userChoice = scnr.next();

            if (userChoice.equalsIgnoreCase("book")){
                String n = scnr.nextLine();
                bookChecker(bookInputRangeChecker("Please choose a number between 1-5!", 1, 5));
            }
            else if(userChoice.equalsIgnoreCase("beverage")){
                String n = scnr.nextLine();
                beverageChecker(beverageInputRangeChecker("Please choose a number between 1-3!", 1, 3));
            }
            else if (userChoice.equalsIgnoreCase("checkout")){
                System.out.println("Thank you for shopping at " + storeName + ". You bought: " + currentOrder);
                System.out.println("Credit Card Balance: $" + CreditCard1.getBalance());
                loop = false;
            }
            else {
                System.out.println("This choice has not been recognized as a book, beverage, or checkout.");
            }
        }
    }

    public static void main(String[] args){
        BookTeaque myStore = new BookTeaque();
        myStore.shop();
    }
}
