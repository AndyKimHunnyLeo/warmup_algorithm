package Mini_Max_Sum;

import java.util.*;

public class Main {
    /*
        Given five positive integers, find the minimum and maximum values that can be calculated
        by summing exactly four of the five integers. Then print the respective minimum and maximum
        values as a single line of two space-separated long integers.

        Function Description
        Complete the miniMaxSum function in the editor below.
        miniMaxSum has the following parameter(s):
        arr: an array of 5 integers

        Print
        Print two space-separated integers on one line: the minimum sum and the maximum sum of  of  elements.

        Input Format
        A single line of five space-separated integers.

        
     */
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(769082435, 210437958, 673982045, 375809214, 380564127));
        Collections.sort(arr);
        long min = 0;
        long max = 0;

        for (int i=0; i < arr.size()-1;i++){
            min += arr.get(i);
        }
        for (int i=1; i < arr.size();i++){
            max += arr.get(i);
        }
        System.out.println(min+" is min and "+max+" is max");
    }
}
