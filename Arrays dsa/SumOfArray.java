class SumOfArray
{
    public static void main(String[]args)
    {
        int arr[]={10,20,30,40};
        int Sum=0;
        for(int i=0;i<arr.length;i++)
        {
        System.out.println(arr[i]);
        Sum=Sum+arr[i];

        }
        System.out.println("sum of array is "+Sum);
    }
}