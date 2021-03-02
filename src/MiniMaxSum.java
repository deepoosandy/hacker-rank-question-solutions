import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

Example

The minimum sum is  and the maximum sum is . The function prints

16 24
Function Description

Complete the miniMaxSum function in the editor below.

miniMaxSum has the following parameter(s):

arr: an array of  integers
Print

Print two space-separated integers on one line: the minimum sum and the maximum sum of  of  elements.

Input Format

A single line of five space-separated integers.

Constraints


Output Format

Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than a 32 bit integer.)

Sample Input

1 2 3 4 5
Sample Output

10 14
Explanation

The numbers are , , , , and . Calculate the following sums using four of the five integers:

Sum everything except , the sum is .
Sum everything except , the sum is .
Sum everything except , the sum is .
Sum everything except , the sum is .
Sum everything except , the sum is .
Hints: Beware of integer overflow! Use 64-bit Integer.*/
public class MiniMaxSum {
    public static void main(String[] args) {
        long sum=0;
    int[] arr={256741038 ,623958417 ,467905213, 714532089, 938071625};
        List<Long> list=new ArrayList<>();
        for(int i=0;i< arr.length;i++){
            sum=sum+arr[i];
        }
        for(int i=0;i< arr.length;i++){
            Long  result=sum-arr[i];
            list.add(result);
        }
        Collections.sort(list);
        System.out.print(list.get(0)+" "+list.get(list.size()-1));
    }
}
