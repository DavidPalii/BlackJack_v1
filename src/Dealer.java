import java.util.ArrayList;

public class Dealer extends Player{
    int cardDrownTimes = 0;
    Deck deck = new Deck();
    int dealerScore;
    ArrayList<Card> dealerHand = new ArrayList<>();
    public Dealer(){
        dealerScore = 0;
    }

    public void dealToPlayer(Player p1){ // дає карту ігроку
        if(cardDrownTimes == 40) {
            deck.regenerateDeck();
            cardDrownTimes = 0;
        }
        p1.receiveCards(deck.getRandomCard());
        cardDrownTimes++;
    }
    public void dealToDealer(){ // дає карту драгділеру
        if(cardDrownTimes == 40){
            deck.regenerateDeck();
            cardDrownTimes = 0;
        }
        dealerHand.add(deck.getRandomCard());
        cardDrownTimes++;
    }
    public void showHand(){ // показує карти на руках
        for(int i = 0; i < dealerHand.size(); i++)
        System.out.println(dealerHand.get(i));
    }
    public void showDeck(){ // показує оригінальну колоду для дебагу
        deck.showDeck();
    }
    public void dropHand(){ // скидує карти
        playerHand.clear();
    }
}
