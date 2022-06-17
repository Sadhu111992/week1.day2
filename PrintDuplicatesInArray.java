package week1.day2.assignments;

public class PrintDuplicatesInArray {
	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		System.out.println("Length of an array is: " + arr.length);
		for (int i=0; i<=arr.length-1; i++)
		{
			for (int i1=1; i1<i; i1++)
			{
				if (arr[i]==arr[i1])
					System.out.println(arr[i1]);
				}
			}
		}
	}
