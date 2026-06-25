class LargestElementArray
{
    public static void main(String[] args) {
      
        int arr[]={10,20,30,40};
          int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
             max=arr[i];
            }
        }
        System.out.println("maximum number in an array is :"+" "+max);
    }
}
