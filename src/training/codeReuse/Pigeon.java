package training.codeReuse;

/**
 * Created by Ivan_Stepantsov on 8/3/2017.
 */
class Pigeon extends OrnithoAnimal {
    public void birth() {
        System.out.println("Birth of bird. Fly!");
    }

    public void nutrition(String nutrition) {
        System.out.format("Nutrition of Organism made mostly by insects and %s\n", nutrition);
    }

    @Override
    public void selfConscious() {
        System.out.println("SelfConscious is missing according to our sources.");
    }
}