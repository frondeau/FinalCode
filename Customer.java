
import java.util.Scanner;


/**
 *
 * @author michaelgordon
 */


/**The User class is created whenever a new or existing user wants to place
 * an order.  It handles the username, password, allows the user to signIn,
 * and place an order.
 * @author michaelgordon
 */
public class Customer extends User
{
   String userName,passWord; 
   final String accountType = "user";
   
   /**
    * Creates a User account.  Adds username and password to ArrayList in account
    * class.
    * @param name
    * @param pass 
    */
   public void createAccount(String name, String pass)
   {
       userName = name;
       passWord = pass;
       super.userNames.add(userName);
       super.passWords.add(passWord);
       System.out.println("User Account Created");
   }
   
   /**
    * Handles the sign in process.  The username must match the Password
    * at specific indexes in the ArrayList from the Account class.
    * Returns true if successful, false if invalid.
    * @param name
    * @param pass
    * @return 
    */
    public boolean signIn(String name, String pass)
    {
        int i = 0;
        while(i < super.userNames.size() )
        {
            if(super.userNames.get(i).equals(name))
            {
                if(super.passWords.get(i).equals(pass))
                {
                    return true;
                }
            }
            i++;
        }
        return false;
    }
   /**
    * Creates an instance of the pizza class and sets the ingredients/sets the
    * price. Then returns the pizza order object.
    * @return 
    */
    public void placeOrder()
    {  
        System.out.println("Please Sign-in to place order.");
        Scanner keyboard = new Scanner(System.in);    
        System.out.println("Enter UserName: ");
        String userNameforOrder = keyboard.nextLine();
        
        System.out.println("Enter PassWord: ");
        String passWordforOrder = keyboard.nextLine();
            
        keyboard.close();
        
        boolean valid = signIn(userNameforOrder,passWordforOrder);
        
        if(valid==true)
        { 
        Pizza currentPizza = new Pizza(); 
      
        System.out.println("Enter quantity of Pizza's: ");
        int quantity = keyboard.nextInt();
        
        currentPizza.selectOrderNumber();
        System.out.println("Order Number is : " + currentPizza.orderNumber);
        currentPizza.setQuantity(quantity);
        currentPizza.chooseCheese(currentPizza.cheese);
        currentPizza.chooseMeat(currentPizza.meat);
    	currentPizza.chooseCrust(currentPizza.crust);
    	currentPizza.chooseSauce(currentPizza.sauce);
    	currentPizza.chooseSize(currentPizza.size);
    	currentPizza.chooseVeggies(currentPizza.veg);
        currentPizza.userWhoOrdered(userNameforOrder);
        currentPizza.selectPizzaPrice();
        currentPizza.calculateTotal();
        
    	
        super.recordOrders(currentPizza);
        return;
        }
      System.out.println("Sign-In credentials invalid");
      return;
    }
}

