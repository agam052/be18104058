import java.util.*;
import java.io.*;

public class q3 {
    static void checkEligibilty(int student_age, int student_weight) {
        if (student_age >= 12 || student_weight >= 40) {
            throw new ArithmeticException("Student is not eligible for registration");
        } else {
            System.out.println("Student Registered Successfully");
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the student age : ");
        int student_age = scan.nextInt();

        System.out.println("Enter the student weight : ");
        int student_weight = scan.nextInt();

        checkEligibilty(student_age, student_weight);
    }
}