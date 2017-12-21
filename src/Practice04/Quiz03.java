package Practice04;

public class Quiz03 {
    public int sum(){
        int sum = 0;
        int totalSum = 0;

        for (int i = 1; i < 11; i++){
            sum += i;
            totalSum += sum;
        }
        return totalSum;
    }

    public static void main(String[] args){
        Quiz03 quiz03 = new Quiz03();
        System.out.println(quiz03.sum());
    }
}
