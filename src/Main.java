import java.util.Scanner;

/*
* BUILD A NUMBER GUESSING GAME.
* THE SYSTEM SHOULD PROMPT THE USER ON HOW MANY ATTEMPT THE USER WANT TO TRY GUESSING.
* THE SYSTEM SHOULD PROMPT THE USER TO GUESS A NUMBER.
* CHECK IF THE NUMBER MATCH THE RANDOM NUMBER, IF YES THAN AND 1 TO THE USERS SCORE IF NOT CONTINUE WITH
* THE NEXT ATTEMPTS.
* IF ALL ATTEMPTS ARE UP THE SYSTEM SHOULD DISPLAY THE USER SCORE AND THE NUMBER OF ATTEMPTS.
* */
public class Main {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in); // INSTANTIATING THE SCANNER OBJECT

        int score = 0;
        int num1 ;

        try {
            System.out.println("=========== Welcome to the number guessing game ===========");
            System.out.print("How many attempts would you like to have? Please provide a positive number! : ");
            num1 = input.nextInt();

            for(int i = 0; i < num1; i++){
                System.out.print((i + 1)+". Guess a number between (0 - 50) : ");
                int guessedNumber = input.nextInt();

                int randomNumber = (int)(Math.random()*51);

                if (guessedNumber == randomNumber) {
                    score ++;
                    System.out.println("YOU GUEST THE NUMBER RIGHT!");
                }  else {
                    System.out.println("Wrong number, the right number is "+randomNumber);
                }

            }
            // CALCULATING THE PERCENTAGE OF THE SCORE
            double percentage =  ((double) score / num1)*100;


            if (percentage > 49) {
                System.out.print("Your score is "+score+"/"+num1+ " You passed");
            } else {
                System.out.print("Your score is "+score+"/"+num1+ " You failed");
            }
        } catch (Exception e) {
            System.out.println("Something went wrong try again! \n"+ e);
        }
    }
}