package recursion.controller;

import javax.swing.JOptionPane;

import recursion.model.RecursionTool;
import recursion.view.RecursionFrame;

public class RecursionController
{
	RecursionFrame baseFrame;
	RecursionTool recursion;
	public RecursionController()
	{
		baseFrame = new RecursionFrame(this);
		recursion = new RecursionTool();
	}
	public void start()
	{
		
	}
	public int calculateFactorial(int currentNumber)
	{
		return recursion.calculateFactorial(currentNumber);
	}
	public boolean stringIsInt(String input)
	{
		try
		{
			if (Integer.parseInt(input) >= 0)
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
}
