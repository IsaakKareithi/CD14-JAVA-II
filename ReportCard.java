import java.util.Scanner;

public class ReportCard {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        System.out.print("Enter the student name: ");
        String name = sc.nextLine();

        System.out.print("Enter the number of subjects: ");
        int no = sc.nextInt();

        // create an integer array to store no, subject & marks
        int[] marks = new int[no];

        marksEntry(marks); //method call

        printReportCard(name, marks, no); // method call

        // method for marks entry
    static void marksEntry(int[] marks){
            for (int i = 0; i<marks.length;i++){
                System.out.print("Enter marks for subjects: "+(i+1)+": ");
                marks[i] = sc.nextInt();
            }
        }

        // method for generatinh report cards
    static void printReportCard(String name, int[marks], int no){
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
    }
}
