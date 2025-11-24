import java.util.Scanner;
import java.util.Random;

public class GuessNumberGame 
{
    public static void main(String[] args) 
	{
        Scanner kb = new Scanner(System.in);
        Random ram = new Random();

        int iNumOne = ram.nextInt(5) + 1;
        int iUserGuess;

        System.out.println("Guess the number between 1 and 5!");

        for (int iAttempts = 1; iAttempts <= 5; iAttempts++) 
		{
            System.out.print("Enter your guess: ");
            iUserGuess = kb.nextInt();

            if (iUserGuess == iNumOne) 
			{
                System.out.println("Correct! The number is " + iNumOne);
                break;
            } else 
			{
                System.out.println("Sorry, wrong guess. Try again!");
            }
        }

        System.out.println(" The correct number is " + iNumOne);
    }
}
