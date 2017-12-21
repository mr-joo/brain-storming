package Practice05;

public class Quiz07 {
    public static void main(String[] args) {
        int money = Integer.parseInt("3120");

        System.out.println("money:"+money);

        int[] coinUnit = {500, 100, 50, 10};
        int[] coin = {5, 5, 5, 5};

        for (int i = 0; i < coinUnit.length; i++) {
            int count = money / coinUnit[i];
            int coinNum = count > coin[i] ? coin[i] : count;

            money -= coinUnit[i] * coinNum;
            coin[i] = coin[i] - coinNum;
            //1. 큰 단위의 동전부터 줄 수 있는 개수만큼 줌
            //2. 총 거스름돈에서 1에서 준 금액을 뺌
            //3. 남은 금액에서 줄 수 있는 동전 개수만큼 뺌



            System.out.println(coinUnit[i]+"원: "+coinNum);
        }

        if (money > 0) {
            System.out.println("거스름돈이 부족합니다.");
            System.exit(0);
        }

        System.out.println("=남은 동전의 개수 =");

        for (int i = 0; i < coinUnit.length; i++) {
            System.out.println(coinUnit[i]+"원:"+coin[i]);
        }
    }
}
