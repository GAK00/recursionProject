package recursion.model;

public class RecursionTool
{
	public double calculateFactorial(double currentNumber)
	{
		if(Double.compare(currentNumber, 0)== 0 || Double.compare(currentNumber, 1)== 0)
		{
			return 1;
		}
		else
		{
			return (calculateFactorial(currentNumber -1)*currentNumber);
		}
	}
	public double calculateFibonacci(double currentNumber)
	{
		if(Double.compare(currentNumber, 1)== 0)
		{
			return 1;
		}
		else if(Double.compare(currentNumber, 0)== 0)
		{
			return 0;
		}
		else
		{
			return (calculateFibonacci(currentNumber -1)+calculateFibonacci(currentNumber-2));
		}
	}
}
