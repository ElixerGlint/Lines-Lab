//(you don't need package in VSCODE)
//package test123;
import java.util.Scanner;
public class App {
   
    public static void main(String[] args) {
        Scanner input; //creating scanner
        input = new Scanner(System.in);
       
        int carrier; //initializing variables
        int lines;
        int currentcost;
        int newlinecost = 0;
        double difference;
        int isteacher;
        double finalcost = 0.0;
       
        System.out.println("What is the monthly cost of your current plan?"); //grabbing current cost
        currentcost = input.nextInt();
       
        System.out.println("How many lines do you have (numbers only)? "); //grabbing amount of lines
        lines = input.nextInt();
       
       
        if (lines==4) { //letting the customer know about the secret deal for 4 lines
            System.out.println("Congrats! There is a secret deal for families of 4.");
            System.out.println("108$ per month, post tax!");
            System.out.print("What plan are you interested in? 1 is Essencial, 2 is Magenta, 3 is Magenta Max, 4 is the special plan."); //inputs from the user
            carrier = input.nextInt();
        }
        else {
        System.out.println("What plan are you interested in? 1 is Essencial, 2 is Magenta, 3 is Magenta Max");//inputs from the user
        carrier = input.nextInt();
        }
       
        System.out.println("If you are a teacher, input 1. Otherwise input 0."); //asking if they are a teacher
        isteacher = input.nextInt();
       
       
   
       
        if (carrier == 1) { //essencial plan math


            if (lines <= 5) {
                newlinecost = lines*(65-(5*lines));
            }
            if (lines > 5) {
                newlinecost = lines*(40);
            } //Calculating what the user currently pays, depending on what carrier they use
            finalcost = (double)newlinecost* 1.08; //adding the 8% buff essencial customers pay
        }
        if (carrier == 2) { //magenta plan math
            if (lines <= 5) {
                newlinecost = lines*(74-(4*(lines)));
            }
            if (lines > 5) {
                newlinecost = lines*(54);
            }


            finalcost = (double)newlinecost;
        }
        if (carrier == 3) { //magenta + plan math
            if (lines <= 5) {
                newlinecost = lines*(92-(7*(lines)));
            }
            if (lines > 5) {
                newlinecost = lines*(57);
            }


            finalcost = (double)newlinecost;
        }
        if (carrier == 4) { //family of 4 plan
            newlinecost = 108;
            finalcost = (double)newlinecost;
        }
       
       
        if(isteacher==1) { //10% off for teachers
            finalcost *= .9;
        }
       
       
        System.out.println("The cost of the plan is " + finalcost + "$"); //stating the cost of the plan
       
       
        difference = (double)currentcost - finalcost; //finding the difference between the two plans
       
        if (difference > 0) { //choosing wether to say they lose money or gain money per month by switching
            System.out.println("You will save " + difference + "$ per month by switching to M-mobile");
        }
        else if (difference < 0) {
            System.out.println("You will lose " + Math.abs(difference) + "$ per month by switching to M-mobile");
        }
        else if (difference == 0) {
            System.out.println("There is no difference between the two lines.");
        }
        input.close(); //closing the input collector
    }
   
}
