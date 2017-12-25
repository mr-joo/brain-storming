package Practice07;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    private final int KWANG_1_INDEX = 0;
    private final int KWANG_3_INDEX = 2;
    private final int KWANG_8_INDEX = 7;

    SutdaDeck() {
        for (int i = 0; i < cards.length; i++) {
            cards[i] = new SutdaCard((i % 10) + 1, false);
        }
        cards[KWANG_1_INDEX].isKwang = true;
        cards[KWANG_3_INDEX].isKwang = true;
        cards[KWANG_8_INDEX].isKwang = true;
    }

    public void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int j = (int) (Math.random() * 20f);

            SutdaCard tmp = cards[i];
            cards[i] = cards[j];
            cards[j] = tmp;
        }
    }

    public SutdaCard pick(int index) {
        return cards[index];
    }

    public SutdaCard pick() {
        return pick((int) (Math.random() * 20f));
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + (isKwang ? "K":"");
    }
}

public class Quiz01 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i]+",");
        }

        System.out.println();
        System.out.println(deck.pick(0));
    }
}
