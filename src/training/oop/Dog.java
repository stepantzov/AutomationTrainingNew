package training.oop;

/**
 * Created by Ivan_Stepantsov on 8/3/2017.
 */
class Dog extends MammalAnimal {
    public void birth() {
        System.out.println("Birth of dog. Bark!");
    }

    public void movement() {
        System.out.println("Movement of dog made mostly by Walk by using four feet.");
    }

    @Override
    public void selfConscious() {
        System.out.println("SelfConscious is missing according to our sources.");
    }
}