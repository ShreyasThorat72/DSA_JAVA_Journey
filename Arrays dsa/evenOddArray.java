class evenOddArray
{
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5,6,7,8,9,11,13,15};
        int even=0;
        int odd=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                even=even+1;
            }
            else
            {
                odd=odd+1;
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}