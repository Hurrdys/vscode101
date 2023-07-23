import java.util.Scanner;

public class numberbreak {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("input an integer number");
            int x = scanner.nextInt();
            while(x != 999) {
                System.out.println("The number x equals to " + x);
                for(int j=0; j<5; j++){
                    if( j==3) {
                        System.out.println("X equals to " + x + " and j equals to " + j + " , I break");
                        //break;
                        continue;
                    }
                    System.out.println(x*(j+1));
                }
                System.out.println("input another integer number");
                x = scanner.nextInt();
            }
        }
        System.out.println("You got an input of 999! Congrats, you passed");
    }
}
