package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
    /**
    * static 키워드가 없는 변수, 메서드는 컴파일 에러 발생
    * 만들어낸 객체중에서 어떤 것을 참조해야 할지 모르니까, 컴파일 에러가 발생하는 것!!
    **/
    //  instanceValue++;
    //  instanceMethod();

        // static 키워드를 사용한 변수, 메서드만 사용 가능
        staticValue++;
        staticMethod();
    }
    public void instanceCall(){
        /**
         * 본인의 인스턴스 변수에 접근하는 것이기 때문에 static 메소드와는 달리 컴파일 에러 발생 ❌
         **/
        instanceValue++;
        instanceMethod();

        // DecoData가 사용하는 static 변수 이기 때문에 사용 가능함 :: DecoData.staticValue++와 같은 말
        staticValue++;
        staticMethod();
    }
    private void instanceMethod(){
        System.out.println("instanceValue=" + instanceValue);
    }
    private static void staticMethod(){
        System.out.println("staticValue=" + staticValue);
    }
}
