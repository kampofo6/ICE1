package exercise1;
import java.util.Scanner;
/**
 * A class   and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * 
 * @author Kojo Ampofo Feburary 3rd 2023
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
         Card [] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card mycard = new Card();
            hand[i] = mycard;
            //card.setValue(insert call to random number generator here)
              mycard.setValue((int)(Math.random() * 13 )+1);
                    
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
            mycard.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
        }
        System.out.print(hand);

        // insert code to ask the user for Card value and suit, create their card
        Card card2 = new Card();
        
        System.out.println("Enter your card value: ");
        int value = scan.nextInt();
        System.out.println("Enter your card suit: ");
        String Suit = scan.next();
        
        card2.setValue(value);
        card2.setSuit(Suit);
        
        // and search the hand here. 
        boolean checker = false; 
        for (int i = 0; i < hand.length; i++ ){
            System.out.println(hand[i].getValue());
             System.out.println(hand[i].getSuit());
             
             if( hand[i].getSuit() == Suit && hand[i].getValue() == value){
             
                 checker = true;
             }
           
        }
          
        if(checker==true){
        System.out.println("Your card is in the deck");

        }
             
        else{
            System.out.println("Your card is not in the deck");
        }
         
        
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Kojo");
        System.out.println();
        
        System.out.println("My career ambitions: Are to become a Full time Software Developer/ Engineer");
        System.out.println("Im very active on LinkedIn");
        	

        System.out.println("My hobbies Include:");
        System.out.println("-- Music Production");
        System.out.println("-- Cooking");
        System.out.println("-- Flims");
        System.out.println("-- Art");
        System.out.println("Fashion");
        
    
    }
        
    
}

    
    
    }


