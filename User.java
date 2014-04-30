import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author michaelgordon
 */


/**
 * The Account class handles all the storing of information regarding accounts.
 * Ie. Passwords,
 * userNames, orders, account Creation, etc...
 * @author michaelgordon
 */
public class User
{
     ArrayList<String> userNames = new ArrayList<String>();
     ArrayList<String> passWords = new ArrayList<String>();//add password arraylist
     ArrayList<Integer> orderHistory = new ArrayList<Integer>();
     ArrayList<Pizza> orderList = new ArrayList<Pizza>();
    
    
 /**
  * This method checks to see if a user exist.  If it does not, it prompts
  * the user to create an account. If the user says yes, it prompts for a username
  * and password, then adding that info to the ArrayList.  If the user says no,
  * The method returns.
  * @return 
  */
    public boolean verifyUserAccount()//Changed return type
    {   
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter UserName to verify: ");
        String userToVerify = keyboard.nextLine();
        
        keyboard.close();
        for(String user : userNames)
        {
            if(user.equals(userToVerify))
            {
                System.out.println("User verification successful!");
                return true;
            }
        }
        //Create user object if desired then return true
       System.out.println("User not found, would you like to create an account: Y/N?");
       String input = keyboard.nextLine();
      
       
       if(input.equals("y") || input.equals("Y"))
       {
      
           System.out.println("Enter New UserName: ");
           String nuser = keyboard.nextLine();
           System.out.println("Enter New Password: ");
           String npass = keyboard.nextLine();
           userNames.add(nuser);
           passWords.add(npass);
           
            for(String user : userNames)
            {
                if(user.equals(nuser))
                {
                    System.out.println("Account created!");
                    return true;
                }
            }          
       }      
       return false;    
    }
    
    /**
     * This method adds pizza orders to the ArrayList which keeps track of orders.
     * @param order 
     */
    public void recordOrders(Pizza order)
    {
        //Call whenever user places order with PlaceOrder() and stores
        //order info inside ArrayLIst<Pizza>
        orderList.add(order);
    }  
}

 
 


 
