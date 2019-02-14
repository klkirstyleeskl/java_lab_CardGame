import java.util.ArrayList;

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





}