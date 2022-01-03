/**
 * 
 */
package com.yash.main;

import com.yash.object.Pen;

/**
 * @author Yashwanth
 *
 */
public class AssignmentWork {
	
	private Pen pen;
	
	/**
	 * @return the pen
	 */
	public Pen getPen() {
		return pen;
	}


	/**
	 * @param pen the pen to set
	 */
	public void setPen(Pen pen) {
		this.pen = pen;
	}


	public void writeAssignment(String str)
	{
		pen.write(str);
	}

}
