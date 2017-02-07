package recursion.model;

public class IterativeTool
{
	public IterativeTool()
	{
		
	}
	public double calculateFactorial(double currentDouble)
	{
		int currentNumber = (int)currentDouble;
		double answer = 1;
		for(int index = 1; index<=currentNumber;index++)
		{
			answer = answer*index;
			
		}
		return answer;
	}
}
