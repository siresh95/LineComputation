package com.bridgelabz;
import java.util.Scanner;

public class LineComputation {
         double X1,X2,X3,X4,Y1,Y2,Y3,Y4;
       public static  Scanner sc= new Scanner(System.in);
        //uc1
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

    public static void main(String[] args){
        System.out.println("Welcome to Line Computation");
        LineComputation object = new LineComputation();
        DistanceBetweenPoint();
    }
}
