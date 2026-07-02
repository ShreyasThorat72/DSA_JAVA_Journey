import java.util.Arrays;
class Rotate_and_removeLast
{
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5};
        int n=arr.length-1;

        for(int i=0;i<n;i++)
        {
            int temp=arr[i];
            arr[i]=arr[n];
            arr[n]=temp;
        }
       
       

       
        System.out.println(Arrays.toString(arr) );
       }
        
    }
