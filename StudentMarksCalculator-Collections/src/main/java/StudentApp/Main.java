package StudentApp;

import java.util.*;

/*
    Set for checking unique ID. whether ID exist or not.
    List for marks of particular student
    Map for mapping student with ID
*/

public class Main {
    public static  void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Map<Integer, Student> map = new HashMap<>();

        List<Mark> marks1 = new ArrayList<>();
        marks1.add(new Mark("English", 56));
        marks1.add(new Mark("Science", 80));
        marks1.add(new Mark("Maths", 98));
        Student student1 = new Student("Sahil", 1, marks1);

        List<Mark> marks2 = new ArrayList<>();
        marks2.add(new Mark("English", -1));
        marks2.add(new Mark("Science", 80));
        marks2.add(new Mark("Maths", 98));
        Student student2 = new Student("Sahil", 2, marks2);

        TotalMarks totalMarks = new TotalMarks(new StudentValidator(), new MarkValidator());
        System.out.println(totalMarks.getTotalMarks(student1));
        System.out.println(totalMarks.getTotalMarks(student2));
    }
}
