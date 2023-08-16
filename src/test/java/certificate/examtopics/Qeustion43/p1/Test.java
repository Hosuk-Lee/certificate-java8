package certificate.examtopics.Qeustion43.p1;

public class Test {

    public static void main(String[] args) {
        Acc obj = new Acc();
        int a = obj.a;
        // 'b' has private access in 'certificate.examtopics.Qeustion43.p1.Acc'
        // obj.b;
        int c = obj.c;
        int d = obj.d;
    }
}
