import java.util.Scanner;
public class openstory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("On a sunny day, there is a ant called Stick. Stick is 5 months old and is smaller than");
        System.out.println("any other ants in his colonie. He is at the point where he can't be nursed anymore by the ant queen. One day, he decides to go scavaging for food.");
        System.out.println("Walking through the tall grass, Stick is using his antenna to search for a sence of food.");
        System.out.println("Suddenly, his antenna sences there is a peice of gum to the left, but there is also a peice of chip to the right. Stick is at a standstill");
        System.out.println("Do Does Stick goes to the left or rigth? (left/right)");
        String partner = scanner.nextLine();

        if (partner.equalsIgnoreCase("left")) {
            System.out.println(" ");
            System.out.println("Stick decides he wants the gum. He walks towards the gum and can smell that its flavour is strawberry ");
            System.out.println("He finally sees a big blog of red gum. He quickly starts picking at the gum.");
            System.out.println("As Stick is trying to get the gum with his hands, he realize that his hands are geting stuck to the gum.");
            System.out.println("He panics and tries to pull free with his other 2 legs. However, unfortunatly those legs also gets cought and he is offically stuck.");
            System.out.println("Stick has no other option except either call for help or wait. What should he do? (call for help/wait)");
            String gum = scanner.nextLine();
            if (gum.equalsIgnoreCase("call for help")) {
                System.out.println(" ");
                System.out.println("Stick calls for his other ants with his communication system. They recieve that Stick needs help");
                System.out.println("10 soldier ants arrive to see Stick stuck sideways on a peice of gum. They decide to help him");
                System.out.println("However, the helper ants dosen't know what a gum is, thus they don't know it's sticky.");
                System.out.println("The 10 ants tried helping Stick but ending up all stuck to a peice of gum.");
                System.out.println("Since there is no more soldier ants to help and they realize that the gum is not edible, all of the ants died on the gum becuase of lack of water and food.");
            }
            else if (gum.equalsIgnoreCase("wait")) {
                System.out.println(" ");
                System.out.println("Stick decides to wait. He eventually gets tired of waiting and tries eating the gum, but it turns out to be too sticky and non digestable.");
                System.out.println("Stick eventualy passes away becuase of no help and food.");
            }
        }
        else if (partner.equalsIgnoreCase("right")) {
            System.out.println(" ");
            System.out.println("Sticks heads for the chip");
            System.out.println("He finds a orangey triangle shaped object that looks delicious and huge");
            System.out.println("Since Stick is not a greedy little ant, he calls more ants to help transport this chip back to home.");
            System.out.println("3 more ants help Stick carry the chip back. When they arrive, their queen was delighted to see such a big finding of food.");
            System.out.println("The queen thinks of invites the whole colonly to a dinner seriving the giant chip or have the chip all for herself.");
            System.out.println("What should she do? (invite the colonie/save for herself) ");
            String dinner = scanner.nextLine();
            if (dinner.equalsIgnoreCase("invite whole colonie")) {
                System.out.println("The queen tells a messagner ant to invite every ant to this dinner.");
                System.out.println("Later that evening, all 1000 ants show up to this dinner to get a peice of the chip.");
                System.out.println("Incliding Stick who is really exited to eat. Every ant gathers up in front of the queen to make a speech before eating.");
                System.out.println("The quees states 'Welcome, my fellow ants. Tody is a very special day. we are gifted with an amazing meal");
                System.out.println("founded by our newborn, Stick. Round of applause everyone. So, before we dig in, make sure to thank Stick for this once in a life time oppertunity. May we eat.");
                System.out.println("As every ant gets a peice of the chip, they all starts to say 'ouch'. Little did they know, Syick has found a spicy gost pepper chip.");
                System.out.println("The whole colonie starts to scramble as there mouths burnes. They were in despreate need of water.");
                System.out.println("After a mintue, the chip is so hot, the ants starts to turn red.");
                System.out.println("They were turning into fire ants. ");
                System.out.println(" ");
                System.out.println("After a couple hours of atapting as a fire ant. An exterminator was called because a human noticed a fire ant colonie in there front yard.");
                System.out.println("Soon the exterminator came and sprayed toxins on their coloinie killing all the ants.");
                System.out.println("That chip, Stick found was the last meal for the colonie... ");
            }
            else if (dinner.equalsIgnoreCase("save for herself")) {
                System.out.println("The queen starts eating the chip by herself.");
                System.out.println("the chip was so hot it burned the queen making red and making her a fire ant.");
                System.out.println("The queen calls for help, however, the other ants did not reconize her mistaken her for a unkown fir ant.");
                System.out.println("Guards and soldiers were called and started captureing the queen. She was than put into ant jail and left to die.");
                System.out.println("While Stick and the other ants wonderd where their queen went. The whole colonie turned into a disaster becuase there were no queen.  ");
            
            }
        
        }    
    }   
}
