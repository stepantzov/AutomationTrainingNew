package training.codeReuse;

/**
 * Created by Ivan_Stepantsov on 8/3/2017.
 */
class Swordfish extends AquaticAnimal {
    public void birth() {
        System.out.println("Birth of fish. swim!");
    }

    public void nutrition(String nutrition) {
        System.out.println("nutrition of organism made mostly by other smaller fish and " + nutrition);
    }

    @Override
    public void selfConscious() {
        System.out.println("selfConscious is missing according to our sources");
    }
}