import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Person {

    final String firstname;
    final String surname;
    final LocalTime birthday;

    //Constructor to make the person
    public Person(String firstname, String surname, LocalTime birthday){
        this.firstname = firstname;
        this.surname = surname;
        this.birthday = birthday;
    }

    //Getter methods
    public String getFirstname(){
        return firstname;
    }

    public String getSurname(){
        return surname;
    }

    public LocalTime getBirthday(){
        return birthday;
    }

    public String getFormattedBirthday(){
        DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return birthday.format(formatObj);
    }
    
}
