import java.util.Scanner;
import java.util.Random;
public class handgame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] options = {"Rock", "Paper", "Scissors"};

        System.out.println(" We are going to play rock, paper, scissors. You enter your choise and I will after ");
        
        String choice = scanner.nextLine();

        int AIchoice = random.nextInt(3);

        System.out.println("I chose" + options[AIchoice]);

        if (choice.equals(options[AIchoice])) {
            System.out.println("Tie!");
        } else if (choice.equals("Rock") && AIchoice == 2);
                  (choice.equals("Paper") && AIchoice == 0)
                  (choice.equals("Scissors") && AIchoice == 1); {
            System.out.println(" Dang You Win ");
        } else { 
            System.out.println("I Win!");

        }



    
    }
    
}
