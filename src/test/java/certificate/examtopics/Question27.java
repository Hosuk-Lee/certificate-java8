package certificate.examtopics;

public class Question27 {

    public class A {
        public A(){
            System.out.println("A");
        }
    }
    public class B extends A {
        public B(){
            System.out.println("B");
        }
    }
    public class C extends B{
        public C(){
            System.out.println("C");
        }
    }

    public void excute() {
        A a = new C();
        System.out.println("-------");
        C c = new C();
    }

    public static void main(String[] args) {
        Question27 q = new Question27();
        q.excute();
    }

}
