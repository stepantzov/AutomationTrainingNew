package training.codeReuse;

/**
 * Created by Ivan_Stepantsov on 8/3/2017.
 */
class Human extends MammalAnimal {
    public void birth() {
        System.out.println("Birth of Human. ROOO!");
    }

    public void movement() {
        System.out.println("movement of Organism made mostly by walking using two feets only! amazing!");
    }

    //below is the example of abstract method define
    public void selfConscious() {
        System.out.println("enable high levels of abstract reasoning, language, /n" +
                "problem solving, sociality, and culture through social learning");
    }
}