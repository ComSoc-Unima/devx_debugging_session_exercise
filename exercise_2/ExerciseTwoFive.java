/*
 * SCENARIO: A function filters a student roster to return only students who are passing (grade >= 60) AND are enrolled full-time. The results are consistently wrong. 
 * TASK: There are three logical errors in this code. Find all three. 
 * EXPECTED OUTPUT:
 * Alice — Grade: 72 
 * David — Grade: 65 
 * Eve — Grade: 90
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    String name;
    int grade;
    boolean fullTime;

    Student(String name, int grade, boolean fullTime) {
        this.name = name;
        this.grade = grade;
        this.fullTime = fullTime;
    }
}

public class ExerciseTwoFive {
    public static List<Student> getPassingFullTime(List<Student> roster) {
        return roster.stream()
                .filter(s -> s.grade >= 60 || s.fullTime == true)
                .collect(Collectors.toList());
    }

    public static void printRoster(List<Student> list) {
        
        boolean isEmpty = false;
        if (isEmpty = (list.size() == 0)) {
            System.out.println("No students found.");
            return;
        }

        for (Student s : list) {
            System.out.println(s.name + " — Grade: " + s.grade);
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 72, true));
        students.add(new Student("Bob", 55, true));
        students.add(new Student("Carol", 80, false));
        students.add(new Student("David", 65, true));
        students.add(new Student("Eve", 90, true));

        List<Student> result = getPassingFullTime(students);
        printRoster(result);
    }
}
