package hackerrank;

import java.util.ArrayList;

public class Test {
    
    public static void main(String[] args) {
        //testApplesAndOranges();
        //testBreakingTheRecords();
        //testCatsAndMouse();
        //testGradingStudents();
        testSubarrayDivision();
    }
    
    public static void testApplesAndOranges(){
        int s = 7;
        int t = 10;
        int a = 4;
        int b = 12;
        int[] apples = {2, 3, -4};
        int[] oranges = {-1, -2, -4};
        ApplesAndOranges.CountFruits(s, t, a, b, apples, oranges);
    }
    
    public static void testBreakingTheRecords(){
        int[] scores = {10, 5, 20, 20, 4, 5, 2, 25, 1, 20, 1, 26};
        BreakingTheRecords.breakingRecords(scores);
    }
    
    public static void testCatsAndMouse(){
        int x = 1;
        int y = 3;
        int z = 2;
        System.out.println(CatsAndMouse.catAndMouse(x, y, z));
    }
    
    public static void testGradingStudents(){
        int[] test = {60,67,38,44};
        
        int[] result = GradingStudents.gradingStudents(test);
        
        for(int i = 0; i < test.length; i++){
            System.out.println(result[i]);
        }
    }
    
    public static void testSubarrayDivision(){
        int d = 4;
        int m = 1;
        ArrayList<Integer> s = new ArrayList<>();
        s.add(4);
        System.out.println(SubarrayDivision.birthday(s, d, m));
    }
}
