/*Given a time in -hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

Example


Return '12:01:00'.


Return '00:01:00'.

Function Description

Complete the timeConversion function in the editor below. It should return a new string representing the input time in 24 hour format.

timeConversion has the following parameter(s):

string s: a time in  hour format
Returns

string: the time in  hour format
Input Format

A single string  that represents a time in -hour clock format (i.e.:  or ).

Constraints

All input times are valid
Sample Input 0

07:05:45PM
Sample Output 0

19:05:45*/
public class TimeConversion {
    public static void main(String[] args) {
        System.out.println(timeConversion("12:45:54PM"));
    }
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String finalTime="";
        String[] time=s.split(":");
        if(time[2].contains("PM")){
            if("12".equals(time[0])){
                finalTime=
                        12+":"+time[1]+":"
                                +time[2].replace("PM","");
            }else {
                finalTime=
                        Integer.parseInt(time[0])+12+":"+time[1]+":"
                                +time[2].replace("PM","");
            }


        }else{
            if("12".equals(time[0])){
                finalTime=
                        "00"+":"+time[1]+":"
                                +time[2].replace("AM","");
            }else{
                finalTime=
                        time[0]+":"+time[1]+":"
                                +time[2].replace("AM","");
            }

        }

        return finalTime;
    }
}
