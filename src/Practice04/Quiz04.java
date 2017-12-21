package Practice04;

public class Quiz04 {
    public int count() {
        int sum = 0;
        int count = 0;

        for (int i = 1; i < 1000; i++) {
            if (i % 2 == 0){
                sum += i * -1;
            } else {
                sum += i;
            }

            count++;

            if (sum >= 100) {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Quiz04 quiz04 = new Quiz04();
        System.out.println(quiz04.count());
    }
}
