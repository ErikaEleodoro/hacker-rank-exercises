
package hackerrank;

public class BreakingTheRecords {
    
    public static void breakingRecords(int[] scores){
    int highestScore = scores[0];
        int lowestScore = scores[0];
        int countHighest = 0;
        int countLowest = 0;
        
        for(int i = 0; i < scores.length; i++){
            if(scores[i] < lowestScore){
                lowestScore = scores[i];
                countLowest++;
            }  
            
            if(scores[i] > highestScore){
                highestScore = scores[i];
                countHighest++;
            }
        }
        
        System.out.println("Highest Score: " + countHighest + "\nLowest Score: " + countLowest);
    }
}
