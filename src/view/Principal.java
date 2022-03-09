package view;

import controller.CallThread;

public class Principal {

	public static void main(String[] args) {
		
		for(int threadcall = 0; threadcall < 5; threadcall++) {
			CallThread CallThread = new CallThread(threadcall);
			CallThread.start();
		}
	}

}