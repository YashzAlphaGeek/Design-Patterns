/**
 * 
 */
package com.yash.adapter;

import com.yash.object.Pen;
import com.yash.object.PilotPen;

/**
 * @author Yashwanth
 *
 */
public class PenAdapter implements Pen{

	PilotPen pilotPen = new PilotPen();
	
	@Override
	public void write(String str) {
		pilotPen.mark(str);
	}

}
