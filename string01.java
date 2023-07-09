import java.util.Random;

public class string01 {
    public static void main(String[] args) {
        String[] tennisPros = {"Hurrdy", "Roger", "Carlos", "Nadal", "Murray"};
        int p = tennisPros.length;
        for(int i=0; i<p; i++){
            System.out.println("My " + (i+1) + " Favourite tennisPros is " + tennisPros[i]);
        }
        Random rand = new Random();
        int x;
        for(int i=0; i<10; i++){
            x = rand.nextInt(1, 6);
            System.out.println(x);
        }

        x = rand.nextInt(1, 6);
        System.out.println("Hey! My favourit tennisPros is " + tennisPros[x]);
    }
}