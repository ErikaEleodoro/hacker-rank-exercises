
package hackerrank;

public class CatsAndMouse {
    public static String catAndMouse(int catA, int catB, int Mouse){
        String result = "";
        int distanciaX = 0;
        int distanciaY = 0;
        
        distanciaX = Math.abs(Mouse - catA);
        distanciaY = Math.abs(Mouse - catB);
        
        if(distanciaX < distanciaY){
            result = "Cat A";
        } else if(distanciaY < distanciaX){
            result = "Cat B";
        } else if (distanciaX == distanciaY){
            result = "Mouse C";
        }
        
        return result;
    }
}
