import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        String s = scanner.nextLine();
        int l = 0, r = s.length();

        for (int i=0; i<r; i++) {
            //System.out.println(i + "   " + s.charAt(i) + "   " + s.charAt(r-1-i));
            if (s.charAt(i) != s.charAt(r-1-i)) {
                System.out.println("Not a Palindrome");
                break;
            }
            if (i==r-1) {
                System.out.println("This is a Palindrome");
            }
            
        }
        
    }
}
    

//let user input a number 