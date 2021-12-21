import java.util.*;
/**
 * @author Sayan Mondal
 */
public class Number_Guessing_Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int user_input = 0;
        int guesses = 0;
        // TODO code application logic here
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=1; i<=100; i++)
        {
            list.add(i);
        }
        Random r = new Random();
        int comp_gen = list.get(r.nextInt(99));
        Scanner sc = new Scanner(System.in);
        System.out.println("Number Guessing Game \n You have 10 attempts.");
        System.out.println("Guess and enter a number between 1 and 100:");
        while (true) {            
            user_input = sc.nextInt();
            if (user_input>=1 && user_input<=100) {
                if(user_input > comp_gen)
                {
                    System.out.println("Number is too high!");
                    guesses++;
                }
                if(user_input < comp_gen)
                {
                    System.out.println("Number is too low!");
                    guesses++;
                }
                if(user_input == comp_gen)
                {
                    guesses++;
                    System.out.println("You have guessed the correct number in " + guesses + " attempts!");
                    break;
                }
                if(guesses == 10){
                    System.out.println("You have finished 10 attempts. Better luck Next Time!");
                    break;
                }
            }
            else{
                System.out.println("Please enter a number between 1 and 100!");
            }
        }
    }
}
