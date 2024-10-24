import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ArrangementRegister {

    private Arrangement arrangement;
    private List<Arrangement> arrangementOverview;

    public ArrangementRegister(){
        this.arrangementOverview = new ArrayList<>();
    }

    public void registerArrangement(int number, String name, String place, String arranger, String type, long time){
        arrangement = new Arrangement(number, name, place, arranger, type, time);
        arrangementOverview.add(arrangement);
        System.out.println(arrangement + " was succesfully added to the overview!");
    }

    public void findArrangementAtPlace(String place){
        for (Arrangement arrangement : arrangementOverview){
            if (arrangement.getPlace().toLowerCase().equals(place.toLowerCase())){
                System.out.println(arrangement + " is being held at the " + place);
            }
        }
    }

    public void findArrangementAtDate(long date){
        for (Arrangement arrangement : arrangementOverview){
            if (arrangement.getTime() - date < 2400){
                System.out.println(arrangement + " is being held this day.");
            }
        }
    }

    public void findArrangementsBetweenDates(long startDate, long endDate){
        // Create a new list to store the arrangements within the interval
        List<Arrangement> arrangementsInInterval = new ArrayList<>();

        for (Arrangement arrangement : arrangementOverview) {
            if (arrangement.getTime() > startDate && arrangement.getTime() < endDate){
                arrangementsInInterval.add(arrangement);
            }
        }
        Collections.sort(arrangementsInInterval);
        System.out.println(arrangementsInInterval.toString());
    }

    public void listOfArrangements(){
        for (Arrangement arrangement : arrangementOverview){
            System.out.println(arrangement.toString());
        }
    }
}
