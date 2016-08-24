import java.util.Scanner;
public class Craps {

	public static void main(String[] args) {
		
		System.out.println("Welcome! What is your name?");
		Scanner userInput = new Scanner (System.in);
			String name = userInput.nextLine();
		System.out.println("Hello, " + name + ". Welcome to Craps! Let's Play!");
		
		int dieRoll1;
		int dieRoll2;
		int totalDice;	
		int thePoint;
		boolean flag=true;
		
		dieRoll1 = (int)(Math.random()*6)+1;
		dieRoll2 = (int)(Math.random()*6)+1;
		totalDice=dieRoll1+dieRoll2;
		thePoint=totalDice;
		
		if(totalDice == 2 || totalDice == 12)
		{
			System.out.println("You lose!");
		}
		else if(totalDice == 7 || totalDice == 11)
		{
			System.out.println("You win!");
		}
		else
		{
			thePoint=totalDice;
			System.out.println("You rolled a " + dieRoll1 + " and a " + dieRoll2 + "!"); 
			System.out.println("The point is " + thePoint + "!");
		}
	
		while(flag)
		{
			if(totalDice == 7)
			{
				System.out.println("You lose!");
			}
			else if(totalDice == thePoint)
			{
				System.out.println("You win!");
			}
			else
			{
				System.out.println("Roll again!");
			}
			if(totalDice == 7 || totalDice == thePoint);
			{
				flag=false;
			}
		}
	}}


