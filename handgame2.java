import java.util.Random;
import java.util.Scanner;

public class handgame2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int[] options = {0, 1, 2};
        
        for (int i=0; i<3; i++){
            System.out.println(options[i]);
        }


        // 0 = Rock,    1 = Paper,   2 = Scissors
        System.out.println(" We are going to play rock, paper, scissors. You enter your choise and I will after ");
        
        int choice = scanner.nextInt();
        
        int AIchoice = random.nextInt(3);
        
        String[] Ai = {"Rock", "Paper", "Scissors"};
        while (choice!=9) {
            System.out.println("I chose " + Ai[AIchoice]);
            System.out.println("You chose " + Ai[choice] );
            
            if (choice == (options[AIchoice])) {
                System.out.println("Tie!");
            } else if ((choice == 0 && AIchoice == 2) ||
                    (choice == 1 && AIchoice == 0) ||
                    (choice == 2 && AIchoice == 1)) {

                System.out.println(" Dang You Win ");
            } else { 
                System.out.println("I Win!\n");

            }
            
            System.out.println("Alright, another round. Enter your choice again");
            AIchoice = random.nextInt(3);
            choice = scanner.nextInt();

        }
        
        System.out.println("Thanks for playing!");


    
    }
    
} 
        
        
        

