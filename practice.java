public class practice {
   public static void main(String[] args) {
        for(int i=0; i<2; i++){
            System.out.println("Please note this is round" + i);
            for(int j=0; i<10; j++) {
                if(j==5) {
                    System.out.println("oh, you have i equals to " + j + 
                        ", I have to break your prgram now!");
                    break;
                }
                System.out.println(i*(j+1));
            }
        }
   }      
}

