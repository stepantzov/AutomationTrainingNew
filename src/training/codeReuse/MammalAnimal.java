package training.codeReuse;

/**
 * Created by Ivan_Stepantsov on 8/3/2017.
 */
abstract class MammalAnimal extends OrganismOrigin {
    public void nutrition(String nutrition) {
        System.out.println("nutrition of Organism cand be made by milk and " + nutrition);
    }
}