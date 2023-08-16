package certificate.examtopics;

public class Question23 {

    public static void main(String[] args) {
        int x = 100;
        int a = x++; // 100 : 101
        int b = ++x; // 102 : 102
        int c = x++; // 102 : 103
        int d = (a<b) ? (a<c) ? a: (b<c) ? b:c : x;

        // (100<102) ? (100<102) ? a: (102<102) ? b:c : x;
        // x;
        System.out.println(x);
        System.out.println(d);
    }
}
