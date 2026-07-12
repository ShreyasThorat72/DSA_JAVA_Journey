

class missing_element
{
    public static void main(String[] args) {
        
        Integer[] arr=new Integer[]{1,2,null,4,8,5};

        for(Integer i=0;i<arr.length;i++)
        {
            if(arr[i]==null)
            {
                System.out.println("null value is spotted at index : "+i);
            }
        }
    }
}