package Lesson3;

public class MinAvgTwoSlice {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int min = 0;
        int min_i = 0;
        double min_2;
        double min_3;
        double min_total = 1000000;
        for(int i = 0 ;i < A.length-2; i++){
            min_2 = (A[i] + A[i+1])/2.0;   
            if(min_2 < min_total){ min_total = min_2; min_i = i;}
            min_3 = (A[i] + A[i+1] +A[i+2])/3.0;
            if(min_3 < min_total){ min_total = min_3; min_i = i;}  
        }
            
        return min_i;    
        
        
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
