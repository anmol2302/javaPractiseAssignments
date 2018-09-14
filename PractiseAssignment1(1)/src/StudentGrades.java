import java.util.Scanner;

public class StudentGrades {

    private int max;
    private int min;
    private double average;



    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public StudentGrades(){


        int[] grades=takeInput();
        findMax(grades);
        findMin(grades);
        findAverage(grades);
        System.out.println("the average is "+getAverage());
        System.out.println("the minimum is "+getMin());
        System.out.println("the maximum is "+getMax());
    }


    public int[] takeInput(){

        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the number of students");
        int noOfStudents=sc.nextInt();
        int[] gradeArr=new int[noOfStudents];
        for(int i=0;i<noOfStudents;i++){
            int num=validateInput();
            if(num<=100){
                gradeArr[i]=num;
            }
            else{
                validateInput();
            }

        }
return gradeArr;
    }
    public int validateInput() {
        int number;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter student number : ");
            try {
                number = input.nextInt();
                return number;
            } catch (java.util.InputMismatchException e) {
                System.out.println("enter valid student grade!!");
                input.nextLine();
            }
        }
    }


    public void findMax(int[] grades)
    {
        int max=0;

        for(int i=0;i<grades.length;i++){

            if(grades[i]>max){

                max=grades[i];
            }
        }
        setMax(max);
    }



    public void findMin(int[] grades){

        int min=grades[0];

        for(int i=1;i<grades.length;i++){

            if(grades[i]<min){

                min=grades[i];
            }

        }
        setMin(min);

    }

    public void findAverage(int[] grades){

        double sum=0.0;

        for(int i=0;i<grades.length;i++){

            sum+=grades[i];

        }
        setAverage(sum/grades.length);
    }


    public static void main(String[] args) {

        StudentGrades o=new StudentGrades();



    }



}
