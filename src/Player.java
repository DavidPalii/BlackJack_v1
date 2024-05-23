import java.util.ArrayList;

public class Player {
    int playerScore;

    ArrayList<Card> playerHand = new ArrayList<>();
    public Player(){
        playerScore = 0;

    }

    public void showHand(){ // показує карти на руках
        for(int i = 0; i < playerHand.size(); i++)
            System.out.println(playerHand.get(i));
    }
    public void receiveCards(Card someCards){ // через жопу зроблена хуйня для того щоб заповнити колоду на руках ігрока
        playerHand.add(someCards);
    }
    public void dropHand(){ // скидує карти
        playerHand.clear();
    }
}
