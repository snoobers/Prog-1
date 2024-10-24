public class Arrangement implements Comparable<Arrangement>{
    
    private int number;
    private String name;
    private String place;
    private String arranger;
    private String type;
    private long time;

    public Arrangement(int number, String name, String place, String arranger, String type, long time){
        this.number = number;
        this.name = name;
        this.place = place;
        this.arranger = arranger;
        this.type = type;
        this.time = time;
    }

    // Implement compare method to compare dates for sorted list
    @Override
    public int compareTo(Arrangement other){
        return Long.compare(this.time, other.getTime());
    }

    public String getName(){
        return name;
    }

    public int getNumber(){
        return number;
    }

    public String getPlace(){
        return place;
    }

    public String getArranger(){
        return arranger;
    }

    public String getType(){
        return type;
    }

    public long getTime(){
        return time;
    }

    public String toString(){
        return "Arrangement number: " + number + ". " + name + " is being held at " + place + 
        ". The arranger is " + arranger + " and the arrangement is a " + type + ". The date and time is " + time;
    }
}
