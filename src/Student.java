import java.util.*;

public class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Студенти " + course + " курсу:");
        Iterator<Student> iter = students.iterator();
        while (iter.hasNext()) {
            Student student = iter.next();
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Іван", 1));
        students.add(new Student("Петро", 2));
        students.add(new Student("Марія", 1));
        students.add(new Student("Олексій", 3));
        students.add(new Student("Катерина", 2));
        students.add(new Student("Юрій", 1));
        students.add(new Student("Оксана", 3));
        students.add(new Student("Андрій", 2));
        students.add(new Student("Надія", 1));
        students.add(new Student("Василь", 3));

        printStudents(students, 1);
    }
}