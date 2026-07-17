class Sum_of_Digits
{
    public static void main(String[] args) {
        int num=23456;
       int sum=0;
       int rem;
       for(int k=0;k<=5;k++)
       {
        rem=num%10;
        sum=sum+rem;
         num=num/10;
       }
       System.out.println(sum);

    }
}