/*
 By: Ben Bowden
 Call any of the methods below to perform recursion for various task.
 
 */

public class RecursiveMethods {
	
	
	public static void main(String args[])
	{
		System.out.println("Fib: " + fib(0));	//test solution, calling fib of 0 in this example
		
	}
	
	//sum of values starting at n (3 i.e. 3+2+1)
	public static int sum(int n)
	{
		if(n == 1)
		{
			return 1;
		}
		return n + sum(n-1);
		
	}
	
	//product of values (3 i.e. 3*2*1)
	public static int prod(int n)
	{
		if(n== 1)
		{
			return 1;
		}
		
		return n * prod (n-1);
	}
	
	//returns fibonacci result
	public static int fib(int n)
	{
		if(n < 1){
			System.out.println("Enter a higher number than " + n + ". Returning 0");
			return 0;
		}
		if(n== 1)
		{
			return 1;
		}
		
		if(n == 2)
		{
			return 1;
		}
		return fib(n-2) + fib (n-1);	
	}
	
	public static void printArray (int i, int arrayOfNum[])
	{
		if(i == arrayOfNum.length-1)
		{
			System.out.println("arrayOfNum: " + arrayOfNum[i]);
		}
		else
		{
			System.out.println("arrayOfNum: " + arrayOfNum[i]);
			printArray(i+1, arrayOfNum);
		}
	}
	
	public static void printArrayReverse (int i, int arrayOfNum[])
	{
		if(i == 0)
		{
			System.out.println("arrayOfNum: " + arrayOfNum[i]);
		}
		else
		{
			System.out.println("arrayOfNum: " + arrayOfNum[i]);
			printArrayReverse(i-1, arrayOfNum);
		}
	}
	
	public static int countZeros (int i, int arrayOfNum[])
	{
		if (i == arrayOfNum.length-1)
		{
			if(arrayOfNum[i] == 0)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		else
		{
			if(arrayOfNum[i] == 0)
			{
				return 1 + countZeros(i+1, arrayOfNum);
			}
			else
			{
				return countZeros(i+1, arrayOfNum);
			}	
		}
	}
	public static void findMin(int i, int arrayOfNum[], int currentMin)
	{
		System.out.println("blah: " +currentMin);
		if(i == arrayOfNum.length-1)
		{
			if(arrayOfNum[i] < currentMin)
			{
				currentMin = arrayOfNum[i];
			}	
			System.out.println("Min is: " + currentMin);
		}
		else
		{
			if(arrayOfNum[i] < currentMin)
			{
				System.out.println("Changed");
				currentMin = arrayOfNum[i];
			}
			findMin (i+1, arrayOfNum, currentMin);
		}
	}

}
