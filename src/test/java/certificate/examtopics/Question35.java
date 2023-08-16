package certificate.examtopics;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Question35 {

    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        // Exception in thread "main" java.time.DateTimeException: Invalid value for MonthOfYear (valid values 1 - 12): 20
        // LocalDate date2 = LocalDate.of(6, 20, 2014);
        LocalDate date2 = LocalDate.of(2023, 7, 31);
        LocalDate date3 = LocalDate.parse("2023-07-31", DateTimeFormatter.ISO_DATE);
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
        System.out.println("date3 = " + date3);
    }

}
