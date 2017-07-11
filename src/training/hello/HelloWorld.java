/**
 * Created by Ivan_Stepantsov on 7/3/2017.
 */

package training.hello;
import java.util.Scanner;

/**
 * This class Greets a person
 * with his name
 * */

public class HelloWorld {
    public HelloWorld(String name) {
        System.out.println("Hi, " + name + "!");
        System.out.println();

    }

    public String getEmail (String name, String email){
        String personEmail = email;
        System.out.println();
        System.out.println("Ok, " + name + ", your email " +
                personEmail + " has been stored in our database successfully! ");
        return personEmail;
    }

    public static void main(String[] args) {
        Scanner personNameScanner = new Scanner(System.in);
        System.out.println("Hi there, what is your name?");
        String personName = personNameScanner.nextLine();
        HelloWorld myHelloWorld = new HelloWorld(personName);
        System.out.println("By the way, " + personName +
                ", we grab some big data, " +
                "could you please leave your email. We will send some spam on it:");
        String personEmail = personNameScanner.nextLine();
        myHelloWorld.getEmail(personName, personEmail);
    }

}