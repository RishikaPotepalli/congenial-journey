package second;
import java.util.*;
public class Duplicate {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr1[] = new int[5];
		int arr2[] = new int[5];
		System.out.println("Enter the  values for arr1");
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = sc.nextInt();
		}
		arr2 = getArrayElements(arr1);
		printArray(arr2);
	}

	private static int[] getArrayElements(int[] preArr)
	{
		int[] b = new int[preArr.length];
		int a = 0;
		for(int i=0;i<preArr.length;i++)
		{
			boolean c= false;
			for(int k=0;k<i;k++)
			{
				if(preArr[i] ==preArr[k])
				{
					c=true;
					break;
				}
			}
			if(!c)
			{
				b[a] = preArr[i];
				a++;
			}
		}
		return b;
	}
	private static void printArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 0)
				break;
			System.out.print(arr[i] +" ");
		}
	}

}
