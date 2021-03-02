import java.util.HashMap;
import java.util.Map;

/*There is a string, , of lowercase English letters that is repeated infinitely many times. Given an integer, , find and print the number of letter a's in the first  letters of the infinite string.

Example


The substring we consider is , the first  characters of the infinite string. There are  occurrences of a in the substring.

Function Description

Complete the repeatedString function in the editor below.

repeatedString has the following parameter(s):

s: a string to repeat
n: the number of characters to consider
Returns

int: the frequency of a in the substring
Input Format

The first line contains a single string, .
The second line contains an integer, .

Constraints

For  of the test cases, .
Sample Input

Sample Input 0

aba
10
Sample Output 0

7
Explanation 0
The first  letters of the infinite string are abaabaabaa. Because there are  a's, we return .

Sample Input 1

a
1000000000000
Sample Output 1

1000000000000
Explanation 1
Because all of the first  letters of the infinite string are a, we return .*/
public class LowercaseEnglish {
    public static void main(String[] args) {

        System.out.println(repeatedString("gfcaaaecbg", 547602));
    }

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long count = countChar(s, 'a');
        long inputStringlength = s.length();
        long newCount = 0;
        if ((n % inputStringlength) == 0) {
            long times = n / inputStringlength;
            newCount = (times * count);
        } else if ((n % inputStringlength) != 0) {
            int remainderStringlength = (int) (n % inputStringlength);
            String subString = s.substring(0, remainderStringlength);
            long countR = countChar(subString, 'a');
            newCount = ((n / inputStringlength) * count) + countR;
        }

        return newCount;

    }

    public static long countChar(String s, Character inputChar) {

        long count = 0;
        char[] c = s.toCharArray();
        Map<Character, Long> map = new HashMap<>();

        for (char chars : c) {
            count = 1;
          //  Character key=new Character(chars);
            if (map.containsKey(chars)) {
                count = map.get(chars);
                count++;
            }
                map.put(chars, count);

        }
       // Character input=new Character(inputChar);
        if(map.get(inputChar)==null){
          count=0;
        }else{
            count = map.get(inputChar);
        }

        return count;
    }
}











