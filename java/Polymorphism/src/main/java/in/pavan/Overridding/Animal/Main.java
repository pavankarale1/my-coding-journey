package in.pavan.Overridding.Animal;

public class Main {
    static void main(String[] args) {
        Animal animal= new Animal();
        Bird bird = new Bird();
        Cat cat = new Cat();

        animal.sound();
        bird.sound();
        cat.sound();
    }
}
