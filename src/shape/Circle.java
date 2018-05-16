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

public class Circle extends Shape {
	int val = 0;
        int lengh;
	
        
	@Override
	public int Area() {
		int val = (int) (getLength() * getLength() * 3.14);
		return val;
	}

	@Override
	public int Diemeter() {
		int val = getLength() * getLength();
		return val;
	}

	@Override
	public int Peremeter() {
		int val = (int) (2 * 3.14 * getLength());
		return val;
	}

}
