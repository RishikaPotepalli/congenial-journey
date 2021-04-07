package H1;
import java.util.*;
public class Tripp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tripp p = new Tripp();
		int arr1[] = new int[5];
		int arr2[] = new int[5];
		System.out.println("Enter the values for arr1");
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = sc.nextInt();
		}
		
		arr2 = getArrayElements(arr1);
		System.out.println("Non-duplicate elements in the array are:");
		printArray(arr2);
		System.out.println("Element to be found in the array:");
		int searchKey = sc.nextInt();
		int searchIndex = p.searchEle(arr1, searchKey);
		System.out.println("Value " + searchKey + " is found at index: " + searchIndex);
		int[] minMax = p.getMinMax(arr1);
		System.out.println("Minimum and Maximum Element of the array is:");
		printArray(minMax);
		System.out.println("Enter the value for which the multiples has to be found");
		int multiples = sc.nextInt();
		int[] multiplesArray = p.getMulOf(arr1, multiples);
		printArray(multiplesArray);
		if(multiplesArray[0] == 0) {
			System.out.println("No Multiples Found");
		}
	}
	public int searchEle(int[] arrSearch,int key) {
		if(arrSearch.length == 0) {
			return -2;
		}
		for(int i=0;i<arrSearch.length;i++) {
			if(arrSearch[i] == key)
			{
				return i;
			}
		}
		return -1;
	}
	public int[] getMinMax(int arr[]) {
		int[] toReturn = new int[2];
		int min = arr[0];
		int max = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] < min)
				min = arr[i];
			if(arr[i] > max)
				max = arr[i];
		}
		toReturn[0] = min;
		toReturn[1] = max;
		return toReturn;
	}

	public int[] getMulOf(int arr[], int x) {
		int[] toReturn = new int[arr.length];
		int in = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%x == 0)
			{
				toReturn[in] = arr[i];
				in++;
			}
		}
		return toReturn;
	}
	private static int[] getArrayElements(int[] preArr)
	{
		int[] toReturn = new int[preArr.length];
		int in = 0;
		for(int i=0;i<preArr.length;i++)
		{
			boolean a = false;
			for(int j=0;j<i;j++)
			{
				if(preArr[i] == preArr[j])
				{
					a=true;
					break;
				}
			}
			if(!a)
			{
				toReturn[in] = preArr[i];
				in++;
			}
		}
		return toReturn;
	}
	private static void printArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 0)
				break;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}