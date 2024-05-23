public class Deck{
    Card[][] deck;
    public Deck(){
        int s = 0;
        int v = 1;
        deck = new Card[4][13];
        for(int r = 0; r < deck.length; r++) {
            for (int c = 0; c < deck[r].length; c++) {
                deck[r][c] = new Card(s, v);
                v++;
                if (v == 14) {
                    s++;
                    v = 1;
                }
            }
        }

    }
    public Card getRandomCard(){ // дає рандомну карту з колоди і замінює її на нул
        while (true) {
            int randomRow = (int) (Math.random() * 4);
            int randomCol = (int) (Math.random() * 13);
            if (deck[randomRow][randomCol] != null) {
                Card mem = deck[randomRow][randomCol];
                deck[randomRow][randomCol] = null;
                return mem;
            }
        }
    }
    public void showDeck(){ // Вивидить оригінальний список/колоду карт
        for(int r = 0; r < 4; r ++){
            for(int c = 0; c < 13; c ++){
                System.out.print(deck[r][c]);
            }
            System.out.println();
        }
    }
    public void regenerateDeck(){ //перегенерує список/колоду карт
        int s = 0;
        int v = 1;
        for(int r = 0; r < deck.length; r++) {
            for (int c = 0; c < deck[r].length; c++) {
                deck[r][c] = new Card(s, v);
                v++;
                if (v == 14) {
                    s++;
                    v = 1;
                }
            }
        }
    }




}
