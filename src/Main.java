/**
 * Created by ethan on 2017-02-07.
 */
public class Main {
    public static void main(String[] args){
        Person p2 = new Instructor("Alice", "aline@uwo.ca", "Assistant Professor", new Course("Computer Science 2212","Learn about Software Engineering projects."));
        Person p1 = new Student("Bob", "bob@uwo.ca", "Restaurant Management", true);


        System.out.println(p1);
        System.out.println(p2);
    }
}
