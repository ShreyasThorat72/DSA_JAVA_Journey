import java.util.Arrays;
class Intersection
{
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6};
        int arr2[]={2,3,4,9};



     int [] newArray= new int[arr.length+arr2.length];

     for(int i=0;i<arr.length;i++)
 {
  newArray[i]=arr[i];
 }
 for(int j=0;j<arr2.length;j++)
 {
    newArray[arr.length+j]=arr2[j];
 }
    System.out.println(Arrays.toString(newArray));  

int [] newArray2= new int[arr.length+arr2.length];
            
    
for(int x=0;x<newArray2.length;x++)
{
 for(int y=0;y<newArray2.length;y++)
 {
    if(newArray2[y]>newArray2[y+1])
    {
        int temp=newArray2[y];
        newArray2[y]=newArray2[y+1];
        newArray2[y+1]=temp;
    }

    
 }

}

System.out.println(Arrays.toString(newArray2));
int temp=arr[0];
 for(int h=0;h<newArray.length;h++)
 {
    if(newArray[h]==newArray[h+1])
    {
     temp=newArray[h++];
    }
 }

}
}