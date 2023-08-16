package certificate.examtopics.Question47;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test {

    public static void checkAge(List<Person> list, Predicate<Person> predicate) {

        for (Person p : list) {
            if ( predicate.test(p) ) {
                System.out.println(p);
            }
        }

    }

    public static void main(String[] args) {
        List<Person> iPlist = Arrays.asList(
                new Person("A", 45),
                new Person("B", 40),
                new Person("C", 35)
        );

        // TODO
        checkAge(iPlist, person -> person.getAge() > 40 );
    }
}
