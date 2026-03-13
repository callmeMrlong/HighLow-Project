// Import Modules needed
import java.util.InputMismatchException;
import java.util.Scanner;
public class HighLowEngine {

    private int userGuess, randomNum;
    private boolean isValid, isCorrectGuess;


    public HighLowEngine() {

    }
    public void setUserGuess(int guess){
        userGuess = guess;
    }

    public void initGame() {
        setUserGuess(0);
        randomNum = (int) (Math.random() * 101);
        isValid = false;
        isCorrectGuess = false;
    }

    public void runGame(){

    }

    public static void main(String[] args) {
        // 1. Get Random number between 0 and 100
        int randomNum = (int) (Math.random() * 101);

        //Initialize Scanner Object
        Scanner myInput = new Scanner(System.in);
        int userGuess = 0;
        boolean isValid = false;
        // 2. Ask the User to guess a number
        //Prompt for user and store variable
        do {
            while (!isValid) {
                //validation try catch block
                try {
                    System.out.println("Please enter a number");
                    userGuess = myInput.nextInt(); //"myInput" is the function (behaviors or actions)
                    isValid = true;
                    // Because we are using integers we must use .nextInt
                } catch (InputMismatchException e) {
                    System.out.println("Yo, enter an integer. Please enter a valid integer.");
                    myInput.next();
                }
            }
            isValid = false;
            // 3. Compare the guess to the random number
            // 4. Give feed back if the guess is too high or too low
            // 5. Repeat the process until the guess is correct
            //POSITIVE NUMBER RESPONSE
            if (userGuess - randomNum > 10) {
                System.out.println("Too High!");
            } else if (userGuess - randomNum > 0) {
                System.out.println("Still high, but almost");
            }
            //NEGATIVE NUMBER RESPONSES
            if (userGuess - randomNum < -10) {
                System.out.println("Too Low");
            } else if (userGuess - randomNum < 0) {
                System.out.println("Still low, but almost");
            }
        }while (userGuess - randomNum != 0); // end the loop
        //CORRECT ANSWER RESPONSE
        if (userGuess - randomNum == 0)
            System.out.println("Congrats Hun! You got it!");
        System.out.println("The random number was: " + randomNum);
        System.out.println("Would you like to continue playing? (y/n):");
        char playAgain = myInput.next().charAt(0); //in java numbers start at zero not one
        if (playAgain == 'y') {
            main(args); //tells computer to return to the start
        }
        if (playAgain == 'n') {
            System.out.println("Thank you for playing");
            myInput.close(); //tells the computer to end the game and stop running the code and closes the system
        }
    }
}