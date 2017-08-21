package training.oop;

/**
 * Created by Ivan_Stepantsov on 8/3/2017.
 * current class contains some examples of encapsulation
 * set and get methods are included here
 */
class Human extends MammalAnimal {
    private int humanAge;

    public int getHumanAge() {
        return humanAge;
    }

    public void setHumanAge(int humanAge) {
        if (humanAge < 0 || humanAge > 100) {
            throw new RuntimeException("Invalid age.");
        }
        this.humanAge = humanAge;
    }

    public void birth() {
        System.out.println("Birth of Human. ROOO!");
    }

    public void movement() {
        System.out.println("Movement of Organism made mostly by walking using two feets only! amazing!");
    }

    //below is the example of abstract method from abstract class define
    public void selfConscious() {
        System.out.println("Self conscious is present. Enable high levels of abstract reasoning, language, " +
                "problem solving, sociality, and culture through social learning.");
    }
}