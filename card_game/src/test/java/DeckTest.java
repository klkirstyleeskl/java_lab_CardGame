import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {
    Deck deck;
    Card card;


    @Before
    public void before() {
        deck = new Deck();
        deck.createDeck();
//        deck.shuffleDeck();
    }

//    @Test
//    public void cardsArrayStartsEmpty(){/
//        assertEquals(0, deck.checkLength());
//    }

    @Test
    public void cardsArrayHasAllCards(){
        assertEquals(52, deck.checkLength());
    }

    @Test
    public void canDealACard(){
        Card card = deck.dealCard();
        assertEquals(SuitType.HEARTS, card.getSuit());
        assertEquals(RankType.ACE, card.getRank());
    }






}
