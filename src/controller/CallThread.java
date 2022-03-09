package controller;

public class CallThread extends Thread {
	
	private int  threadcall;
	
	public CallThread(int threadcall) {
		this.threadcall = threadcall;
	}

	@Override
	public void run() {
		System.out.println(threadcall);
	}
	
	

}