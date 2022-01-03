/**
 * 
 */
package com.yash.main;

import com.yash.adapter.PenAdapter;
import com.yash.object.Pen;

/**
 * Adapter Design Pattern
 * 
 * @author Yashwanth
 *
 */
public class School {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pen pen = new PenAdapter();
		AssignmentWork assignWork= new AssignmentWork();
		assignWork.setPen(pen);
		assignWork.writeAssignment("I am ready to write assignment");
	}

}
