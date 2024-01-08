package poly.basic.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Animal[] animalArr = {dog,cat,caw};
        // Animal[] animalArr = new Animal[]{dog,cat,caw};
        // 이 코드를 추적하여 했기 때문에, new Animal[]을 생략 할 수 있다.
        for (Animal animal : animalArr){
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 시작");
        }
    }
}
