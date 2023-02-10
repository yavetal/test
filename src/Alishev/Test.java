package Alishev;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();

        animal1.eat();
        dog1.eat();
        cat1.eat();


        test(animal1);
        test(dog1);
        test(cat1);

    }
    public static void test(Animal animal){
        animal.eat();
    }
}