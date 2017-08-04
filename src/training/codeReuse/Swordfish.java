package training.codeReuse;

/**
 * Created by Ivan_Stepantsov on 8/3/2017.
 */
class Swordfish extends AquaticAnimal {
    public void birth() {
        System.out.println("Birth of fish. swim!");
    }

    public void nutrition(String nutrition) {
        System.out.format("Nutrition of organism made mostly by other smaller fish and %s.\n", nutrition);
    }

    @Override
    public void selfConscious() {
        System.out.println("SelfConscious is missing according to our sources.");
    }
}