package com.male.Thread.SimpleWn;

public class GoodSuspend {

	public static Object obj = new Object();
	
	public static class ChangeObjectThread extends Thread{
		volatile boolean suspendme = false;
		
		public void suspendMe(){
			suspendme = true;
		}
		
		public void resumeMe(){
			suspendme = false;
			synchronized(this){
				notify();
			}
		}
		
		public void run(){
			while(true){
				
			}
		}
	}
}
