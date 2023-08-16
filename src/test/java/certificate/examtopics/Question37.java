package certificate.examtopics;

public class Question37 {

    public static void main(String[] args) {
        Question37 q = new Question37();
        System.out.println(isAvailable);
        isAvailable = q.doStuff();
        System.out.println(isAvailable);
    }

    static boolean isAvailable = false;
    public static boolean doStuff(){
        return !isAvailable;
    }
}
