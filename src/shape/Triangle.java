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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yasas Weerasingh
 */

public class Triangle extends Shape {
	
	
	
	
	@Override
	public int Area() {
		int answer = (int)(getLength() * getWidth())/2 ;
		return answer;
	}

	@Override
	public int Diemeter() {
            //traingles do not have a diameter. 
		return 0;
	}

	@Override
	public int Peremeter() {
		int answer = (getLength()*2)+getWidth();
		return answer;
	}

}

