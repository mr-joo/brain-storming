package Practice04;

public class Quiz08 {
    public static void main(String[] args){
        int result = 10;
        for (int i = 0; i < 11; i++){
            for (int j = 0; j < 11; j++){
                result = (2 * i) + (4 * j);

                if (result == 10){
                    System.out.println("x=" + i + ", " + "y=" +j);
                }
            }
        }
    }
}
