import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        // Question 1
        Moodle moodle = new Moodle();
        Student student = new Student();
        Staff staff = new Staff();
        Admin admin = new Admin();

        moodle.assignment();
        student.assignment();
        staff.assignment();
        admin.assignment();

        // Question 2
        int[] arrayA = {-7, 12, 17, 29, 41, 56, 79};
        int[] arrayB = {-9, -3, 0, 5, 19};
        int[] arrayC = new int[arrayA.length+arrayB.length];
        for (int i=0; i<arrayA.length; i++){
            arrayC[i] = arrayA[i];
        }
        int c=0;
        for (int i=arrayA.length; i<arrayA.length + arrayB.length; i++){
            arrayC[i] = arrayB[c];
            c++;
        }

        Arrays.stream(arrayC).sorted();
        }
}
