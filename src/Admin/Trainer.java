package Admin;

import Controller.AddInformation;

import java.util.ArrayList;
import java.util.Scanner;


public class Trainer extends Admin{//Mo//
    AddInformation information = new AddInformation();
    private String username;
    private int password;



    //Arraylist to store the names of the swimmers
    static ArrayList<String> swimmers = new ArrayList<String>();
    static ArrayList<Integer> swimmerInfo = new ArrayList<Integer>();
    //Scanner
    static Scanner scanner = new Scanner(System.in);


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


        System.out.println("input SwimmerInfo Below: Swimmer id number, Age, Name, MembershipType");
        int swimmerId = scanner.nextInt();
        int age = scanner.nextInt();
        String name = scanner.nextLine() + scanner.nextLine();
        String membershipType = scanner.nextLine();


        System.out.println("Swimmer id number:\t" + swimmerId +
                "\nAge:\t\t\t\t" + age +
                "\nName:\t\t\t\t" + name +
                "\nMembershipType:\t\t " + membershipType);

        String info = "Swimmer id number:\t" + swimmerId +
                "\nAge:\t\t\t\t" + age +
                "\nName:\t\t\t\t" + name +
                "\nMembershipType:\t\t " + membershipType ;

        swimmers.add(info);

        System.out.println();
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


        //keeps going 5 times
        System.out.println();
        System.out.println("choose Who you want to add to a team\n");
        int userChoice = scanner.nextInt();

        while (userChoice != 5){
            userChoice = scanner.nextInt();


        }
        System.out.println("what team do you want to add them to?");




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
        //can add or remove swimmer from the list of Top 5 best swimmers in the disciplines

        System.out.println("press 1: to remove swimmer from the list\npress 2: to add a swimmer \npress 3: to go back ");
        int choice = scanner.nextInt();

        System.out.println(swimmers.size() +1);

        if (choice == 1) {
            if (swimmers.size() > 0) {
                System.out.println("who do you want to remove");
                swimmers.remove(scanner.nextInt());

            } else if (swimmers.size() <= 0) {

                System.out.println("theres no one to remove\n\n");
            }

        } else if (choice == 2) {

            addSwimmer();

        } else if (choice == 3) {
            System.out.println("returning to main menu...");

        }

    }



    public static void addSwimmersToEvent() {
        //adds the swimmers to an event
    }



    public void addTrainingResult() {
        //adds the discipline training result
        information.addTrainingResult();

    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public static ArrayList<String> getSwimmers() {
        return swimmers;
    }

    public static void setSwimmers(ArrayList<String> swimmers) {
        Trainer.swimmers = swimmers;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "username='" + username + '\'' +
                ", password=" + password +
                '}';
    }
}
