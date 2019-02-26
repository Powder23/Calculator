package cse360assign2;
/**
 * 
 * Sarah Mellon, 487
 * CSE 360, Assignment 2
 * 
 * This program will perform the basic calculations addition, subtraction, 
 * multiplication and division. It will also return the total and the history 
 * of all the calculations made. 
 *
 */
		
public class Calculator2 {
	private int total; 
	private String history;

	
	public Calculator2 () 
	{
		total = 0;  // not needed - included for clarity
		history = ("0");
	}	
	
	/**
	 * This method will print the current total to the screen.   
	 *
	 */
	
	
	public void getTotal () 
	{
		System.out.println(total);
	}
	
	/**
	 * This method will do the addition operation. The value passed 
	 * in is added to the current total.  
	 * The operation is then added to the end of the history string. 
	 * @param value as an integer that total is added to. 
	 *
	 */
	public void add (int value) 
	{
		total = total+value;
		history = history.concat(" + " + value);		
	}
	
	/**
	 * This method will do the subtraction operation. The value passed 
	 * in is subtracted from the current total.  
	 * The operation is then added to the end of the history string. 
	 * @param value as an integer that total is subtracted from. 
	 *
	 */
	public void subtract (int value) 
	{
		total = total - value;
		history = history.concat(" - " + value);
	}
	/**
	 * This method will do the multiplication operation. The value passed 
	 * in is multiplied by the total.   
	 * The operation is then added to the end of the history string. 
	 * @param value as an integer that total is multiplied by. 
	 *
	 */
	
	public void multiply (int value)
	{
		total = total * value;
		history = history.concat(" * " + value);
	}
	
	/**
	 * This method will do the division operation. The current total is divided by the value 
	 * passed in. If the value passed in is zero, the total is 0. Otherwise, the total is the
	 * result of the arithmetic operation. 
	 * The operation is then added to the end of the history string. 
	 * @param value as an integer that total is divided by. 
	 *
	 */
	
	public void divide (int value) 
	{
		if(value == 0)
			total = 0;
		else 
			total = total / value;
		history = history.concat(" / " + value);
	}
	
	/**	
	 * The getHistory method will return the history of the calculations
	 * made as a string
	 * @return history of calculations as a string. 
	 *  
	 */
	
	public String getHistory () 
	{
		return history;
	}
}