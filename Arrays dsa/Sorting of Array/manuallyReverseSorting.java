import java.util.Arrays;
class manuallyReverseSorting
{
    public static void main(String[] args) {
        
        int arr[]={1,2,4,8,5,3,9};

        Arrays.sort(arr);

        for(int i=0; i<arr.length/2; i++)

        {
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}