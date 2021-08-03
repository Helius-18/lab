import java.util.Scanner;
public class BubbleSort
{
    public static void main(String[] args)
    {
        int n, temp,ichange=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array: ");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n-1; i++)
        {
            for (int j = 0; j < n-1-i; j++)
            {
                if (a[j] < a[j+1])
                {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                     ichange++;
                }
            }
        }
        System.out.println("\nDescending Order:");
        for (int i = 0; i <=n - 1; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.print("\nInterchanges occurred="+ichange);
    }
}
