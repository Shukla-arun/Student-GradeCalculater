import java.util.*;

public class Main{
     public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("The marks of optained");  

        int Hindi = sc.nextInt();
        int English = sc.nextInt();
        int physics = sc.nextInt();
        int Chemistry = sc.nextInt();
        int Biology = sc.nextInt();
        
        int total;
        int avg; 
        float percentage;
        char grade;

        total = Hindi + English + physics + Chemistry + Biology;
        avg = total/5;
        percentage = (float) total/500 * 100;

        if(avg >= 90)
           grade = 'A';
        else if(avg >= 80 && avg < 90)
           grade = 'B';    
        else if(avg >= 70 && avg < 80)
           grade = 'C';
        else if(avg >= 60 && avg < 70)
           grade = 'D';
        else
           grade ='E';

        System.out.println("The total marks = " + total + "/500 ");
        System.out.println("The avg marks =" + avg);
        System.out.println("The percentage = " + percentage + "%");
        System.out.println("The Grade = " + grade + "'");
    }}