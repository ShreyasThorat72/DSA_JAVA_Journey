import java.util.Arrays;
class Union_arrays
{
public static void main(String[] args) {
    int arr[]={1,5,3,4,6};
    
    int arr2[]={3,4,9};

    int temp=arr[0];
    for(int i=0;i<arr.length;i++)
    {
     System.out.println(arr[i]);
    }
    for(int j=0;j<arr2.length;j++)
        {
         System.out.println(arr2[j]+" end   ");

        }
    
    int[] newArray = new int[arr.length+arr2.length]; 
 
 for(int i=0;i<arr.length;i++)
 {
  newArray[i]=arr[i];
 }
 for(int j=0;j<arr2.length;j++)
 {
    newArray[arr.length+j]=arr2[j];
 }
    System.out.println(Arrays.toString(newArray));              
    
}


}

