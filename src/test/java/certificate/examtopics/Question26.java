package certificate.examtopics;

import java.util.ArrayList;
import java.util.List;

public class Question26 {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("B");

        if (list.remove("B")) {
            System.out.println(list);
            list.remove("E");
        }

    }
}
