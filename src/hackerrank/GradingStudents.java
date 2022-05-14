
package hackerrank;


public class GradingStudents {
    public static int[] gradingStudents(int[] grades){
        int[] newGrades = new int[4];
        int nextMultiple = 0;
        for(int i = 0; i < grades.length; i++){
           if(grades[i] < 38){
                newGrades[i] = grades[i];
            }
            if(grades[i] >= 38){
                nextMultiple = grades[i];
                boolean findMultiple = false;
                while(!findMultiple){
                    nextMultiple += 1;
                    if(nextMultiple % 5 == 0){
                        findMultiple = true;
                    }  
                }    
                int difference = nextMultiple - grades[i];
                if(difference < 3 ){
                    newGrades[i] = nextMultiple;
                } else {
                    newGrades[i] = grades[i];
                }
            }
        }
        return newGrades;
    }
}
