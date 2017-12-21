package Practice04;

public class Quiz02 {
    public int sum(){
        int sum = 0;
        for (int i = 1; i < 21; i++){
            if (i % 2 != 0 && i % 3 != 0){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args){
        Quiz02 quiz01 = new Quiz02();
        System.out.println(quiz01.sum());
    }
}

