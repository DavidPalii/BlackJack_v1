public class Card {
    private int suit;
    private int value;

    public Card(int s, int v){
        suit = s;
        value = v;
    }
    public String toString(){
        if (suit == 0){
            if(value == 1)
                return "A♠️";
            else if(value > 1 && value < 11)
                return value + "♠️";
            else if(value == 11)
                return "J♠️";
            else if(value == 12)
                return "Q♠️";
            else if(value == 13)
                return "K♠️";
        }
        else if(suit == 1){
            if(value == 1)
                return "A♥️";
            else if(value > 1 && value < 11)
                return value + "♥️";
            else if(value == 11)
                return "J♥️";
            else if(value == 12)
                return "Q♥️";
            else if(value == 13)
                return "K♥️";
        }
        else if(suit == 2){
            if(value == 1)
                return "A♣️";
            else if(value > 1 && value < 11)
                return value + "♣️";
            else if(value == 11)
                return "J♣️";
            else if(value == 12)
                return "Q♣️";
            else if(value == 13)
                return "K♣️";
        }
        else if(suit == 3){
            if(value == 1)
                return "A♦️";
            else if(value > 1 && value < 11)
                return value + "♦️";
            else if(value == 11)
                return "J♦️";
            else if(value == 12)
                return "Q♦️";
            else if(value == 13)
                return "K♦️";
        }
        return "ERROR";
    }


}
