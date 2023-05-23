package certificate;

import org.junit.Test;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class A01 {

    @Test
    public void test01() {
        int x = 1, y = 1;
        if (x++ < ++y) {
            System.out.print("Hello ");
        } else {
            System.out.print("Welcome ");
        }
        System.out.println("Log " + x + ":" + y);
        /*
            What is the result?
            A. Hello Log 2:2
            B. Welcome Log 1:2
            C. Welcome Log 2:1
            D. Hello Log 1:2
            Answer:
        */
    }

    @Test
    public void test02() {
        int i = 10, j = 20;
        int k = (j += i) / 5;
        System.out.println(i + ":" + j + ":" + k);
        /*
            What is the result?
            A. 10 : 30 : 6
            B. 10 : 22 : 22
            C. 10 : 22 : 20
            D. 10 : 22 : 6
        * */
    }

    @Test
    public void test03() {
        String date = LocalDate.parse("2014-05-04")
                .format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(date);
        /*
            What is the result?
            A. May 04, 2014T00:00:00.000
            B. 2014-05-04T00:00: 00.000
            C. 5/4/14T00:00:00.000
            D. An exception is thrown at runtime.
        * */
    }

    /* 답 이상함 */
    @Test
    public void test04() {
        int[] stack = {10, 20, 30};
        int size = 3;
        int idx = 0;
        /* line n1 */
        test04_sup1(stack, size, idx);
//        test04_sup2(stack, size, idx);
        test04_sup3(stack, size, idx);
//        test04_sup4(stack, size, idx);
        test04_sup5(stack, size, idx);


    }

    private void test04_sup1(int[] stack, int size, int idx) {
        do {
            idx++;
        } while (idx >= size);
        System.out.println("The Top element : " + stack[idx] + ":" + idx);
    }

    private void test04_sup2(int[] stack, int size, int idx) {
        while (idx < size) {
            idx++;
        }
        try {
            System.out.println("The Top element : " + stack[idx] + ":" + idx);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void test04_sup3(int[] stack, int size, int idx) {
        do {
            idx++;
        } while (idx < size - 1);
        System.out.println("The Top element : " + stack[idx] + ":" + idx);
    }
    private void test04_sup4(int[] stack, int size, int idx) {
        do {
            idx++;
        } while (idx <= size - 1);
        System.out.println("The Top element : " + stack[idx] + ":" + idx);
    }
    private void test04_sup5(int[] stack, int size, int idx) {
        while (idx <= size -1) {
            idx++;
        }
        System.out.println(idx);
        System.out.println("The Top element : " + stack[idx] + ":" + idx);
    }

    @Test
    public void test05() {
        /**
         * Which statement is true about the switch statement.
         * A. It must contain the default section.
         * B. The break statement, at the end of each case block, is optional.
         * C. Its case label literals can be changed at runtime.
         * D. Its expression must evaluate to a collection of values.
         *
         * * 다음 중 스위치 문에 대한 설명으로 맞는 것은 무엇입니까.
         *
         *          가. 기본 섹션을 포함해야 합니다.
         *          * 나. 각 대소문자 블록의 끝에 있는 구분 문은 선택 사항입니다.
         *          다. 대/소문자 레이블 리터럴은 런타임에 변경할 수 있습니다.
         *          라. 식은 값 집합으로 평가되어야 합니다.
         */
    }

    @Test
    public void test06() throws IOException {
        X xobj = new X();
        xobj.printFileContent();
    }
    class X {
        public void printFileContent() throws IOException {
            /* code gose here*/
            throw new IOException();
        }
    }
    /*
        Which two modifications should you make so that the code compiles successfully? (Choose two.)
        두개함수에 throws 처리
     */

    @Test
    public void test07() throws IOException {
        X07 x1 = new X07();
        X07 x2 = new X07();
        x1.i=3;
        x1.j=4;
        x2.i=5;
        x2.j=6;
        System.out.println(
                x1.i + "," + x1.j + ","
              + x2.i + "," + x2.j
        );
    }
    static class X07 {
        static int i;
        int j;
    }

    @Test
    public void test08() throws IOException {
        String[][] arr = { {"A","B","C"}, {"D","E"}};
        for ( int i=0; i<arr.length; i++) {
//            System.out.print("arr.length : [" + arr.length + "]  - ");
            for (int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
                if ( arr[i][j].equals("B")) {
                    continue;
                }
            }
            continue;
        }
    }

    @Test
    public void test11() throws IOException {
        String[] strs = {"A", "B"};
        int idx =0;
        for (String s: strs) {
            strs[idx].concat(" element " + idx);
            idx++;
        }
        for (idx = 0 ; idx<strs.length; idx++){
            System.out.println(strs[idx]);
        }
    }

}
