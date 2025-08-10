
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student Denis = new Student("denis", "13B", 1, new int[] { 2, 2, 3, 2, 5 });
        Student Boris = new Student("boris", "13A", 2, new int[] { 5, 5, 5, 4, 5 });
        Student Alex = new Student("alex", "11C", 3, new int[] { 3, 4, 3, 4, 5 });
        Student Roman = new Student("roman", "7A", 4, new int[] { 3, 3, 3, 3, 2 });
        Student Ivan = new Student("ivan", "8A", 5, new int[] { 2, 5, 5, 2, 5 });
        Student Max = new Student("max", "10B", 5, new int[] { 4, 3, 3, 4, 5 });
        ArrayList<Student> studentsList = new ArrayList<Student>(Arrays.asList(Denis, Boris, Alex, Roman, Ivan, Max));

        Student.printStudents(studentsList, 3);

        System.out.println("-------");

        Student.print(studentsList);
        Student.deleteStudents(studentsList);
        Student.print(studentsList);
    }
}
