class even_odd
{
    public static void count(int arr[])
    {
        int even=0;
        int odd=0;

         

         for(int x:arr)
         {
            if(x%2==0)
            {
                even++;
            }
            else{
                odd++;
            }
         }

         System.out.println("no of evens"+even);
         System.out.println("no of odds"+odd);

    }

    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,8};
        count(arr);
    }

}