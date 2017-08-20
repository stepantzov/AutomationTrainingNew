package training.oop;

/**
 * Created by Ivan_Stepantsov on 8/16/2017.
 */
class Person extends Human {
    static void personDetails() {
        String firstName = null;
        System.out.println("First constructor call");
        System.out.println("Person first name = " + firstName);
        System.out.println();
    }

    static void personDetails(String firstName, String lastName) {
        System.out.println("Second constructor call");
        System.out.println("Person first name = " + firstName);
        System.out.println("Person last  name = " + lastName);
        System.out.println();
    }

    static void personDetails(String firstName) {
        System.out.println("Third constructor call");
        System.out.println("Person first name = " + firstName);
        System.out.println("Person last  name = " + null);
        System.out.println();
    }
}