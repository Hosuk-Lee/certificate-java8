package certificate.examtopics.Qeustion43.p2;

import certificate.examtopics.Qeustion43.p1.Acc;

public class Test extends Acc {

    public void t(){
        // 'a' is not public in 'certificate.examtopics.Qeustion43.p1.Acc'. Cannot be accessed from outside package
        // int a = super.a;
        // 'b' has private access in 'certificate.examtopics.Qeustion43.p1.Acc'
        // int b = super.b;
        int c = super.c;
        int d = super.d;
    }

    public static void main(String[] args) {
        Acc obj = new Acc();
        // obj.a; 'a' is not public in 'certificate.examtopics.Qeustion43.p1.Acc'. Cannot be accessed from outside package
        // obj.b; 'b' has private access in 'certificate.examtopics.Qeustion43.p1.Acc'
        // obj.c; 'c' has protected access in 'certificate.examtopics.Qeustion43.p1.Acc'
//        int a = obj.a;
//        int b = obj.b;
//        int c = obj.c;
        int d = obj.d;
    }
}
