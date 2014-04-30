/**
 *This class will create the Gui interface for the application
 *
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class GUI  
{
	//Checkboxes for the veggies	
	
	  JCheckBox pepper = new JCheckBox ("Pepper");
	  JCheckBox onion = new JCheckBox  ("Onion");
	  JCheckBox tomatoes = new JCheckBox ("Tomatoes");
	  JCheckBox olive = new JCheckBox  ("Olive");
	  
	 //Checkboxes for the cheeses 
	  
	  JCheckBox mozzarella = new JCheckBox ("Mozzarella");
	  JCheckBox parmesan = new JCheckBox ("Parmesan");
	  JCheckBox provolone = new JCheckBox  ("Provolone");
	  
	  //Butttons for the meats
	  
	  JRadioButton pepperoni = new JRadioButton ("Pepperoni");
	  JRadioButton chicken = new JRadioButton  ("Chicken");
	  JRadioButton sausage = new JRadioButton ("Sausage");
	  	 
	  //Buttons for the sauces
	  
	  JRadioButton tomatoeSauce = new JRadioButton ("Tomatoe Sauce");
	  JRadioButton alfredoSauce = new JRadioButton  ("Alfredo Sauce");
	  JRadioButton barbecueSauce = new JRadioButton ("BarbecueSauce");
	  
	  //Buttons for the crusts
	  JRadioButton classic = new JRadioButton ("Classic: $ 1.00");
	  JRadioButton glutenFree = new JRadioButton  ("Gluten-Free: $ 1.25");
	  JRadioButton wholeWheat = new JRadioButton ("Whole-Wheat: $ 1.50");
	  
	  //Buttons for the sizes
	  
	  JRadioButton small = new JRadioButton ("Small: $ 4.00");
	  JRadioButton medium = new JRadioButton  ("Medium: $5.00");
	  JRadioButton large = new JRadioButton ("Large: $6.00");
	  
	  JLabel result = new JLabel();
	  
	  ButtonGroup theVeggies = new ButtonGroup();
	  ButtonGroup theCheeses = new ButtonGroup();
	  ButtonGroup theMeats = new ButtonGroup();
	  ButtonGroup theSizes = new ButtonGroup();  
	  ButtonGroup theSauces = new ButtonGroup();
	  ButtonGroup theCrusts = new ButtonGroup();
	  
		public GUI()
		
		{
		
		  JButton blank = new JButton(" ");
		  blank.setForeground(Color.red);
		  blank.setFont(new Font("Cooper Black", Font.BOLD,16));
		  blank.setBackground(Color.cyan);
			
		  JButton calculate = new JButton("Calculate Total");
		  calculate.setForeground(Color.red);
		  calculate.setFont(new Font("Cooper Black", Font.BOLD,16));
		  calculate.setBackground(Color.cyan);
		  	
		  JButton grandTotal = new JButton ("Calculate Grand Total");
		  grandTotal.setForeground(Color.red);
		  grandTotal.setFont(new Font("Cooper Black", Font.BOLD, 16));
		  grandTotal.setBackground(Color.CYAN);
		  
		  JButton print = new JButton("Print Confirmation");
		  print.setForeground(Color.RED);
		  print.setFont(new Font("Cooper Black", Font.BOLD, 16));
		  print.setBackground(Color.CYAN);
		  
		  JButton reset = new JButton ("Reset");
		  reset.setForeground(Color.red);
		  reset.setFont(new Font("Cooper Black", Font.BOLD, 16));
		  reset.setBackground(Color.CYAN);
		  
		  JButton order = new JButton("Place Order");
		  order.addActionListener(new OrderButtonListener());
		  order.setForeground(Color.red);
		  order.setFont(new Font("Cooper Black", Font.BOLD, 16));
		  order.setBackground(Color.CYAN);
		  
		  
		  JButton createAct = new JButton("Create Account");
		  createAct.addActionListener(new AccountButtonListener());
		  createAct.setForeground(Color.red);
		  createAct.setFont(new Font("Cooper Black", Font.BOLD, 16));
		  createAct.setBackground(Color.CYAN);
				
		  
		  JButton signIn = new JButton("Sign In");
		  signIn.addActionListener(new AccountButtonListener());
		  signIn.setForeground(Color.red);
		  signIn.setFont(new Font("Cooper Black", Font.BOLD, 16));
		  signIn.setBackground(Color.CYAN);
			
	  	  	  
		  /*Creating the different panels
		   * 
		   */
		  
			            
		  //Creating the panel for veggies and cheeses
		 
		  JPanel veggiesAndCheesesPanel = new JPanel();
		  veggiesAndCheesesPanel.setLayout(new GridLayout (2,5));
		  veggiesAndCheesesPanel.setPreferredSize(new Dimension (700,250));
		  veggiesAndCheesesPanel.setBorder(new TitledBorder( new EtchedBorder(),"Veggies and Cheeses Options"));
		  
		  //Grouping veggies and cheeses into 2 subgroups
		  
		
		  theVeggies.add(pepper);
		  theVeggies.add(onion);
		  theVeggies.add(tomatoes);
		  theVeggies.add(olive);
		  
		  
		  theCheeses.add(mozzarella);
		  theCheeses.add(parmesan);
		  theCheeses.add(provolone);
		 	  
		  //Adding veggies and cheeses to the panel
		 
	      veggiesAndCheesesPanel.add (onion);
	      veggiesAndCheesesPanel.add (pepper);
	      veggiesAndCheesesPanel.add (olive);
	      veggiesAndCheesesPanel.add (tomatoes);		     
	      veggiesAndCheesesPanel.add (mozzarella);
	      veggiesAndCheesesPanel.add (provolone);
	      veggiesAndCheesesPanel.add (parmesan);
	      
		  //Creating the panel for meats and sauces
	      
	          
		  JPanel meatsAndSaucesPanel = new JPanel();
		  meatsAndSaucesPanel.setLayout(new GridLayout (2,3));
		  meatsAndSaucesPanel.setPreferredSize(new Dimension (700,250));
		  meatsAndSaucesPanel.setBorder(new TitledBorder(new EtchedBorder(), "Meats and Sauces Options"));
		 
	
		  //Grouping meats and sauces into 2 subgroups
		  
		 
		  theMeats.add(pepperoni);
		  theMeats.add(chicken);
		  theMeats.add(sausage);
		  
		  theSauces.add(tomatoeSauce);
		  theSauces.add(alfredoSauce);
		  theSauces.add(barbecueSauce);
		  
		  //Adding meats and sauces to the panel
		  
		  meatsAndSaucesPanel.add (pepperoni);
	      meatsAndSaucesPanel.add (chicken);
	      meatsAndSaucesPanel.add(sausage);
	      meatsAndSaucesPanel.add(tomatoeSauce);
	      meatsAndSaucesPanel.add(alfredoSauce);
	      meatsAndSaucesPanel.add(barbecueSauce);
	      
	      //Creating the panel for sizes and crusts
		  
		  JPanel sizesAndCrustsPanel = new JPanel();
		  sizesAndCrustsPanel.setLayout(new GridLayout (2,3));
		  sizesAndCrustsPanel.setPreferredSize(new Dimension (700,250));
		  sizesAndCrustsPanel.setForeground(Color.yellow.darker());
		  sizesAndCrustsPanel.setBorder(new TitledBorder(new EtchedBorder(),"Sizes and Crusts Options"));
	
		  //Grouping crusts and sizes into 2 subgroups
		  	
		  theSizes.add(small);
		  theSizes.add(medium);
		  theSizes.add(large);
		  
		  theCrusts.add(classic);
		  theCrusts.add(glutenFree);
		  theCrusts.add(wholeWheat);
		  
		  //Adding the sizes and crusts to the panel
		  
		  sizesAndCrustsPanel.add(small);
	      sizesAndCrustsPanel.add(medium);
	      sizesAndCrustsPanel.add(large);
	      sizesAndCrustsPanel.add(classic);
	      sizesAndCrustsPanel.add(glutenFree);
	      sizesAndCrustsPanel.add(wholeWheat);
		  
		  //Creating the order panel
	      
		  JPanel orderPanel = new JPanel();
		  orderPanel.setLayout(new GridLayout(2,3));
		  orderPanel.setPreferredSize(new Dimension (1000,200));
		  orderPanel.setBorder(new TitledBorder (new EtchedBorder(),"Order Pocessing"));
		  orderPanel.setFont(new Font("Cooper Black", Font.BOLD, 20)); 
		 
	
		  
		  //Adding components to the order panel
		  orderPanel.add(createAct);
		  orderPanel.add(signIn);
		  orderPanel.add(order);
		  orderPanel.add(calculate);
		  orderPanel.add(grandTotal);
		  orderPanel.add(print);
		  orderPanel.add(reset);
		  orderPanel.add(blank);
		  
		  JPanel cartPanel = new JPanel();
		  cartPanel.setLayout(new GridLayout(1,1));
		  cartPanel.setPreferredSize(new Dimension (700,250));
		  cartPanel.setBorder(new TitledBorder (new EtchedBorder(), "Cart"));
		
		  cartPanel.setFont(new Font("Monospaced", Font.BOLD, 24));
	
		
		  result=new JLabel("", SwingConstants.CENTER);
		  result.setBackground(Color.red);
		  result.setBorder(BorderFactory.createLineBorder(Color.red));
		  result.setVisible(true);
		  
		  //Adding component to the panel
		  
		  cartPanel.add(result);
		  
		  	  	  
		  //main Panel
		  	  	  
  		  JPanel mainPanel = new JPanel();
  		  mainPanel.setLayout(new FlowLayout());
  		  mainPanel.setBackground(Color.ORANGE);
  		  mainPanel.add(sizesAndCrustsPanel, BorderLayout.NORTH);
  		  mainPanel.add(meatsAndSaucesPanel, BorderLayout.EAST);
  		  mainPanel.add(veggiesAndCheesesPanel, BorderLayout.WEST);
  		  mainPanel.add(orderPanel, BorderLayout.CENTER);
  		  mainPanel.add(cartPanel, BorderLayout.SOUTH);
		  	  
		   	  
  	  	JFrame frame = new JFrame();
  		
  		frame.setSize(1500, 1500);
  		frame.setTitle("Pizza Ordering System");
  		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  		frame.add(mainPanel);
  		frame.setVisible(true);
	  } 
		
		
	//Action listeners to create an account
	    
		class AccountButtonListener implements ActionListener
		{
		
            @Override
			public void actionPerformed(ActionEvent ev)
            {   Customer c = new Customer();
            
            	JButton pressed = (JButton)(ev.getSource());
			 
            	String text = pressed.getText();
            	
            	if (text.equals("Create Account"))
            	{
			 		c.createAccount(c.userName, c.passWord);
       
            	}
            	
            	if (text.equals("Sign In"))
            	{
			 		c.signIn(c.userName, c.passWord);
       
            	}
            	
            }
	}


	  	/*Implementing action listener 
	  	 * 
	  	 */
	    class OrderButtonListener implements ActionListener
	    {
			@Override
			public void actionPerformed(ActionEvent event)
			{
				Pizza currentPizza = new Pizza();
	          
				try
				{
						
	            // get size
					
					
					if (theSizes.getSelection().equals(large))
					{
						currentPizza.chooseSize(currentPizza.large);
					}	
						
					if (theSizes.getSelection().equals(medium))
					{
						currentPizza.chooseSize(currentPizza.medium);
					}	
					
					if (theSizes.getSelection().equals(small))
					{
						currentPizza.chooseSize(currentPizza.small);
					}	
					
	             // get crust type
					
					if (theCrusts.getSelection().equals(classic))
					{
						currentPizza.chooseCrust(currentPizza.classic);
					}	
					
					if (theCrusts.getSelection().equals(glutenFree))
					{
						currentPizza.chooseCrust(currentPizza.glutenFree);
					}	
					
					if (theCrusts.getSelection().equals(wholeWheat))
					{
						currentPizza.chooseCrust(currentPizza.wholeWheat);
					}	
					
	             // get selected cheeses
	             
					if (theCheeses.getSelection().equals(mozzarella))
					{
						currentPizza.chooseCheese(currentPizza.mozzarella);
					}	
					
					if (theCheeses.getSelection().equals(parmesan))
					{
						currentPizza.chooseCheese(currentPizza.parmesan);
					}	
					
					if (theCheeses.getSelection().equals(provolone))
					{
						currentPizza.chooseCheese(currentPizza.provolone);
					}	
					
	             // get selected meat 
					
					if (theMeats.getSelection().equals(pepperoni))
					{
						currentPizza.chooseMeat(currentPizza.pepperoni);
					}	
					
					if (theMeats.getSelection().equals(chicken))
					{
						currentPizza.chooseMeat(currentPizza.chicken);
					}	
					
					if (theMeats.getSelection().equals(sausage))
					{
						currentPizza.chooseMeat(currentPizza.sausage);
					}	
					
	             // get selected veggie toppings
					
					if (theVeggies.getSelection().equals(tomatoes))
					{
						currentPizza.chooseVeggies(currentPizza.tomato);
					}	
					
					if (theVeggies.getSelection().equals(onion))
					{
						currentPizza.chooseVeggies(currentPizza.onion);
					}	
					
					if (theVeggies.getSelection().equals(olive))
					{
						currentPizza.chooseVeggies(currentPizza.olive);
					}	
					
					if (theVeggies.getSelection().equals(pepper))
					{
						currentPizza.chooseVeggies(currentPizza.pepper);
					}	
					
						
					//Adding action to the buttons
					
					JButton pressed = (JButton)(event.getSource());
					 
					String text = pressed.getText();
					
					
					if(text.equals("Print Confirmation"))
						 
					 {
						Cart confirmation = new Cart();
						confirmation.printConfirmation();
						
					 }	  
											 
						 
					 else if (text.equals ("Reset"))
				 
					 {
				 		resetOptions();
				 
					 }
						 
				
				    if(text.equals("Place Order"))
					 
					 {
					  Customer order = new Customer();
					  {
						  order.placeOrder();
						  
						 
					  }
						 
					}	
							 
				 if(text.equals("Calculate Total"))
				 
				 {   
					 Pizza total = new Pizza();
				 
					 total.calculateTotal();
						 
					 result.setText("Your Total is: " + total.calculateTotal());
				 
					 result.setVisible(true);
				 
				 } 
						 		 
						 
				 if(text.equals("Grand Total"))
				 {
						 
					Cart total = new Cart(); 
					
					total.grandTotal();
					
					result.setText("Your Grand Total is: " + total.grandTotal());
					 
					 result.setVisible(true);

				 }
				
				}
					
				 catch (NumberFormatException e)
	             {
	             }

			}
	    
	    
		
		private void resetOptions() 
		{
			pepper.setSelected(false);
	      onion.setSelected(false);
	      olive.setSelected(false);
	      tomatoes.setSelected(false);
	      mozzarella.setSelected(false);
	      parmesan.setSelected(false);
	      provolone.setSelected(false);
				
		}
		
	}	
}   

		
