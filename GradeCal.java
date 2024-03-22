import java.util.Scanner;

class GradeCal{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of subjects: ");
        int nsubs= sc.nextInt();

        if(nsubs <= 0)
        {
            System.out.println("Please enter valid number of a subject.");
            return;
        }
        int total=0;
        int maxpersub=100;

        for(int i=1; i<=nsubs; i++)
        {
            System.out.print("Enter marks obtained in Subject number "+i+" (out of 100): ");
            int marks = sc.nextInt();
            if(marks < 0 || marks > maxpersub)
            {
                System.out.println("Marks should be in the range of 0 to 100. Please enter valid number!");
                i--;
            }
            else {
                total += marks;
            }
        }
        double avgper = (double) total/(nsubs * maxpersub)*100;
        System.out.println("Total Marks: "+total);
        System.out.println("Percentage: "+avgper+"%");

        String grade;

        if(avgper >= 90)
        {
            grade = "A+";
        }
        else if(avgper >=80)
        {
            grade = "A";
        } else if (avgper >= 70)
        {
            grade = "B+";
        }
        else if (avgper >= 60)
        {
            grade = "B";
        }
        else if(avgper >= 50)
        {
            grade = "C";
        }
        else if (avgper >= 40)
        {
            grade = "D";
        }
        else {
            grade = "F";
        }
        System.out.println("Grade: "+grade);
    }
}
