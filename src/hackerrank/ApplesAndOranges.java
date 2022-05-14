
package hackerrank;

public class ApplesAndOranges {
    
    public static void CountFruits(int s, int t, int a, int b,int[] apples, int[] oranges){
        int applesQty = 0;
        int orangesQty = 0;
    
        for(int i = 0; i < apples.length; i++){
            if(apples[i] > 0){
                int applePosition = a + apples[i];
                if(applePosition >= 7 && applePosition <= 10){
                    applesQty++;
                }
            }
            
            if(oranges[i] < 0){
                int orangePosition = b - Math.abs(oranges[i]);
                if(orangePosition >= 7 && orangePosition <= 10){
                    orangesQty++;
                }
            }
        }
        
        System.out.println("Apples: " + applesQty + "\nOranges: " + orangesQty);
    }
}
