import java.util.Scanner;
public class convo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want to be my partner for a school activity? (yes/no): ");
        String partner = scanner.nextLine();
        if (partner.equalsIgnoreCase("yes")) {
        System.out.println("Yay! We are going to do great!");
        } else { 
        System.out.println("Dang, that is mean of you :( ");
        }

        System.out.println(" ");
        System.out.println("Where do you want to go eat lunch? (pizza store/sushi store): ");
        String lunch = scanner.nextLine();
        if (lunch.equalsIgnoreCase("pizza store")) {
            System.out.println("Nah pizza too unheathy. Lets go get sushi!");
            }
        if (lunch.equalsIgnoreCase("sushi store")) {
            System.out.println("Bet, I love sushi, lets go!");
            }

        System.out.println(" ");
        System.out.println("What class do you have after lunch?");
        String afterlunch = scanner.nextLine();
        if (afterlunch.equalsIgnoreCase("gym class")) {
            System.out.println("Yo! Me too");
            } else { 
            System.out.println("Thats cool.");
            }

    }
}
