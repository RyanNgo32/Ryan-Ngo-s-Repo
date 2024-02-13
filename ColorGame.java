import java.util.Scanner;
import java.util.Random;

public class ColorGame {

	public static void main(String[] args)
	{
		String name, description, date, color, colorGuess; 
		
		int points = 0;
		
		final int round = 12;
		
		Scanner keyboard = new Scanner(System.in); //creates scanner 
		
		System.out.println("Enter your name: "); //asks for name
		name = keyboard.nextLine();
		
		System.out.println("Desribe yourself: ");  //asks for description of user
		description = keyboard.nextLine();
		
		System.out.println("Due Date: ");       //asks for due date
		date = keyboard.nextLine();
		
		
		for(int i = 1; i < round; i++)
		{
			System.out.println("Round " + i);
			
			System.out.println("I am thinking of a color.");
			
			System.out.println("Is it orange, red, blue, purple, yellow, green, or pink?");
			
			Random randomNumber = new Random();
			                                                 // generates random number
			int number = randomNumber.nextInt(7);
			
				switch(number)   //assigns number to color
				{
				case 0:
					color = "orange";
					break;
					
				case 1:
					color = "red";
					break;
									
				case 2:
					color = "blue";
					break;
						
				case 3:
					color = "green";
					break;
				
				case 4: 
					color = "yellow";
					break;
					
				case 5:
					color = "purple";
					break;
					
				case 6:
					color = "pink";
					break;
				default:
					color = " ";
				}
					
			colorGuess = keyboard.nextLine();
			
			if(colorGuess.equalsIgnoreCase(color))
			{
				System.out.println("Correct I was thinking of " + color);
				points++;
			}
			else
			{
				System.out.println("Incorrect I was thinking of " + color);
			}
			System.out.println(" ");
			
		}
	keyboard.close();	
	System.out.println("Game Over");
	System.out.println("You guessed " + points + " out of 11 colors correctly.");
	System.out.println("Student name: " + name);
	System.out.println("User description: " + description);
	System.out.println("Due Date: " + date);
		
	}

}