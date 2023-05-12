package oop;

import ui.GeometryUI;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OOPMain {
    public static void main(String[] args) {
        Geometry geometry = new Geometry();
        geometry.accessingPi();
        GeometryUI ui = new GeometryUI();
        ui.drawUI();

        Scanner input = new Scanner(System.in);
        try{
            float length = input.nextFloat();
            float breadth = input.nextFloat();

            System.out.println(geometry.areaOfTriangle(breadth, length));
        }catch (InputMismatchException ime){
            System.out.println("Enter a valid number");
        }catch (Exception e){
            System.out.println("Something went wrong");
        }
    }
}
