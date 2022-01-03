/**
 * 
 */
package com.yash.model;

/**
 * @author Yashwanth
 *
 */
public interface Subject {

	void subscribe(Subscriber subscriber);

	void unSubscribe(Observer subscriber);

	void notifySubscriber();

	void upload(String title);

}