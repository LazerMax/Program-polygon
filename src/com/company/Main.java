package com.company;
import static java.lang.Math.sqrt;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String strArr[] = scanner.nextLine().split(" ");


        int numArr[] = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
        }

        if(numArr.length == 0 || numArr.length == 2 || numArr.length > 4){
            Polygon polygon = new Polygon(numArr);
            System.out.println(polygon.toString());
        }

        if (numArr.length == 1){
            Circle circle = new Circle(numArr);
            System.out.println(circle.toString());
        }

        if (numArr.length == 3){
            Triangle triangle = new Triangle(numArr);
            System.out.println(triangle.toString());
        }

        if (numArr.length == 4){
            if(numArr[0]==numArr[1] && numArr[0]==numArr[2] && numArr[0] == numArr[3]){
                Rhombus rhombus = new Rhombus(numArr);
                System.out.println(rhombus.toString());
            } else {
                if (numArr[0] + numArr[1] == numArr[2] + numArr[3] ||
                        numArr[0] + numArr[2] == numArr[1] + numArr[3] ||
                        numArr[0] + numArr[3] == numArr[1] + numArr[2]) {
                    Parallelogram parallelogram = new Parallelogram(numArr);
                    System.out.println(parallelogram.toString());
                }
                else {
                    Quadrilateral quadrilateral = new Quadrilateral(numArr);
                    System.out.println(quadrilateral.toString());
                }
            }

        }

    }
}






