package GettingStarted;/*
1. You are given as input marks of a student.
2. Display an appropriate message based on the following rules:
  	  2.1 for marks above 90, print excellent.
  	  2.2 for marks above 80 and less than equal to 90, print good.
  	  2.3 for marks above 70 and less than equal to 80, print fair.
  	  2.4 for marks above 60 and less than equal to 70, print meets expectations.
  	  2.5 for marks less than equal to 60, print below par.

 */

public class ifelse {

    public static void main(String[] args) {

        int marks=85;

        if ( marks > 90 ) {
            System.out.print("Excellent");
        }
        else if( marks > 80 & marks <= 90 ){
            System.out.println("Good");
        }
        else if ( marks > 70 & marks <= 80){
            System.out.println("Fair");
        }
        else if (marks > 60 & marks <= 70){
            System.out.println("meet expectations");
        }
        else{
            System.out.println("Below percentage");
        }
    }
}

