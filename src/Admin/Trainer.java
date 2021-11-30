package Admin;

import java.util.ArrayList;
import java.util.Scanner;

public class Trainer{//Mo//
    private String username;
    private String Password;

    //Arraylist
    static ArrayList<String> swimmers = new ArrayList<String>();
    //Scanner
    static Scanner scanner = new Scanner(System.in);

    //constructor
    public Trainer(String username, String password) {
        this.username = username;
        Password = password;
    }



    //Methods
    public static void addSwimmer() {
        //inserted into the swimmer ArrayList
        System.out.println();
        swimmers.add(scanner.nextLine());

        System.out.println(" the Swimmer is added\n Remember to add SwimmerInfo!\n");
    }

    public static void addSwimmerInfo() {

    }

    public void addSwimmerToATeam() {
        int choiceOfSwimmer = scanner.nextInt();
        System.out.println("choose Who you want to add to a team\n when done press ");

        //to be continued

    }


    public void addSwimmerDiscipline() {

        System.out.println("what discipline would you like to add a swimmer to?");
        System.out.println(" press 1: FreeStyle\n press 2: Butterfly\n press 3: Backstroke\n press 4: BreastStroke\n");
        int choiceOfDiscipline = scanner.nextInt();

        if (choiceOfDiscipline == 1) {
            System.out.println("FreeStyle is chosen");

        } else if (choiceOfDiscipline == 2) {
            System.out.println("Butterfly is chosen");

        } else if (choiceOfDiscipline == 3) {
            System.out.println("backstroke is chosen");

        } else if (choiceOfDiscipline == 4) {
            System.out.println("Breaststroke is chosen");

        } else if (choiceOfDiscipline > 4) {
            System.out.println("you haven't set other disciplines");
        }

    }

    public void editTop5SwimmersList() {

    }

    public void addSwimmersToEvent() {

    }

    public void addTrainingResult() {

    }

    //Getters


}
