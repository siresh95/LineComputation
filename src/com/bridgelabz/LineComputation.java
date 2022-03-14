package com.bridgelabz;
import java.util.Scanner;

public class LineComputation {
         double X1,X2,X3,X4,Y1,Y2,Y3,Y4;
       public static  Scanner sc= new Scanner(System.in);
        //uc1 distance Between two points
    public static void DistanceBetweenPoint(){
            //System.in is a standard input stream
            System.out.println("Enter value of X1 ");
        int X1 = sc.nextInt();
            System.out.println("Enter Value of Y1 ");
        int Y1 = sc.nextInt();
            System.out.println("Enter Value of X2");
        int X2 = sc.nextInt();
            System.out.println("Enter Value of Y2 ");
        int Y2 = sc.nextInt();
        double dis = Math.sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
            System.out.println("Distance between two points " +dis);

        }
       //uc2 Comparison of two lines based on end point
       public  void equalityOfLines() {
           System.out.println("The Coordinates of 1st line are:");
           System.out.print("X1 = ");
           X1 = sc.nextInt();
           System.out.print("Y1 = ");
           Y1 = sc.nextInt();
           System.out.print("X2 = ");
           X2 = sc.nextInt();
           System.out.print("Y2 = ");
           Y2 = sc.nextInt();

           System.out.println("The Coordinates of 2nd line are:");
           System.out.print("X3 = ");
           X3 = sc.nextInt();
           System.out.print("Y3 = ");
           Y3 = sc.nextInt();
           System.out.print("X4 = ");
           X4 = sc.nextInt();
           System.out.print("Y4 = ");
           Y4 = sc.nextInt();

           Double length1 = Math.sqrt(Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2));
           System.out.println("The length of the 1st line is = " + length1);

           Double length2 = Math.sqrt(Math.pow(X4 - X3, 2) + Math.pow(Y4 - Y3, 2));
           System.out.println("The length of the 2nd line is = " + length2);

           if (length1.equals(length2))
               System.out.println("The lines are equal");
           else
               System.out.println("The lines are not equal");
           System.out.println(" ");
       }

    public static void main(String[] args){
        System.out.println("Welcome to Line Computation");
        LineComputation object = new LineComputation();
        object.DistanceBetweenPoint();
        object.equalityOfLines();
    }
}
