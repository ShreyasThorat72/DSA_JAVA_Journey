
import java.util.Arrays;
import java.util.HashSet;

class Optimized_remove_dupli
{
    public static void main(String[] args) {

        Integer[] numbers ={2,3,3,5,6,7,7,9};

        HashSet<Integer> set =new HashSet<>(Arrays.asList(numbers));

        Integer[] UniqueNumbers =set.toArray(new Integer[0]);

        System.out.println(Arrays.toString(UniqueNumbers));


    }
}