import java.util.Scanner;

public class Studentlist {
    public static void main(String[] args) {
       
        String[] students = {"John", "Alice", "Bob", "Eve"};
        int[] scores = {85, 92, 76, 88};

       
        System.out.println("Student List:");
        displayScores(students, scores);

        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the student to update the score: ");
        String studentName = scanner.nextLine();

        
        int studentIndex = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equalsIgnoreCase(studentName)) {
                studentIndex = i;
                break;
            }
        }

        
        if (studentIndex != -1) {
            System.out.print("Enter the new score for " + students[studentIndex] + ": ");
            scores[studentIndex] = scanner.nextInt();

          
            System.out.println("Updated Student List:");
            displayScores(students, scores);
        } else {
            System.out.println("Student not found.");
        }

        scanner.close();
    }

  
    private static void displayScores(String[] students, int[] scores) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + " - " + scores[i]);
        }
    }
}
