package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //todo declare variable a,b,c, discriminant ,axisOFSymmetry. parabolaFacing x,y
        double a, b, c, discriminant, axisOFSymmetry, x, y;
        String parabolaFacing;
        Scanner radar;
        //todo initialize manually
        radar = new Scanner(System.in) ;
        System.out.println("give ma an A");
        a = radar.nextDouble();
        //a = 5;
        System.out.println("give ma an B");
        b = radar.nextDouble();
        //b = 3;
        System.out.println("give ma an C");
        c = radar.nextDouble();
        //c = 1;
        //todo calculations
        axisOFSymmetry = -b / (2 * a);
        discriminant = (b * b) - 4 * (a * c);
        if (discriminant > 0) {
            System.out.println("There are two real solutions");
        }
                else if(discriminant == 0){
                System.out.println("There are one real solutions");
            }
            else{
                System.out.println("There are NO real solutions");
            }
;        //todo print results
        System.out.println("Axis of Symmetry: "+ axisOFSymmetry);
        System.out.println("Discriminant: "+ discriminant);
        //todo not in code check results

        //todo initialize scanner and redo the initialize area

        //todo double check results


    }
}
