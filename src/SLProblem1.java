import java.math.BigDecimal;
import java.util.*;

public class SLProblem1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        n=Integer.parseInt(sc.nextLine());
        int totalMinsDisplay = 0;
        double average = 0;
        int count = 0;
        if(n >=1 && n<=1000) {
            while (count <= n && sc.hasNextLine()) {
                String input = sc.nextLine();
                String[] tokens = input.split("\\s+");
                int minute = Integer.parseInt(tokens[0]);
                totalMinsDisplay = totalMinsDisplay + minute;
                average += Math.abs((Double.valueOf(tokens[1]) / 60));
                count = count + 1;
                if (count == n)
                    break;
            }
        } else{
                 System.exit(0);
            }
             BigDecimal result = BigDecimal.valueOf((average / totalMinsDisplay));
              if (BigDecimal.valueOf(1).doubleValue() >= result.doubleValue()) {
                   System.out.println("measurement error");
                } else {
                  System.out.printf("%.9f", result);
              }
             sc.close();

    }

}
