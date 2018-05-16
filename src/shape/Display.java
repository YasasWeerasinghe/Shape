/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Yasas Weerasingh
 */


public class Display {
	public static void main (String[] args){
          
            System.out.println("Area of the circle");
            Circle cirObj = new Circle();
            System.out.println(cirObj.Area());
            System.out.println("Perimeter of the circle");
            System.out.println(cirObj.Peremeter());
            System.out.println("Diameter of the circle");
            System.out.println(cirObj.Diemeter());
            
            System.out.println("Area of the triangle");
            Triangle triObj = new Triangle();
            System.out.println(triObj.Area());
            System.out.println("Perimeter of the triangle");
            System.out.println(triObj.Peremeter());
            
            System.out.println("Area of the Square");
            square squObj = new square();
            System.out.println(squObj.Area());
            System.out.println("Perimeter of the Square");
            System.out.println(squObj.Peremeter());
            System.out.println("Diameter of the square");
            System.out.println(squObj.Diemeter());
            
            
            System.out.println("Area of the Cube");
            Cube cubObj = new Cube();
            System.out.println(cubObj.Area());
            System.out.println("Perimeter of the Cube");
            System.out.println(cubObj.Peremeter());
            
        }
		
}
