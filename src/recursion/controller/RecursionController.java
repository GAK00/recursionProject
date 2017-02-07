package recursion.controller;

import javax.swing.JOptionPane;

import recursion.model.IterativeTool;
import recursion.model.RecursionTool;
import recursion.model.Timer;
import recursion.model.Tool;
import recursion.view.RecursionFrame;

public class RecursionController
{
	private RecursionFrame baseFrame;
	private Tool currentTool;
	private RecursionTool recursion;
	private IterativeTool iterative;
	private Timer timer;
	public RecursionController()
	{
		baseFrame = new RecursionFrame(this);
		recursion = new RecursionTool();
		iterative = new IterativeTool();
		timer = new Timer();
		currentTool = recursion;
	}
	public void start()
	{
		
	}
	public String calculateFactorial(double currentNumber)
	{
		timer.resetTimer();
		timer.startTimer();
		double answer = currentTool.calculateFactorial(currentNumber);
		timer.stopTimer();
		return"The factorial of "+currentNumber+" is: "+Double.toString(answer)+"\n"+timer;
	}
	public String calculateFibonacci(double currentNumber)
	{
		timer.resetTimer();
		timer.startTimer();
		double answer = currentTool.calculateFibonacci(currentNumber);
		timer.stopTimer();
		return"The number at the pos of "+currentNumber+" in the Fibonacci sequence is: "+Double.toString(answer)+"\n"+timer;
	}
	public boolean stringIsInt(String input)
	{
		try
		{
			if (Long.parseLong(input) >= 0)
			{
				return true;
			}
			else
			{
				JOptionPane.showMessageDialog(baseFrame, "Error: make sure you enter a positive integer.");
				return false;
			}
		} catch (NumberFormatException e)
		{
			JOptionPane.showMessageDialog(baseFrame, "Error: make sure you enter an integer.");
			return false;
		}
	}
	public void switchTool()
	{
		if(currentTool==recursion)
		{
			currentTool = iterative;
		}
		else
		{
			currentTool = recursion;
		}
	}
}
