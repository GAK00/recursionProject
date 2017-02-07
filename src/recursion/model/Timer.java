package recursion.model;

import java.text.DecimalFormat;

public class Timer
{
	private long executionTime;
	DecimalFormat format;
	
	public Timer()
	{
		executionTime = 0;
		format = new DecimalFormat("#0.000000000000");
	}
	public void startTimer()
	{
		executionTime = System.nanoTime();
	}
	public void resetTimer()
	{
		executionTime = 0;
	}
	public void stopTimer()
	{
		executionTime = System.nanoTime() - executionTime;
	}
	public String toString()
	{
		String info = "The execution time is " + executionTime + " nanoseconds"+
	"\nOr "+format.format(((double)executionTime)/1000000000)+" Seconds";
		return info;
	}
	
}
