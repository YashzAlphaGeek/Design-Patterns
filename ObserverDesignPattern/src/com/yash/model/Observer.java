/**
 * 
 */
package com.yash.model;

/**
 * @author Yashwanth
 *
 */
public interface Observer {

	void update();

	void subscribeChannel(Channel ch);

}