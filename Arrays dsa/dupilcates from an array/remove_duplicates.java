import java.util.Arrays;
class remove_duplicates
{
    public static void main(String[] args) {
        
        int arr[]={1,3,4,5,3,6,7};

        for(int i=0;i<arr.length-1;i++)
        {

        for(int j=0;j<arr.length-i-1;j++)
        {
            if (arr[j] > arr[j + 1])
            {

            
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
            }
            
        }
        }
        System.out.println(Arrays.toString(arr));
        
        int temp=arr[0];
        for(int j=0;j<arr.length-1;j++)
        {
            if(arr[j]==arr[j+1])
            {
            temp=arr[j++];
         
            
           
            }
         System.out.println(arr[j]);

        
         
        }
            
         System.out.println(arr[arr.length - 1]);
     

       
       
    }
}