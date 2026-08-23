class linear_search2
{
    public static void main(String[] args) {
        int arr[]={1,3,4,5,6,2};
        int target=6;

        int ans=linearSearch(arr, target);

        System.out.println("element found at index :- "+ans);




    }
    static int linearSearch(int arr[],int target)
    {
     
     if(arr.length==0)
     {
        return -1;
     }
    
        int temp=0;
        
        for(int i=0;i<arr.length;i++)
        {
        int element =arr[i];
        if(element==target)
        {
            return i;
        }
     
        }
          return -1;
    }
}
