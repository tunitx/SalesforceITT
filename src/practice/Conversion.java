package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Conversion {
    public static void main(String[] args) {
       // conversion of array to list

        // in case of primitives
        int [] arr = {7, 98 , 9 , 9};
        // gives a dynamic list
        List<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toList());

        int [] arr2 = {7, 98 , 9 , 9};
        //or
        arrList = new ArrayList<>(Arrays.stream(arr2).boxed().toList());

        char [] charArray = {'a', 'b', 'c'};
//        List<Character> characters = Arrays.stream(charArray).
        List<Character> newCharArray = new ArrayList<>(IntStream.range(0,charArray.length).mapToObj(i ->charArray[i]).toList());


        // in case of non primitives
        String [] arr3 = {"tanish", "anand", "tushar"};
        // gives a fixed size
        List<String> strings = Arrays.asList(arr3);

        // gives a dynamic size
        strings = new ArrayList<>(Arrays.asList(arr3));

        // ************************************************************************************** ///

        // Conversion of a list to array
        // for Primitive types :

        List<Integer> fixedList = List.of(1,2 ,3 ,4 ,4 ,5);
        int [] res = fixedList.stream().mapToInt(Integer::intValue).toArray();

        List<Character> chars = List.of('a', 'b', 'c');
        char [] newChars = chars.stream().collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString().toCharArray();

        List<String> newStr= List.of("tanish", "anand", "some");
        String [] newStrArr = newStr.toArray(String[]::new);

    }
}
