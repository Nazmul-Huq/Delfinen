package Admin;

import Controller.AddInformation;
import FileHandler.DelfinFileWriter;

import java.awt.*;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Trainer extends Admin{//Mo wrote this//
    AddInformation information = new AddInformation();
    private String username;
    private int password;


    //FileWriter
    static DelfinFileWriter fileWriter = new DelfinFileWriter();

    //Arraylist to store the names of the swimmers
    static ArrayList<String> swimmers = new ArrayList<String>() ;

    //Scanner
    static Scanner scanner = new Scanner(System.in);

    //Event
    static Event event = new Event("22/02/2021",1400,"DGI byen",1);



    /**
     * constructor
     *
     * @param id
     * @param fullName
     * @param phoneNumber
     * @param email
     * @param address
     */
    public Trainer(int id, String fullName, int phoneNumber, String email, String address) {
        super(id, fullName, phoneNumber, email, address);
    }


    //Methods
    public static void addSwimmer() {
        //Adds a new Swimmer to train
        //inserted into the swimmer ArrayList


        System.out.println("input SwimmerInfo Below: Swimmer id number, Age, Name");
        int swimmerId = scanner.nextInt();
        int age = scanner.nextInt();
        String name = scanner.nextLine() + scanner.nextLine();



        System.out.println("Swimmer id number:\t" + swimmerId +
                "\nAge:\t\t\t\t" + age +
                "\nName:\t\t\t\t" + name);

        String info = "Swimmer id number:\t" + swimmerId +
                "\nAge:\t\t\t\t" + age +
                "\nName:\t\t\t\t" + name;

        swimmers.add(info);

        System.out.println();
        System.out.println("the Swimmer is added\n");
    }



    public void showSwimmerInfo() {
        //Shows information list of swimmers

        for (String e:swimmers) {
            System.out.println(e);
            System.out.println("---------------------------");
        }
    }




    public void addSwimmerToATeam() {
        //adds the Selected Swimmer to a team
        int[] userChoices = new int[5];

        //keeps going 5 times
        System.out.println();
        System.out.println("choose Who you want to add to a team\n");


        int count = 0;

        while (count != 5) {
            int choice = scanner.nextInt();
            userChoices[count] = choice;
            count++;
        }


        System.out.println("team added");


        fileWriter.swimmerTeam(userChoices);
    }


    public void addSwimmerDiscipline() {

        //chooses which Discipline to train

        int[] userInput = new int[5];

        System.out.println("what discipline would you like to add a swimmer to?");

        System.out.println(" press 1: FreeStyle\n press 2: Butterfly\n press 3: Backstroke\n press 4: BreastStroke\n");
        int choiceOfDiscipline = scanner.nextInt();


        if (choiceOfDiscipline == 1) {
            System.out.println("FreeStyle is chosen");
            System.out.println("swimmers to be added:");

            int count = 0;

            while (count != 5) {
                int choice = scanner.nextInt();
                userInput[count] = choice;
                count++;
            }
            System.out.println("swimmers added");

        } else if (choiceOfDiscipline == 2) {
            System.out.println("Butterfly is chosen");
            System.out.println("swimmers to be added:");

            int count = 0;

            while (count != 5) {
                int choice = scanner.nextInt();
                userInput[count] = choice;
                count++;
            }
            System.out.println("swimmers added");


        } else if (choiceOfDiscipline == 3) {
            System.out.println("backstroke is chosen");
            System.out.println("swimmers to be added:");

            int count = 0;

            while (count != 5) {
                int choice = scanner.nextInt();
                userInput[count] = choice;
                count++;
            }
            System.out.println("swimmers added");


        } else if (choiceOfDiscipline == 4) {
            System.out.println("Breaststroke is chosen");
            System.out.println("swimmers to be added:");

            int count = 0;

            while (count != 5) {
                int choice = scanner.nextInt();
                userInput[count] = choice;
                count++;
            }
            System.out.println("swimmers added");


        } else if (choiceOfDiscipline > 4) {
            System.out.println("you haven't set other disciplines");
        }

        fileWriter.disciplines(userInput);


    }


    public void editTop5SwimmersList() {
        //can add or remove swimmer from the list of Top 5 best swimmers in the disciplines

        System.out.println("press 1: to remove swimmer from the list\npress 2: to add a swimmer \npress 3: to go back ");
        int choice = scanner.nextInt();


        if (choice == 1) {
            if (swimmers.size() > 0) {
                System.out.println("who do you want to remove");
                swimmers.remove(scanner.nextInt() -1);

                System.out.println("swimmer removed");
            } else if (swimmers.size() <= 0) {

                System.out.println("theres no one to remove\n\n");
            }

        } else if (choice == 2) {

            addSwimmer();

        } else if (choice == 3) {
            System.out.println("returning to menu...");

        }

    }



    public static void addSwimmersToEvent() {
        //adds chosen swimmers to an event
        int[] choices = new int[5];

        System.out.println("press 1 to add swimmers to event\npress 2 to go back");

        int userChoice = scanner.nextInt();

        if (userChoice == 1) {


            System.out.println(event);

            System.out.println("who is going to this event?");

            int count = 0;

            while (count != 5) {
                int choice = scanner.nextInt();
                choices[count] = choice;
                count++;
            }

            System.out.println("swimmers added to event");

            System.out.println("find the Event and List of participants in files");

        } else if (userChoice == 2){
            System.out.println("returning to menu...");
            System.out.println();

        }

        fileWriter.eventList(choices);


    }



    public void addTrainingResult() {
        //adds the discipline training result
        information.addTrainingResult();

    }



    @Override
    public String toString() {
        return "username='" + username + '\'' +
                ", password=" + password +
                '}';
    }




}
