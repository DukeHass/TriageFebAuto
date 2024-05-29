package Day2_04022024;

import javax.print.DocFlavor;

public class T1_LinearArray {
    public static void main(String[] args) {
        //declare a string array variable
        String[] studentNames;
        studentNames = new String[]{"Abdul", "Ahmad", "Anderson", "Wahid"};
        //store some values in the string array
        //array starts with 0
        System.out.println("The value of index 0 is " + studentNames[0]);
        //print out Anderson from the studentNames array
        System.out.println("The student name is " + studentNames[2]);
        //print out Wahid from the studentNames array
        System.out.println("The student name is " + studentNames[3]);
        //declare and store student grades
        int[] studentGrades = new int[]{90, 93, 94, 99};
        //print out grate from the array
        //we use index 1 because 93 is the 2nd number and array index starts from 0
        System.out.println("Student grade is " + studentGrades[1]);
    }
}
