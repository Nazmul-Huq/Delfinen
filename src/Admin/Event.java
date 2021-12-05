package Admin;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Event {//Mo//

    //Attributes
    private String Date;
    private int time;
    private String location;
    private int id;


    //constructor for Events
    public Event(String date, int time, String location, int id) {
        Date = date;
        this.time = time;
        this.location = location;
        this.id = id;

    }

    //Methods
    public static void eventList(Event swimmerToEvent) {
        try {
            File file = new File("Files/Event_and_Participants.txt");
            FileWriter writer = new FileWriter(file, true);

            writer.close();

        } catch (IOException e) {
            System.out.println("file couldn't be found");
            e.printStackTrace();
        }
    }




    //Getters
    public String getDate() {
        return Date;
    }

    public int getTime() {
        return time;
    }

    public String getLocation() {
        return location;
    }

    public int getId() {
        return id;
    }

    //toString Method so the result doesn't fuck up.
    @Override
    public String toString() {
        return "Event: " + "Date: " + Date + "," + "time: " + time + "," +
                " location: " + location + "," +  " id: " + id ;
    }
}
