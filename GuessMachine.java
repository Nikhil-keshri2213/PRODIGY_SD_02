import java.util.Random;
import java.util.Scanner;

public class GuessMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int num = random.nextInt(100)+1;
        int userGuess = 0;
        int attempts = 0;
        
        while (userGuess!=num)
        {
            System.out.print("Enter your guess between 1 to 100: ");
            try {
                userGuess = sc.nextInt();
                attempts++;
                if (userGuess < num)
                {
                    System.out.println("Too low! Try again.");
                }
                else if (userGuess > num)
                {
                    System.out.println("Too high! Try again.");
                }
                else {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                }
            }catch(Exception e)
            {
                System.out.println("Invalid input. Please enter a valid number.");
                sc.next();
            }
        }
        sc.close();
    }
}
