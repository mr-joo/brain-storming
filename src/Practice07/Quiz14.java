package Practice07;
class SutdaCard14 {
    final int NUM;
    final boolean IS_KWANG;

    SutdaCard14() {
        this(1, true);
    }

    SutdaCard14(int num, boolean isKwang) {
        this.NUM = num;
        this.IS_KWANG = isKwang;
    }

    public String toString() {
        return NUM + (IS_KWANG ? "K":"");
    }
}

public class Quiz14 {
    public static void main(String[] args) {
        SutdaCard14 card = new SutdaCard14(1, true);
    }
}
