package Controller;

import Admin.BookKeeper;
import Admin.Chairman;
import Admin.Trainer;

public class SystemController {

    /**
     * instantiates necessary objects
     */
    Chairman chairman = new Chairman();
    Trainer trainer = new Trainer();
    BookKeeper bookKeeper = new BookKeeper();

    /**
     * start a given task
     */
    public void startTask(int actor, int taskToDo){

        if ( actor == 1 ) {

            // start task for Chairman
            startChairmanActivity(taskToDo);

        } else if ( actor == 2 ) {

            //start task for Trainer
            startTrainerActivity(taskToDo);

        } else if ( actor == 3 ) {

            //start task for Bookkeeper
            startBookkeeperActivity(taskToDo);

        } else {

            // if we reach here, something went wrong
            System.out.println("please enter valid task");

        }

    }

    /**
     * start task of chairman
     */
    private void startChairmanActivity(int taskToDo){

        switch (taskToDo){

            case 1:
                System.out.println("Chairman adding member");
                //chairman.addMember();
                break;

            case 2:
                System.out.println("Chairman adding employee");
                //chairman.addNewEmployee();
                break;

            case 3:
                System.out.println("Chairman adding event");
                //chairman.addEvent();
                break;

            case 4:
                System.out.println("Chairman adding team");
                //chairman.addTeam();
                break;

            case 5:
                System.out.println("Chairman changing member");
                break;
            case 6:
                System.out.println("Chairman changing membership");
                break;
            case 7:
                System.out.println("Chairman deleting member");
                break;

            case 8:
                System.out.println("this option is under construction");
                break;

            case 9:
                // if we reach here then something went wrong
                // this is because if user enter 9, then app should be closed
                System.out.println("Please chose a valid task");

            default:break;

        }

    }

    /**
     * start task of trainer
     */
    private void startTrainerActivity(int taskToDo){

        switch (taskToDo){

            case 1:
                System.out.println("Trainer adding swimmer");
                //trainer.addSwimmer();
                break;

            case 2:
                System.out.println("Trainer adding swimmer info");
                //trainer.addSwimmerInfo();
                break;

            case 3:
                System.out.println("Trainer adding swimmer to team");
                //trainer.addSwimmerToATeam();
                break;

            case 4:
                System.out.println("Trainer adding swimming discipline");
                //trainer.addSwimmingDiscipline();
                break;

            case 5:
                System.out.println("Trainer adding training result");
                //trainer.addTrainingResult();
                break;

            case 6:
                System.out.println("this option is under construction");
                break;

            case 7:
                System.out.println("this option is under construction");
                break;

            case 8:
                System.out.println("this option is under construction");
                break;

            case 9:
                // if we reach here then something went wrong
                // this is because if user enter 9, then app should be closed
                System.out.println("Please chose a valid task");
                break;

            default:break;

        }

    }

    /**
     * start task of bookkeeper
     */
    private void startBookkeeperActivity(int taskToDo){

        switch (taskToDo){

            case 1:
                System.out.println("Bookkeeper calculating fees");
                //bookKeeper.calculateFees();
                break;

            case 2:
                System.out.println("Bookkeeper calculating income");
                //bookKeeper.calculateIncome();
                break;

            case 3:
                System.out.println("Bookkeeper calculating debt");
                //bookKeeper.calculateDebt();
                break;

            case 4:
                System.out.println("Bookkeeper calculating future income");
                //bookKeeper.calculateFutureIncome();
                break;

            case 5:
                System.out.println("this option is under construction");
                break;

            case 6:
                System.out.println("this option is under construction");
                break;

            case 7:
                System.out.println("this option is under construction");
                break;

            case 8:
                System.out.println("this option is under construction");
                break;

            case 9:
                // if we reach here then something went wrong
                // this is because if user enter 9, then app should be closed
                System.out.println("Please chose a valid task");

                break;
            default:break;

        }

    }

} // class ends here
