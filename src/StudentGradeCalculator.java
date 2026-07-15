public class StudentGradeCalculator {
    public static void main(String[] args) {
        Double grade1 = 85.7;
        Double grade2 = 90.6;
        Double grade3 = 80.9;
        Double average;
        String status;

        average = (grade1 + grade2 + grade3) / 3;
        if (average >= 90) {
            status = "Excellent";
        } else if (average >= 75) {
            status = "Good";
        } else if (average >= 60) {
            status = "Pass";
        } else {
            status = "Fail";
        }
        IO.println("Grade 1:" + grade1);
        IO.println("Grade 2:" + grade2);
        IO.println("Grade 3:" + grade3);
        IO.println("Average:" + average);
        IO.println("Status:" + status);

    }
}
