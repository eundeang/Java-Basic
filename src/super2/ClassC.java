package super2;

public class ClassC extends ClassB{
    public ClassC() {
        /*
        자바에서 클래스 내에 어떠한 생성자도 정의하지 않는다면 자동으로 default생성자를 선언해주어 super클래스의 선언이 생략해도 됐다.
        그러나 해당 클래스는 ClassB에서 생성자 선언이 하나 이상 존재했으므로, 직접 매개변수를 할당해주어 생성자 호출을 해주어야 한다.
         */
        //super();
        super();
        System.out.println("ClassC 생성자");
    }
}
