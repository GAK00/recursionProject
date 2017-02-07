package recursion.model;

public class IterativeTool extends Tool
{
	public IterativeTool()
	{
		super();
	}
	public double calculateFactorial(double currentDouble)
	{

		int currentNumber = (int) currentDouble;
		if (currentNumber == 0)
		{
			return 0;
		} else
		{
			double answer = 1;
			for (int index = 1; index <= currentNumber; index++)
			{
				answer = answer * index;

			}
			return answer;
		}
	}
	public double calculateFibonacci(double currentDouble)
	{
		int currentNumber = (int) currentDouble;
		if (currentNumber < 3)
		{
			return currentNumber;
		}
		int onceBack = 1;
		int twiceBack = 0;
		for (int index = 3; index <= currentNumber; index++)
		{
			int temp = onceBack;
			onceBack = onceBack + twiceBack;
			twiceBack = temp;
		}
		return onceBack;
	}
}
