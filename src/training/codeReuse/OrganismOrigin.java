package training.codeReuse;

/**
 * Created by Ivan_Stepantsov on 8/3/2017.
 */
abstract class OrganismOrigin implements OrganismConcept {

    @Override
    public void birth() {
        System.out.println("Birth of organism.");
    }

    @Override
    public void nutrition(String nutrition) {
        System.out.println("nutrition of organism made mostly by " + nutrition);
    }

    @Override
    public void movement() {
        System.out.println("movement of organism made mostly by");
    }

    @Override
    public void reproduction() {
        System.out.println("reproduction of organism");
    }

    @Override
    public int deathAge(int deathAge) {
        System.out.println("deathAge of organism=" + deathAge);
        return deathAge;
    }

    @Override
    public void alive(int age, int lifeLimitAge) {
   /*   will try to add some implementation
   boolean deathAgeFlag = false;
        if (age > lifeLimitAge) {
            return deathAgeFlag;
        } else return deathAgeFlag;
  */
    }

    public abstract void selfConscious();

}