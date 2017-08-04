package training.codeReuse;

/**
 * Created by Ivan_Stepantsov on 8/3/2017.
 */
interface OrganismConcept {
    void birth();

    void nutrition(String nutrition);

    void movement();

    void reproduction();

    int deathAge(int deathAge);

    boolean alive(int age, int lifeLimitAge);
}