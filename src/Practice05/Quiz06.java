package Practice05;

public class Quiz06 {
    public static void main(String[] args) {
        int[] coinUnit = {500, 100, 50, 10};

        int money = 2680;
        System.out.println("money="+money);

        for (int i = 0; i < coinUnit.length; i++) {
            //1. 금액을 동전으로 나눔
            //2. 나머지를 다시 나눔
            int count = money / coinUnit[i];
            money %= coinUnit[i];
            System.out.println(coinUnit[i] + "원:" + count);
        }
    }
}
