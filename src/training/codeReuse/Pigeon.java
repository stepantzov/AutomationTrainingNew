package training.codeReuse;

/**
 * Created by Ivan_Stepantsov on 8/3/2017.
 */
class Pigeon extends OrnithoAnimal {
    public void birth() {
        System.out.println("Birth of bird. Fly!");
    }

    public void nutrition(String nutrition) {
        System.out.println("nutrition of Organism made mostly by insects and " + nutrition);
    }
}