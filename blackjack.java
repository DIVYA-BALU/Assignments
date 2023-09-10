import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
interface Cards{
     int draw(Random random);
     int Total(List<Integer> cards);
}
class Game implements Cards{
    public int draw(Random random) {
        return random.nextInt(10) + 2; 
    }
    public  int Total(List<Integer> cards) {
        int total = 0;
        int Ace = 0;

        for (int card : cards) {
            if (card == 11) {
                Ace++;
            }
            total += card;
        }

        while (total > 21 && Ace > 0) {
            total -= 10; 
            Ace--;
        }

        return total;
    }
}
public class blackjack {
    public static void main(String args[]){
         Random random =new Random();
         List<Integer> player = new ArrayList<>();
         List<Integer> dealer = new ArrayList<>();
        System.out.println("****************  Game Blackjack  ****************");
        Scanner sc=new Scanner(System.in);
        Game g=new Game();
        player.add(g.draw(random));
        player.add(g.draw(random));

        dealer.add(g.draw(random));
        dealer.add(g.draw(random));
        
        System.out.println("You get a " + player.get(0) + " and a " + player.get(1) + ".");
        int p_total = g.Total(player);
        System.out.println("Your total is " + p_total + ".");
        System.out.println("\n");

        System.out.println("The dealer has a " + dealer.get(0) + " showing, and a hidden card.");
        System.out.println("His total is hidden, too \n");
        
        // Player's turn
        while (true) {
            System.out.print("Would you like to \"hit\" or \"stay\"? ");
            String choice = sc.nextLine().toLowerCase();

            if (choice.equals("hit")) {
                int card = g.draw(random);
                player.add(card);
                p_total = g.Total(player);
                System.out.println("You drew a " + card + ".");
                System.out.println("Your total is " + p_total + ".");
                System.out.println("\n");

                if (p_total > 21) {
                    System.out.println("Bust! Dealer wins");
                    System.exit(0);
                }
            } else if (choice.equals("stay")) {
                break;
            }
        }
        // Dealer's turn
        int d_total = g.Total(dealer);
        System.out.println("Okay, dealer's turn.");
        System.out.println("His hidden card was a " + dealer.get(1) + ".");
        System.out.println("His total was " + d_total + "\n");

        while (d_total < 17) {
            int card = g.draw(random);
            dealer.add(card);
            d_total = g.Total(dealer);
            System.out.println("Dealer chooses to hit");
            System.out.println("He draws a " + card);
            System.out.println("His total is " + d_total+"\n");
        }

        if (d_total > 21 || d_total < p_total) {
            System.out.println("Dealer stays\n");
            System.out.println("Dealer total is " + d_total);
            System.out.println("Your total is " + p_total+"\n");
            System.out.println("YOU WIN!");
        } else if (d_total > p_total) {
            System.out.println("Dealer stays\n");
            System.out.println("Dealer total is " + d_total);
            System.out.println("Your total is " + p_total+"\n");
            System.out.println("DEALER WINS!");
        } else {
            System.out.println("Dealer stays\n");
            System.out.println("Dealer total is " + d_total + ".");
            System.out.println("Your total is " + p_total+"\n");
            System.out.println("It's a TIE!");
        }
    }
    }

