//Question No:4

import java.util.Scanner;
public class StudentScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfStudents = 5;
        int numOfSubjects = 4;

        double[][] scores = new double[numOfStudents][numOfSubjects]; //2D array declare

        // Allow the user to input scores for each student and each subject
        for (int i=0;i<numOfStudents;i++){
            System.out.println("Enter score for Student "+(i+1)+":");

            for (int j=0;j<numOfSubjects;j++){
                System.out.print("Subject "+(j+1)+": ");

                scores[i][j] = scanner.nextDouble();
            }
        }

        // Calculate and display the average score for each student
        System.out.println("\nAverage Scores for each Student: ");

        for(int i=0;i<numOfStudents;i++){
            double sum=0;
            for (int j=0;j<numOfSubjects;j++){
                sum = sum+scores[i][j];
            }
            double average_s_std = sum/numOfSubjects;

            System.out.println("Student "+(i+1)+": "+average_s_std);
        }

        // Calculate and display the average score for each subject
        System.out.println("\nAverage Scores for each subjects: ");

        for(int j=0;j<numOfSubjects;j++){
            double total=0;
            for (int i=0;i<numOfStudents;i++){
                total = total+scores[i][j];
            }
            double average_s_sub = total/numOfStudents;
            System.out.println("Subject "+(j+1)+": "+average_s_sub);
        }

        // Find and display the student with the highest average score

        double highestAverage =-1;
        int heighestAverageStudent = -1;

        for(int i=0;i<numOfStudents;i++){
            double ha_sum=0;
            for(int j=0;j<numOfSubjects;j++){
                ha_sum = ha_sum + scores[i][j];
            }
            double h_average = ha_sum / numOfSubjects;

            if(h_average >highestAverage){
                highestAverage = h_average;
                heighestAverageStudent = i;
            }
        }
        System.out.println("\nStudent with the Highest average score: ");
        System.out.println("Student "+(heighestAverageStudent+1)+" - Average Score: "+highestAverage);

        System.out.println("Subject Scores: ");
        for (int j=0;j<numOfSubjects;j++){
            System.out.println("Subject "+(j+1)+": "+scores[heighestAverageStudent][j]);
        }

        scanner.close();
    }
}
