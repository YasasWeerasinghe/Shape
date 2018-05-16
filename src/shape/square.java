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

public class square extends Shape {
	
	@Override
	public int Area() {
		int answer = getLength() * getLength() ;
		return answer;
	}

	@Override
	public int Diemeter() {
		int answer = (int)Math.sqrt(getLength()*getLength())+(getLength() *getLength()) ;
		return answer;
	}

	@Override
	public int Peremeter() {
		int answer = getLength() * 4;
		return answer;
	}

}


