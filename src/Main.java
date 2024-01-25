import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Employee("Danial", "Smagulov", "Manager", 50000));
        people.add(new Employee("Islam", "Marat", "Footballer", 300000));
        people.add(new Student("Dorkhan", "Serikov", 1.0));
        people.add(new Student("Nurdaulet", "Saulebay", 3.0));
        System.out.println(people);
    }
}