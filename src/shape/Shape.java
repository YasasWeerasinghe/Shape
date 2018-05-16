/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

public abstract class Shape {
	public int length = 4 ;
	public int width = 4;
	public int height = 4;

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
	
	
	
	
	public abstract int Area();
	public abstract int Diemeter();
	public abstract int Peremeter();
	
}
	
	
