package com.knoldus.geometricshapes;
// To print the area of geometric shapes using  enum.
import java.util.Scanner;
public class GeometricShapesUsingEnum
{
    enum GeometricShapes
    {
        RECTANGLE,
        SQUARE,
        CIRCLE;

           public static void areaOfRectangle(double length, double breadth){
              double area = length * breadth;
                System.out.println("Area of rectangle is: " +area+" sq.unit");
            }
           public static void areaOfSquare(double side) {
                double area = side * side ;
                System.out.println("Area of square is: "+area+" sq.unit");
            }
           public static void areaOfCircle(double radius) {
               final double pi = 3.14;
            double area = pi * radius * radius ;
            System.out.println("Area of square is: "+area+" sq.unit");
           }

    }
    public static void main(String[] args)
           {
               Scanner scan = new Scanner(System.in);

                System.out.println("Press 1 : To calculate Area of rectangle.");
                System.out.println("Press 2 : To calculate Area of Circle.");
                System.out.println("Press 3 : To calculate Area of Square.");

                int input = scan.nextInt();

                switch(input) {
                    case 1:
                        System.out.println("Enter Length of rectangle");
                        int lengthOfRectangle = scan.nextInt();
                        System.out.println("Enter Breadth of rectangle");
                        int breadthOfRectangle = scan.nextInt();
                        GeometricShapes.areaOfRectangle(lengthOfRectangle,breadthOfRectangle);
                        break;

                    case 2:
                        System.out.println("Enter radius of circle");
                        double radius = scan.nextDouble();
                        GeometricShapes.areaOfCircle(radius);
                        break;

                    case 3:
                        System.out.println("Enter side of square");
                        double side = scan.nextDouble();
                        GeometricShapes.areaOfSquare(side);
                        break;

                    default:
                        System.out.println("Please! Enter the correct choice.");
                        break;
                }

           }
}


