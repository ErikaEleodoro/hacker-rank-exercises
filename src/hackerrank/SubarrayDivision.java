
package hackerrank;
import java.util.ArrayList;

public class SubarrayDivision {
     public static int birthday(ArrayList<Integer> s, int d, int m){
        int div = 0;
        for(int i = 0; i < s.size(); i++){
            int sum = s.get(i);
            for(int j = i + 1; j < (i - 1); j++){
                sum += s.get(j);
            }
            if(sum == d){
                div++;
            }
        }
        return div;
    }
}
