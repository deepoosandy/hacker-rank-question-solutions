import java.util.*;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        Integer[] arr={3, 2, 1, 3};
        List<Integer> list=  Arrays.asList(arr);
        System.out.println(birthdayCakeCandles(list));
    }
    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        TreeMap<Integer, Integer> candlesMap=new TreeMap<>();

        int count=0;
        for(int candle: candles){
            count=1;
            if(candlesMap.containsKey(candle)){
                count=candlesMap.get(candle);
                count++;
            }
            candlesMap.put(candle, count);
        }
        int key=candlesMap.lastKey();
        return candlesMap.get(key);
    }
    }
