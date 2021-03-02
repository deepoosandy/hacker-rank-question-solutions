/*There is a new mobile game that starts with consecutively numbered clouds. Some of the clouds are thunderheads and others are cumulus. The player can jump on any cumulus cloud having a number that is equal to the number of the current cloud plus  or . The player must avoid the thunderheads. Determine the minimum number of jumps it will take to jump from the starting postion to the last cloud. It is always possible to win the game.

For each game, you will get an array of clouds numbered  if they are safe or  if they must be avoided.

Example

Index the array from . The number on each cloud is its index in the list so the player must avoid the clouds at indices  and . They could follow these two paths:  or . The first path takes  jumps while the second takes . Return .

Function Description

Complete the jumpingOnClouds function in the editor below.

jumpingOnClouds has the following parameter(s):

int c[n]: an array of binary integers
Returns

int: the minimum number of jumps required
Input Format

The first line contains an integer , the total number of clouds. The second line contains  space-separated binary integers describing clouds  where .

Constraints

Output Format

Print the minimum number of jumps needed to win the game.

Sample Input 0

7
0 0 1 0 0 1 0
Sample Output 0

4
Explanation 0:
The player must avoid  and . The game can be won with a minimum of  jumps:

jump(2).png

Sample Input 1

6
0 0 0 0 1 0
Sample Output 1

3*/
public class JumpingOnClouds {
    public static void main(String[] args) {
        String s = "0 0 1 0 0 1 0";
        String[] arrS = s.split("\\s+");
        int[] arr = new int[arrS.length];
        for (int i = 0; i < arrS.length; i++)
            arr[i] = Integer.valueOf(arrS[i]);
        System.out.println(jumpingOnClouds(arr));
    }

    static int jumpingOnClouds(int[] c) {
        int count = 0;

        for (int i = 0; i < c.length; ) {


            if ((i + 2) < c.length && c[i + 2] != 1) {
                i = i + 2;
                count++;
            } else if ((i + 1) < c.length && c[i + 1] != 1) {
                i = i + 1;
                count++;
            } else {
                i++;
            }

        }
        return count;
    }
}

















