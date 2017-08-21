package training.oop;

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
        System.out.println("Reproduction of organism.");
    }

    @Override
    public int deathAge(int deathAge) {
        System.out.println("DeathAge of organism=" + deathAge);
        return deathAge;
    }

    @Override
    public boolean alive(int age, int lifeLimitAge) {
        boolean deathAgeFlag = false;
        if (age < lifeLimitAge) {
            deathAgeFlag = true;
            return deathAgeFlag;
        } else return deathAgeFlag;
    }

    public abstract void selfConscious();
}