package Pckg;
import java.util.List;
public class Student {
    public String name;
    private String group;
    public int grade;
    private List<Integer> marks;

    public Student(String name, String group, int grade, List<Integer> marks) {
        this.name = name;
        this.group = group;
        this.grade = grade;
        this.marks = marks;
    }
    public double averageGrade() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.size();
    }
}
