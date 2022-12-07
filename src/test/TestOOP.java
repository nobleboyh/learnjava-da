package test;

class Animal implements WalkingAnimal {
    public void animalSound() {
        System.out.println("An animal can make a sound.");
    }

    @Override
    public void walking() {
        System.out.println("Animal can walk");
    }
}

class Cow extends Animal {
    public void animalSound() {
        System.out.println("A cow says: Moooo");
    }
}

class Cat extends Animal {
    public void animalSound() {
        System.out.println("A cat says: Meeooww");
    }
}

class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myCow = new Cow();
        Animal myCat = new Cat();

        myAnimal.animalSound();
        myCow.animalSound();
        myCat.animalSound();

        WalkingAnimal walkingAnimal = new Cow();
    }
}

interface WalkingAnimal{
    void walking();

}

abstract class FourLegAnimal{
    public final int LEGS = 4;
    public abstract String name();
    public void sound(){
        System.out.println(randomShit() + name());
    }
    private String randomShit(){
        return "Moo";
    }
}