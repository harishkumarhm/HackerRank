import java.util.Arrays;


public class IncrementDuplicate {
public static void main(String[] args)
{
	//int[] arr = {1,2,2,3,4,5,5,5,6,7};
	int[] arr = {1,2,2,5,8,10,10,15,6,25};
	Arrays.sort(arr);
	for(int i=0; i <arr.length; i++)
	{  int j=i+1;
	  
		while(j<arr.length && (arr[i]==arr[j]||arr[j] <arr[j-1]))
		{  
			arr[j] = arr[j]+1;
			j++;
			
		}
	}
	for(int k=0; k<arr.length; k++)
		System.out.println(arr[k]);
}
}
