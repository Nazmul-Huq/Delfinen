package Admin;

import java.util.ArrayList;
import java.util.Scanner;


public class Trainer{//Mo//

    //Arraylist to store the names of the swimmers
    static ArrayList<String> swimmers = new ArrayList<String>();

    //Scanner
    static Scanner scanner = new Scanner(System.in);



    //Methods
    public static void addSwimmer() {
        //Adds a new Swimmer to train
        //inserted into the swimmer ArrayList
        System.out.println();

        System.out.println("Write info of the swimmer below:");

        System.out.println("Swimmer Id Number");
        swimmers.add("SwimmerIdNumber:" + scanner.nextInt());



        System.out.println("Name:");
        scanner.nextLine();
        swimmers.add("Name:" + scanner.nextLine());


        System.out.println("Age:");
        swimmers.add("Age:" + scanner.nextInt());


        System.out.println("Address:");
        scanner.nextLine();
        swimmers.add("Address" + scanner.nextLine());


        System.out.println("Email:");
        swimmers.add("Email" + scanner.nextLine());


        System.out.println("PhoneNumber:");
        swimmers.add("PhoneNumber:" + scanner.nextInt());


        System.out.println("MemberShipType:");
        scanner.nextLine();
        swimmers.add("MemberShipType:" + scanner.nextLine());


        System.out.println("the Swimmer is added\n");
    }



    public void showSwimmerInfo() {
        //Shows information list of swimmers

        for (String e:swimmers) {
            System.out.println(e);
            System.out.println();
        }
    }




    public void addSwimmerToATeam() {
        //adds the Selected Swimmer to a team


        //keeps going until you've pressed 9
        System.out.println();
        System.out.println("choose Who you want to add to a team\nwhen done press 9");
        int userChoice = scanner.nextInt();

        do {
            userChoice = scanner.nextInt();

        } while (userChoice != 9);

        //to be continued

    }


    public void addSwimmerDiscipline() {

        //chooses which Discipline to train

        System.out.println("what discipline would you like to add a swimmer to?");
        System.out.println(" press 1: FreeStyle\n press 2: Butterfly\n press 3: Backstroke\n press 4: BreastStroke\n");
        int choiceOfDiscipline = scanner.nextInt();

        if (choiceOfDiscipline == 1) {
            System.out.println("FreeStyle is chosen");
            System.out.println();

        } else if (choiceOfDiscipline == 2) {
            System.out.println("Butterfly is chosen");
            System.out.println();

        } else if (choiceOfDiscipline == 3) {
            System.out.println("backstroke is chosen");
            System.out.println();

        } else if (choiceOfDiscipline == 4) {
            System.out.println("Breaststroke is chosen");
            System.out.println();

        } else if (choiceOfDiscipline > 4) {
            System.out.println("you haven't set other disciplines");
        }

    }



    public void editTop5SwimmersList() {
        //can add, remove or edit the list of Top 5 best swimmers in the disciplines

    }



    public static void addSwimmersToEvent() {
        //can add the swimmers to an event
    }



    public void addTrainingResult() {
        //adds the discipline training result
    }



}
