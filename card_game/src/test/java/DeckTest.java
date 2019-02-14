import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {
    Deck deck;
    Card card;


    @Before
    public void before() {
        deck = new Deck();
    }

    @Test
    public void cardsArrayStartsEmpty(){
        assertEquals(0, deck.checkLength());
    }

    @Test
    public void cardsArrayHasAllCards(){
        deck.createDeck();
        assertEquals(52, deck.checkLength());
    }

    
}
