class Break_goTo

{
    public static void main(String[] args) {

     for(int i=0;i<3;i++)
     {
        one :{
            System.out.println(i);
            if(i==0)

            System.out.println("after third label");
        }

        two : {

            System.out.println(i);
            if(i==1)
            System.out.println("after second label");

        }

        three : {
            System.out.println(i);
            if(i==2)
            System.out.println("after one label");
        }
     }   
    
    }
}