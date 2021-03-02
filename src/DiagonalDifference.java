/*Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix  is shown below:

1 2 3
4 5 6
9 8 9
The left-to-right diagonal = . The right to left diagonal = . Their absolute difference is .

Function description

Complete the  function in the editor below.

diagonalDifference takes the following parameter:

int arr[n][m]: an array of integers
Return

int: the absolute diagonal difference
Input Format

The first line contains a single integer, , the number of rows and columns in the square matrix .
Each of the next  lines describes a row, , and consists of  space-separated integers .

Constraints

Output Format

Return the absolute difference between the sums of the matrix's two diagonals as a single integer.

Sample Input

3
11 2 4
4 5 6
10 8 -12
Sample Output

15
Explanation

The primary diagonal is:

11
   5
     -12
Sum across the primary diagonal: 11 + 5 - 12 = 4

The secondary diagonal is:

     4
   5
10
Sum across the secondary diagonal: 4 + 5 + 10 = 19
Difference: |4 - 19| = 15

Note: |x| is the absolute value of x*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<>();

        List<Integer> l1 = Arrays.asList(6, 6, 7, -10, 9, -3, 8, 9, -1);
        List<Integer> l2 = Arrays.asList(9, 7, -10, 6, 4, 1, 6, 1, 1);
        List<Integer> l3 = Arrays.asList(-1, -2, 4, -6, 1, -4, -6, 3, 9);
        List<Integer> l4 = Arrays.asList(-8, 7, 6, -1, -6, -6, 6, -7, 2);
        List<Integer> l9 = Arrays.asList(-10, -4, 9, 1, -7, 8, -5, 3, -5);
        List<Integer> l5 = Arrays.asList(-8, -3, -4, 2, -3, 7, -5, 1, -5);
        List<Integer> l6 = Arrays.asList(-2, -7, -4, 8, 3, -1, 8, 2, 3);
        List<Integer> l7 = Arrays.asList(-3, 4, 6, -7, -7, -8, -3, 9, -6);
        List<Integer> l8 = Arrays.asList(-2, 0, 5, 4, 4, 4, -3, 3, 0);

        lists.add(l1);
        lists.add(l2);
        lists.add(l3);
        lists.add(l4);
        lists.add(l9);
        lists.add(l5);
        lists.add(l6);
        lists.add(l7);
        lists.add(l8);
        System.out.println(diagonalDifference(lists));

    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int n = 0;
        int dig1 = 0;
        int dig2 = 0;
        for (List<Integer> l : arr) {
            dig1 = dig1 + l.get(n);
            n++;
            dig2 = dig2 + l.get(l.size() - n);
        }

        return Math.abs(dig1 - dig2);
    }
}






















