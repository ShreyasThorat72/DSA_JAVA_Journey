class enhancedForLoop{
    public static void main(String[] args) {
        
        String[] names= {"shreyas","elon"};

        int[] Age = { 34,45};


        for( String name:names)
        {
            System.out.println("name :"+name);

            for(int age:Age)
            {

            
            System.out.println("age : "+age);
            }
        }
    }
}