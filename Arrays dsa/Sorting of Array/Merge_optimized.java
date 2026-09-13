
import java.util.TreeSet;
import java.util.Arrays;

class Merge_optimized
{
    public static void main(String [] args)
    {
        Integer[] number={1,2,3,5};
        Integer[] number2={2,3,7,9};

        TreeSet<Integer> Arr= new TreeSet<>(Arrays.asList(number));
        Arr.addAll(Arrays.asList(number2));

     
       
       Integer[]  mergeIntegers =Arr.toArray(new Integer[0]);

        System.out.println(Arrays.toString(mergeIntegers));
    }
}