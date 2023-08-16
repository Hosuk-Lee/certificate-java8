package certificate.examtopics;

public class Question30 {
    public static void main(String[] args) {

        String [] arr = {"A", "B" , "c", "D"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
            if (arr[i].equals("C")) {
                continue;
            }
            System.out.println("Work done");
            break;
        }
    }
}
