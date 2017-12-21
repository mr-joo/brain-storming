package Practice05;

public class Quiz05 {
    public static void main(String[] args) {
        int[] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] ball3 = new int[3];

        for (int x = 0; x < 20; x++){
            int i = (int) (Math.random() * ballArr.length);
            int j = (int) (Math.random() * ballArr.length);
            int tmp = 0;

            tmp = ballArr[i];
            ballArr[i] = ballArr[j];
            ballArr[j] = tmp;
        }

        //배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사
        System.arraycopy(ballArr, 0, ball3, 0, 3);

        System.out.print(ball3[0] * 100 + ball3[1] * 10 + ball3[2]);

    }
}
