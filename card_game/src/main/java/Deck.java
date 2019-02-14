import java.util.ArrayList;
import java.util.Collections;

public class Deck {
 private ArrayList<Card> cards;

 public Deck() {
     cards = new ArrayList<>();
 }



 public int checkLength() {
        return this.cards.size();
    }



 public void createDeck(){
     for (SuitType suit : SuitType.values()){
         for(RankType rank : RankType.values()){
            Card card = new Card(suit, rank);
            this.cards.add(card);
         }
     }
 }

 public void shuffleDeck() {
     Collections.shuffle(cards);
 }

 public Card dealCard(){
     return this.cards.get(0);
 }






}