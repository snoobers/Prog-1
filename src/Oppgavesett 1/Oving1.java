/**
 * Oving1
 */
import java.util.Formatter;
public class Oving1 {

    public static void main(String[] args) {
        double inch = 80.0; //Define inch for conversion to cm
        double cm = 44.0; //Define cm for conversion to inch
        double inchTo_cm = inch * 2.54; //Convert inch to cm
        double cmTo_inch = (cm / 2.54 ); //Convert cm to inch
        Formatter fmt = new Formatter();
        fmt.format("%.2f",  cmTo_inch); //Print inch to cm with 2 decimal places

        System.out.println(inch + " inch(es) converted to cm, will be: "  + inchTo_cm + "cm");
        System.out.println(cm + " cm  converted to inch(es), will be: " + fmt + "inch(es)");
    }   
}