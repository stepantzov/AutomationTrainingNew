package training.codeReuse;

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
                organusmCheck = new Human();
                break;
            default:
                System.out.println("Please select valid animal 1-4");
                break;
        }
        if (organusmCheck != null) {
            organusmCheck.birth();
            organusmCheck.movement();
            organusmCheck.nutrition("apple");
            organusmCheck.alive(1, 5);
            organusmCheck.reproduction();
        }
    }
}