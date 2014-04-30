import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class implements the payment process
 
 * @author Farha C. Rondeau
 * 
 */

public class Cart 
{
	private static double partialPrice;
	private static double TAX = partialPrice * 0.07;
	
	public void makePayment(ArrayList<int[]> i)
			throws FileNotFoundException 
		{
		System.out.println("Please enter card number.");

		i = new ArrayList<int[]>();
		Scanner in = new Scanner(new FileReader("cardNum.txt"));

		while (in.hasNextInt())
		{
			i.equals(in);

		}

		if ((i.indexOf(0)) != 4 || ((i.indexOf(0)) != 5))
		{
			System.out.println("Please verify card number: should start with '4' for Visa or '5' for Mastercard");
		}

		in.close();

		System.out.println("This is your card Number");
		System.out.println(i.toString());
		System.out.println("Proceed with payment?");
		String answer = "";

		if (answer == "yes") 
		{
			printConfirmation();
		}
		
		else if (answer == "no")
		{
			i.clear();
			in.reset();
		}

	}
	
	public double grandTotal()
    {
      Pizza price = new Pizza();

	 partialPrice = price.calculateTotal();
	 return partialPrice + TAX;
	 
    }
	
	public String totalToString()
	   {
	      double grandTotal = grandTotal();
	      NumberFormat formatter = NumberFormat.getCurrencyInstance();
	      return formatter.format(grandTotal);
	   }


	public void printConfirmation() 
	{
		System.out.println("Your total price is: " + totalToString());
	}


}
