package super2;

public class ClassB extends ClassA {
    public ClassB() {
        super(); // 기본 생성자 생성 가능
        System.out.println("ClassB 생성자" );
    }

    public ClassB(int a, int b) {
        super(); // 기본 생성자 생성 가능
        System.out.println("ClassB 생성자 a=" + a + "b=" + b);
    }
}
