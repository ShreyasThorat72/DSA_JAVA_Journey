import java.util.Scanner;
class multipleInputs
{
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);

        System.out.println(".(Enter a number)");
        int num=input.nextInt();
        System.out.println(".(Number taken as an input is : )"+input.nextInt());

        System.out.println(".(enter your name)");
        String name=input.nextLine();
        System.out.println(".(entered name is )"+input.nextLine());

        System.out.println(".(enter your networth)");
        Float networth= input.nextFloat();
        System.out.println("networth of the person is "+input.nextFloat());

    }
}