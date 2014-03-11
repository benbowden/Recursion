/*
 By: Ben Bowden
 Call any of the methods below to perform recursion for various task.
 
 */

public class RecursiveMethods {
	
	/*
	//test main
	public static void main(String args[])
	{
		//call any of these to 
		
		int myArray[] = {4, 2, 3, 4};
		printArray(0, myArray);
		System.out.println("Reverse");
		printArrayReverse(myArray.length-1, myArray);
		System.out.println("Count Zeros");
		System.out.println("Amount of zeros: " + countZeros(0, myArray));
		System.out.println("Min");
		findMin(0, myArray, myArray[0]);
	}
	*/
	
	public static int sum(int n)
	{
		if(n == 1)
		{
			return 1;
		}
		return n + sum(n-1);
		
	}
	
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
		
		if(n== 1)
		{
			return 1;
		}
		
		if(n == 2)
		{
			return 2;
		}
		return fib(n-1) + fib (n-2);	
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
