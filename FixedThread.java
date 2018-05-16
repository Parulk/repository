package com.kronos.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FixedThread {

	public static void main(String[] args) {
		
		ExecutorService exec = Executors.newFixedThreadPool(3);
		exec.execute(new LoopTask(1));
		exec.execute(new LoopTask(2));
		exec.execute(new LoopTask(3));
		exec.execute(new LoopTask(4));
		exec.execute(new LoopTask(5));
		 exec.shutdown();
		while (!exec.isTerminated()) {
        }
		
		System.out.println("Task Ends Here");
		
		

	}

}

class LoopTask implements Runnable{
	
	private int id;
	@Override
	public void run(){
	for(int i=10;i>0;i--)
	{
		System.out.println("<Task" + id + "> " );
	 }
	}
	
	public LoopTask(int id)
	{
		this.id=id;
	}
}
