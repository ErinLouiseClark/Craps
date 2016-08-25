import java.util.Scanner;
public class craps2016 {
	static int wager;
	static int money = 100;
	public static void main(String[] args) {
		System.out.println("Welcome to Craps! What is your name?");
		Scanner userInput1 = new Scanner(System.in);
		String name = userInput1.nextLine();
		System.out.println("Hello, " + name + "!");
		intro(money);
	}
	//Homework Test Comment


	public static void intro(int money){
		System.out.println("Welcome to Craps! You have $" + money + "! How much would you like to wager?");
		Scanner userInput = new Scanner (System.in);
		wager = userInput.nextInt();
		if(wager < 0 || wager > money){
			System.out.println("You can't wager that!");
			intro(money);
		}
		else{
			System.out.println("You are waging $" + wager + "");
			firstRoll();
		}
		
	}
	
	public static void firstRoll(){
		int firstRoll1 = (int)(Math.random()*6+1);
		int firstRoll2 = (int)(Math.random()*6+1);
		int firstRoll = firstRoll1 + firstRoll2;
		System.out.println("You rolled a " + firstRoll1 + " and a " + firstRoll2 + " for a total of " + firstRoll + "!");
		if(firstRoll == 7 || firstRoll == 11){
			System.out.println("You win!");
			money = money + wager;
			askAgain(money);
		}
		else if(firstRoll == 12 || firstRoll == 2){
			System.out.println("You lose!");
			money = money - wager;
			askAgain(money);
		}
		else{
			int point = firstRoll;
			keepPlaying(point);
		}
	}
	
	public static void keepPlaying(int point){
		System.out.println("Your point is " + point + "! Press enter to keep rolling!");
		Scanner userInput2 = new Scanner (System.in);
		String enter = userInput2.nextLine();
		int roll1 = (int)(Math.random()*6+1);
		int roll2 = (int)(Math.random()*6+1);
		int roll = roll1 + roll2;
		if(roll == point){
			System.out.println("You rolled a " + roll1 + " and a " + roll2 + " for a total of " + roll + "! You win!");
			money = money + wager;
			askAgain(money);
		}
		else if (roll == 7){
			System.out.println("You rolled a " + roll1 + " and a " + roll2 + " for a total of " + roll + "! You lose!");
			money = money - wager;
			askAgain(money);
		}
		else{
			System.out.println("The point is " + point + ", but you rolled a " + roll1 + " and a " + roll2 + " for a total of " + roll + ".");
			keepPlaying(point);
		}
	}
	
	public static void askAgain(int money){
		System.out.println("Do you want to play again? Enter 1 for yes and 2 for no.");
		Scanner userInput3 = new Scanner (System.in);
		int ans = userInput3.nextInt();
		if(ans == 1){
			if(money == 0){
				System.out.println("You have no money! You can't play again!");
			}
			else{
				intro(money);
			}
		}
		else {
			System.out.println("Goodbye!");
			System.exit(0);
		}
	}
}