package training.oop;

import java.util.Scanner;

/**
 * Created by Ivan_Stepantsov on 8/2/2017.
 */
public class AnimalTree {
    public static void main(String[] args) {
        System.out.println("Lets check animals among next:\n1. Dog\n2. Pigeon\n3. Swordfish\n4. Human");
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();

        OrganismOrigin organusmCheck = null;
        switch (n) {
            case 1:
                organusmCheck = new Dog();
                break;
            case 2:
                organusmCheck = new Pigeon();
                break;
            case 3:
                organusmCheck = new Swordfish();
                break;
            case 4:
                Human myHuman = new Human();
                organusmCheck = new Human();
                Person.personDetails();
                Person.personDetails("testName and", "testLastName");
                Person.personDetails("testNameOnly");

                myHuman.setHumanAge(99);//encapsulation included in setHumanAge method; set and get used
                System.out.format("Currently human age is set to %d\n\n",myHuman.getHumanAge());
                break;

            default:
                System.out.println("Please select valid animal 1-4");
                break;
        }
        if (organusmCheck != null) {
            organusmCheck.birth();
            organusmCheck.movement();
            organusmCheck.nutrition("apple");
            System.out.println("Is organism alive = " + organusmCheck.alive(1, 5));//used abstract method here
            organusmCheck.reproduction();
            organusmCheck.deathAge(5);
            organusmCheck.selfConscious();//abstraction
        }
    }
}