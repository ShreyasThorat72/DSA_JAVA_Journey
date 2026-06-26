import java.util.Arrays;
class SecondLargest
{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,23,56};
        int max =0;

        Arrays.sort(arr);
       
        System.out.println(Arrays.toString(arr));

        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}