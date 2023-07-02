import java.io.Reader;
import java.util.Scanner;
public class impossiblegate {
    
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println(" One day, you were on a trip to the Sahara desert with your travel group.");
        System.out.println(" You were exploring the deserts when you decided to leave your group and wonder into a sand cave ");
        System.out.println(" In the dark cave, you were able to see giant sculptures of ancient figures.");
        System.out.println(" You walked in front of a giant statue and gazed at the mummie. ");
        System.out.println(" All of sudden the eyes of the mummie turned red and the ground started to shake");
        System.out.println(" Sand and stone started to fall from the top and blocked off the entrence of the cave. You were trapped.");
        System.out.println(" The statue with its eyes glowing red, said, 'in order for a traspasser to escape, it needs to answer all the question correctly, if not life could be fatel. As for a great mind, it shall answer with ease and be granted with treasure. ");
        System.out.println("'First question is give me a 4 digit palindrome' ");
        String palindrome = scanner.nextLine();

         int l = 0, r = palindrome.length();

        for (int i=0; i<r; i++) {
            if (palindrome.charAt(i) != palindrome.charAt(r-1-i)) {
                System.out.println("  'This is not a Palindrome, you are not supposed to be here. A punishment will fall on you. Sand started to fall and soon you were sufficated in sand an died.");
                break;
            }
            if (i==r-1) {
                System.out.println("This is a Palindrome. ");
                Scanner apples = new Scanner(System.in);
                System.out.println(" 'If you have a bowl with 6 apples, and you take 4 away, how many do you have?");
                String hehe = scanner.nextLine();
                 if (hehe.equalsIgnoreCase("4")) {
                    System.out.println("That is correct");
                     Scanner suv = new Scanner(System.in);
                     System.out.println(" ' If an plane crashes on the border between Cannada and Usa, Where would the survivors be buried?");
                    String plane = scanner.nextLine();
                        if (plane.equalsIgnoreCase("Survivers don't get buried")){
                        System.out.println("That is correct, well done. You have asnwered all my quetion. I shall grant you with the treasure and a gate way out. ");
                        System.out.println("You then collect all the valuables and leave the cave at last. You return to your group and use the money you got for a wonder dinner with your friends.");
                        } else {
                            System.out.println("That is not correct and you faild on the last question which has the worst punishment. You would have to suffer becuase there will no be a way out, good luck.");
                            System.out.println("The mummie's eye turned off and you are left to die in the cave with no exit.");
                }
             } else { 
                    System.out.println(" 'You did not understand my questiion, punishment will arise' ");
                    System.out.println(" Thousands of scorpinions started to arise from the ground and soon you get stung and died from the venom ");
                        }
                }
            }     
        }
    }
    
