/**
 * 
 */
package com.yash.main;

import com.yash.model.Login;
import com.yash.model.LoginEnum;

/**
 * @author Yashwanth
 *
 */
public class Main {
	
public static void main(String[] args) {
	//Way 1	
	Login firstTimelogin = Login.getInstLogin();
	Login secondTimelogin = Login.getInstLogin();

	//Way 2		
	Thread t1= new Thread(new Runnable() {
		
		@Override
		public void run() {
			Login firstTimelogin = Login.getInstLogin();
		}
	});
	Thread t2= new Thread(new Runnable() {
		
		@Override
		public void run() {
			Login secondTimelogin = Login.getInstLogin();
		}
	});
	t1.start();
	t2.start();
	
	//Way 3
	LoginEnum firstEnumTimelogin = LoginEnum.INSTANCE;
	firstEnumTimelogin.i = 5;
	firstEnumTimelogin.show();
	
	LoginEnum secondEnumTimelogin = LoginEnum.INSTANCE;
	secondEnumTimelogin.i = 6;
	secondEnumTimelogin.show();
}

}
