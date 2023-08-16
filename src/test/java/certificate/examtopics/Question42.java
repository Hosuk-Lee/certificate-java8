package certificate.examtopics;

import java.nio.charset.Charset;

public class Question42 {


    public static String maskCC1(String creditCard){
        String x = "xxxx-xxxx-xxxx-";
        StringBuilder sb = new StringBuilder(x);
        sb.append(creditCard,15,19);
        CharSequence cs = x;
        return sb.toString();
    }

    public static void main(String[] args) {

        System.out.println(maskCC1("1234-1234-1234-5678"));

    }

}
