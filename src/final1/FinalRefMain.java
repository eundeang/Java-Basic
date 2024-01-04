package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();
        //final이기 때문에 재할당 불가능(컴파일 에러)
        //data = new Data();

        //참조 대상의 값은 변경 가능
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
