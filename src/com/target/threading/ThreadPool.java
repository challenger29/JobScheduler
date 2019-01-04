package com.target.threading;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
//must be singleton
public class ThreadPool {
	private long expirationTime;
	private List<Thread> threads;
	private Hashtable<Thread, Long> locked , unlocked;
	public ThreadPool(){
		expirationTime = 30000;
		locked = new Hashtable<>();
		unlocked = new Hashtable<>();
		
	}
	public void setMaxPoolSize(int num){
		if(threads == null){
			expirationTime = 30000;
			locked = new Hashtable<>(num);
			unlocked = new Hashtable<>(num);
			threads = new ArrayList<>();
			for(int i = 0 ; i < num ; i++){
				threads.add(new Thread());
			}
		}
	}
	public Thread getThread(){
		long now = System.currentTimeMillis();
		Thread thread;
		if(unlocked.size()>0){
			Enumeration<Thread> e = unlocked.keys();
			while(e.hasMoreElements()){
				thread = e.nextElement();
				if( (now - unlocked.get(thread)) > expirationTime ){
					unlocked.remove(thread);
//					expire()
				}
			}
			
		}
		return null;
	}
	public void acquire(){
		
	}
	public void release(){
		
	}
}
