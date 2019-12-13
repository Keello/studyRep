package sortObjects;

import java.util.Arrays;

public class SortStudent {

    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student(5,"Smith","Bob");
        students[1] = new Student(9,"Jones","Will");
        students[2] = new Student(1,"Johnson","Matt");
        students[3] = new Student(4,"Bruce","Robertson");

        Arrays.sort(students);

        for(int i = 0; i < students.length; i++) {
            System.out.println(students[i].student_id + " "
                    + students[i].last_name + " "
                    + students[i].first_name);
        }
    }
}
