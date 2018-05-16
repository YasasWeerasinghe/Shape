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
public class Cube extends Shape{

    @Override
    public int Area() {
         int area = (getLength()* getLength())*6;
         return area;
    }

    @Override
    public int Diemeter() {
        return 0;
    }

    @Override
    public int Peremeter() {
        int diameter = getLength()*4*6;
        return diameter;
    }
    
}
