package certificate.examtopics;

public class Question20 {

    public static void main(String[] args) {
        int x = 5;
        System.out.println("@"+x);
        while(isAvailable(x)) {
            System.out.println("@"+x);
            System.out.print(x);
            x--; // Answer B - Its ok.
        }

        Integer b = 0;
        System.out.println("--");
        System.out.println(b);
        plus(b);
        System.out.println(b);
        Question20 q = new Question20();
        q.pp(b);
        System.out.println(b);
    }
    public void pp(int c) {
        c+=1;
    }
    public static void plus(Integer b){
        b+=1;
        b++;
        b++;
        System.out.println(b);
    }

    public static boolean isAvailable (int x) {
        return x-- > 0 ? true : false;
    }
}
