import java.util.Scanner;

public class StudentGradeCalc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of subjects :");
        int n=sc.nextInt();
        double marks[] = new double[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter subject #"+(i+1)+" marks : ");
            marks[i]=sc.nextDouble();
        }
        double totalMarks=0;
        for(int i=0;i<n;i++){
            totalMarks+=marks[i];
        }
        double avgPerc=totalMarks/n;
        char grade;
        if(avgPerc>=90){
            grade='O';
        }
        else if(avgPerc>=80 && avgPerc<90){
            grade='A';
        }
        else if(avgPerc>=70 && avgPerc<80){
            grade='B';
        }
        else if(avgPerc>=60 && avgPerc<70){
            grade='C';
        }
        else if(avgPerc>=50 && avgPerc<60){
            grade='D';
        }
        else if(avgPerc>=40 && avgPerc<50){
            grade='E';
        }
        else{
            grade='F';
        }
        System.out.println("Total Marks : "+totalMarks);
        System.out.println("Average Percentage : "+avgPerc);
        System.out.println("Grade : "+grade);
        sc.close();
    }
}
