class linear_search2
{
    public static void main(String[] args) {
        int arr[]={1,3,4,5,6,2};
        int temp=0;
        
        for(int i=0;i<arr.length;i++)
        {
        if(temp==5)
        {
            temp=arr[i];
            
        }
     
        }
           System.out.println("the key value is found at index : "+" "+"is the number: "+temp);
    }
}