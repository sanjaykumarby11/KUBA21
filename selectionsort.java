public class selectionsort {
    public static void selectionSort(int[] arr)
    {
       int n=arr.length;

       for(int i=0;i<n-1;i++)
        {
           int minIndex=i;

           for(int j=i+1;j<n;j++)
           {
           if(arr[j]<arr[minIndex]) 
           {
               minIndex =j;
           }
       }
       swap(arr,i,minIndex);
   }
}
public static void swap(int[] arr,int i,int j) 
{
   int temp=arr[i];
   arr[i]=arr[j];
   arr[j]=temp;
}
public static void printArray(int[] arr)
{
  for(int num :arr)
{
   System.out.print(num +" ");
}
  System.out.println();
} 
    public static void main(String[] args) {
        int[] arr={64 ,25 ,12 ,22 ,11 };
    System.out.println("Unsorted Array:");
    printArray(arr);
    selectionSort(arr);
    System.out.println("Sorted Array:");
    printArray(arr);
    }
}
