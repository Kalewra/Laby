package Pckg;
import java.util.ArrayList;
import java.util.List;
        public class Main {
            public static void main(String[] args) {
                Student student1 = new Student("Alex", "С23-712", 1, List.of(4, 3, 5));
                Student student2 = new Student("Vova", "Б23-701", 2, List.of(2, 3, 2));
                Student student3 = new Student("Gosha", "Б23-711", 1, List.of(5, 4, 5));
                Student student4 = new Student("Dima", "С23-701", 3, List.of(5, 5, 5));
                Student student5 = new Student("Sergey", "C23-711",2, List.of(3,3,2));

                List<Student> students = new ArrayList<>();
                students.add(student1);
                students.add(student2);
                students.add(student3);
                students.add(student4);
                students.add(student5);
                lowAverage(students);
                printStudents(students, 2);
            }

            public static void lowAverage(List<Student> students) {
                students.removeIf(student -> student.averageGrade() < 3);
                students.forEach(student -> student.grade++);
            }

            public static void printStudents(List<Student> students, int grade) {
                System.out.println("Студенты на " + grade + " курсе" + ":");
                for (Student student : students) {
                    if (student.grade == grade) {
                        System.out.println(student.name);
                    }
                }
            }

        }
