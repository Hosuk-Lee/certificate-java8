package certificate.examtopics;

public class Question18 {
    public static void main(String[] args) {
        String shirts[][] = new String[2][2];
        shirts[0][0] = "red";
        shirts[0][1] = "blue";
        shirts[1][0] = "small";
        shirts[1][1] = "medium";
        //red:blue:small:medium:
        for (String[] c : shirts) {
            for (String s : c) {
                System.out.print(s + ":");
            }
        }
    }
}