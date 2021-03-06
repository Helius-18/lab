import java.util.Scanner;
class QuickSort
{
	public static void main(String args[])
	{
		String names[];
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of names:");
		n=sc.nextInt();
		names=new String[n];
		System.out.println("Enter names:");
		for(i=0;i<n;i++)
		{
			names[i]=sc.next();
		}
		quicksort(names,0,n-1);
		System.out.println("\nNames after sorting:");
		for(String s:names)
			System.out.println(s);
	}
	public static void quicksort(String names[],int low,int high)
	{
		if(low<high)
		{
			int pi=partition(names,low,high);
			quicksort(names,low,pi-1);
			quicksort(names,pi+1,high);
		}
	}
	public static int partition(String[] names,int low,int high)
	{
		String pivot=names[low];
		int i=low,j=high;
		
		while(i<j)
		{
			while(names[i].compareTo(pivot)<=0 && i<j)
			{
			    i++;
			}
			while(names[j].compareTo(pivot)>0)
			{
			    j--;
			}
			
			if(i<j)
			{
				String temp=names[i];
				names[i]=names[j];
				names[j]=temp;
			}
		}
		String temp=names[j];
		names[j]=pivot;
		names[low]=temp;
		return j;
	}
}
