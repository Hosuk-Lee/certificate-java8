package certificate.examtopics;

public class Question22 {

    public static void main(String[] args) {
        int num = 5;
        do {
            System.out.println("@" + num);
            System.out.println(num-- + " ");
            System.out.println("@" + num);
        } while (num==0);
    }
}
