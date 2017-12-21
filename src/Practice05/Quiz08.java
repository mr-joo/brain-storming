package Practice05;

public class Quiz08 {
    public static void main(String[] args) {
        int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
        int[] counter = new int[4]; // {0, 0, 0, 0}

        for (int i = 0; i < answer.length; i++) {
            //answer 배열에 있는 숫자의 개수를 구한다
            counter[answer[i] - 1]++;
        }

        for (int i = 0; i < counter.length; i++) {
            //answer에서 구한 숫자의 개수만큼 *을 찍는다
            System.out.print(counter[i]);
            for (int j = 0; j < counter[i]; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
