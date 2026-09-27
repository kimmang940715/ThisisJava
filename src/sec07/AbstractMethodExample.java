package sec07;

public class AbstractMethodExample {
    static void main() {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        // 매배견수의 다형성
        animalSound((new Dog()));
        animalSound((new Cat()));

    }

    public static void animalSound(Animal animal) {
        animal.sound();
    }
}
