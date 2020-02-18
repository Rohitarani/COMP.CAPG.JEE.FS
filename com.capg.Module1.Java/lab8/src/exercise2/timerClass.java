package exercise2;

import java.sql.Date;
import java.util.Timer;
import java.util.TimerTask;

public class timerClass {

	public static void main(String[] args) {
		long delay = 10 * 1000; // delay in milliseconds
	    timerTask task = new timerClass();
	    Timer timer = new Timer("TaskName");

	    public void start() {
	        timer.cancel();
	        timer = new Timer("TaskName");
	        Date executionDate = new Date(); // no params = now
	        timer.scheduleAtFixedRate(task, executionDate, delay);
	    }

	    private class LoopTask extends TimerTask {
	        public void run() {
	            System.out.println("This message will print every 10 seconds.");
	        }
	    }

	    public static void main(String[] args) {
	        ClassExecutingTask executingTask = new ClassExecutingTask();
	        executingTask.start();
	    }// TODO Auto-generated method stub

	}

}
