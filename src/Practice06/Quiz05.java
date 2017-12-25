package Practice06;

public class Quiz05 {
    public static void main(String[] args) {
        Students s = new Students("홍길동",1, 1, 100, 60, 76);

        System.out.println(s.info());
    }
}

class Students {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Students(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal() {
        return kor + eng + math;
    }

    float getAverage() {
        return (int)(((getTotal() / 3f) * 10) + 0.5f) / 10f;
    }

    public String info() {
        return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
    }
}
