package certificate.examtopics;

public class Question19 {

    // Exception 문제.

    //The answer should be C. The compilation error can be removed by doing this -
    void readCard (int cardNo) throws Exception {
        System.out.println("Reading Card");
    }
    void checkCard (int cardNo) throws RuntimeException {
        System.out.println("Checking Card");
    }
    public static void main (String[] args) {
        Question19 ex = new Question19();
        int cardNo = 12344;
        //ex.readCard (cardNo) ;
        ex.checkCard (cardNo);
    }
}
