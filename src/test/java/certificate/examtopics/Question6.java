package certificate.examtopics;

public class Question6 {
    
    abstract class Planet {
        // protected void revolve() { }
        protected void revolve() { }
        abstract void rotate();
    }
    
    class Earth extends Planet {

        // void revolve() {} // N3
        // public void revolve() {} //N3 OK
        protected void revolve() {} // N3 OK
        void rotate() {}
        
//        @Override
//        void rotate() {}
    }

    /*
        접근 제한자(Access Modifier)는 말 그대로 접근을 제한하기 위해 사용됩니다
        프로텍티드 보다 디폴트가 높기 때문.

        public 접근 제한: public 접근 제한은 모든 패키지에서 아무런 제한 없이 필드와 메소드를 사용할 수 있도록 해줍니다.

        protected 접근 제한:
            protected 접근 제한은 default 접근 제한과 마찬가지로 같은 패키지에 속하는 클래스에서 필드와 메소드를 사용할 수 있도록 합니다.
            차이점으로 다른 패키지에 속한 클래스가 해당 클래스의 자식 클래스라면 필드와 메소드를 사용할 수 있습니다.

        default 접근 제한:
            필드와 메소드를 선언할 때 접근 제한자를 생략하면 default 접근 제한을 가집니다.
            default 접근 제한은 같은 패키지에서는 아무런 제한 없이 필드와 메소드를 사용할 수 있으나 다른 패키지에서는 필드와 메소드를 사용할 수 없도록 합니다.

        private 접근 제한:
            private 접근 제한은 동일한 패키지이건 다른 패키지이건 상관없이 필드와 메소드를 사용하지 못하도록 제한합니다.
            오로지 클래스 내부에서만 사용할 수 있습니다.

        In this case, can't change resolve from
        protected > default
        But you can change it to
        protected > protected
        protected > public

        Correct answers are C, D.
        We only have to make changes in //line n3
        Either we have to keep it the same as protected or we can widen the scope to public.
        private< (default) < protected < public

    * */

}
