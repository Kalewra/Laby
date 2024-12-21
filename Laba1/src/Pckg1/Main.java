package Pckg1;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", "Group A", 1, List.of(4, 3, 5));
        Student student2 = new Student("Bob", "Group B", 2, List.of(2, 3, 4));
        Student student3 = new Student("Charlie", "Group A", 1, List.of(5, 4, 5));

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        removeStudentsWithLowAverage(students);
        printStudents(students, 1);
    }

    public static void removeStudentsWithLowAverage(List<Student> students) {
        students.removeIf(student -> student.getAverageGrade() < 3);
        students.forEach(student -> {
            student.course++;
        });
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Students on course " + course + ":");
        for (Student student : students) {
            if (student.course == course) {
                System.out.println(student.name);
            }
        }
    }
}

