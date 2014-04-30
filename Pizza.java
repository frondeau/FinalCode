
import java.util.Random;

/**
 * 	Declaration of the different components that will make up a pizza
 * 	The Pizza class handles the declaration of the different components that will make up a pizza
 *  @author Farha C. Rondeau
 * 
 */

public class Pizza 
{	
	//Setting up the different prices


	static final double SMALL_PIZZA_PRICE = 4.00;
	static final double MEDIUM_PIZZA_PRICE = 5.00;
	static final double LARGE_PIZZA_PRICE = 6.00;
	static final double CLASSIC_PRICE = 1.00;
	static final double GLUTEN_FREE_PRICE = 1.25;
	static final double WHOLE_WHEAT_PRICE = 1.50;


	//The size options
	public int small;
	public int medium;
	public int large;


	//The Crusts options


	public int glutenFree;
	public int wholeWheat;
	public int classic;


	//The Sauce options


	public int tomatoSauce;
	public int alfredoSauce;
	public int barbecueSauce;  


	//The cheese options


	public int mozzarella;
	public int parmesan;
	public int provolone;


	//The meat options


	public int  pepperoni;
	public int  sausage;
	public int  chicken;


	//The veggies options

	public int pepper;
	public int onion;
	public int tomato;
	public int olive;


	//Putting each set of options into one group 


	int	  [] sizes  = {small, medium, large};
	int   [] crusts = {glutenFree, wholeWheat, classic};
	int   [] sauces = {tomatoSauce, alfredoSauce, barbecueSauce};
	int   [] cheeses= {mozzarella, parmesan, provolone};
	int   [] meats  = {pepperoni, sausage, chicken};
	int   [] veggies= {pepper, onion, tomato, olive};


	//Variables declaration


	int orderNumber;
	double pizzaPrice;
	double crustPrice;
    int quantity;
	int size;
	int crust;
	int sauce;
	int cheese;
	int meat;
	int veg;
    double partialPrice;

	/**
	 * Creating a pizza object
	 */
        public Pizza()
        {
            orderNumber = 0;
            pizzaPrice = 0;
            crustPrice = 0;
            quantity = 0;
            size = 0;
            crust = 0;
            sauce = 0;
            cheese = 0;
            meat = 0;
            veg = 0;
            
        }


	//The following methods select the Components that will be used to create a pizza


	/**
	 * Randomly select an order number
	 * 
	 * @return the orderNumber
	 */
        Random generator = new Random(); 
	public int selectOrderNumber()
	{
                
		orderNumber = generator.nextInt( Integer.MAX_VALUE ) + 1;


		return orderNumber;
	}


	/**
	 * Select price based on the pizza size
	 * 
	 * @return the PizzaPrice
	 */


	public double selectPizzaPrice()
	{		
		if (size == large)
		{	
			pizzaPrice = LARGE_PIZZA_PRICE;
			return pizzaPrice;
		} 


		else if (size == medium)
		{
			pizzaPrice = MEDIUM_PIZZA_PRICE;
			return pizzaPrice;
		}


		else if (size == small)
		{
			pizzaPrice = SMALL_PIZZA_PRICE;
		}


		return pizzaPrice;
	}


	/**
	 * Select price based on the pizza crust
	 * 
	 * @return the crustPrice
	 */


	public double selectCrustPrice()
	{		
		if (crust == classic)
		{	
			crustPrice = CLASSIC_PRICE;
		} 


		else if (crust == glutenFree)
		{
			pizzaPrice = GLUTEN_FREE_PRICE;
		}


		else if (crust == wholeWheat)
		{
			crustPrice = WHOLE_WHEAT_PRICE;
		}


	return crustPrice;
	}


	/**
	 * Set the quantity of pizza needed
	 * 
	 * @param quantity
	 */


	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}


	/**
	 * Obtain the quantity of pizza ordered
	 * 
	 * @return the quantity of pizza ordered
	 */


	public int getQuantity() 
	{
		return quantity;
	}


	/**
	 * Select the pizza size
	 * 
	 * @paran aSize
	 */


	public void chooseSize(int aSize)
	{		
		 size = aSize;
	}
	
	/**
	 * Select the pizza crust
	 * @param aCrust
	 */


	public void chooseCrust(int aCrust)
	{
		crust = aCrust;
	}


	/**
	 * Select the pizza sauce
	 * 
	 *@param aSauce
	 */


	public void chooseSauce(int aSauce)
	{
		sauce = aSauce;
	} 


	/**
	 * Select the pizza cheese
	 * 
	 * @paran aCheese
	 */


	public void chooseCheese(int aCheese)
	{
		cheese = aCheese;
	}


	/**
	 * Select the pizza meat
	 * 
	 * @param sMeat
	 */


	public void chooseMeat(int aMeat)
	{
		meat = aMeat;
	}


	/**
	 * Select the pizza veggies
	 * 
	 * @param aVeggie
	 */


	public void chooseVeggies(int aVeggie)
	{
		veg = aVeggie;

	}
        
        public void userWhoOrdered(String name)
    {
        userWhoOwnsPizza = name;
    }
    
	/**
	 * Calculate the total price of pizza
	 * 
	 * @return partialPrice
	 */


	public double calculateTotal()
    {
      partialPrice = (quantity*pizzaPrice) + (quantity*crustPrice);

      return partialPrice;
    }
    public String userWhoOwnsPizza;
}
