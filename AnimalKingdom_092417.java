class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog's sound is: bhow bhow!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("The cat's sound is: meow meow!");
    }
}

class Bird extends Animal {
    @Override
    void makeSound() {
        System.out.println("The bird's sound is: chewn chewn!");
    }
}

public class AnimalKingdom {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Bird();
        animals[3] = new Animal();

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
