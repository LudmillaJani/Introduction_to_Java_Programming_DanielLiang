import java.util.Scanner;
public class HighestScore {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double largerScore=0;
        String studentWithLargerScore="";

        System.out.print("Enter the number of students: ");
        double nrStudents = input.nextInt();

        System.out.println("Enter each of the student's name and score");
        int count=1;
        while(count <= nrStudents){
            System.out.print("\nStudent: " + count);
            String name = input.next();
            double score = input.nextDouble();
            if(largerScore<score){
                largerScore = score;
                studentWithLargerScore = name;
            }
            count++;
        }

        System.out.println("The student with larger score is: " + studentWithLargerScore +
                 " with score: " + largerScore);
    }
}
