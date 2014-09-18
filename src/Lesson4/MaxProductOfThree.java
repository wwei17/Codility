package Lesson4;

import java.util.Arrays;

public class MaxProductOfThree {

    public int solution(int[] A) {
        // write your code in Java SE 8
        
        Arrays.sort(A);
        
        int max = A[0] * A[1] * A[2];
        int max_new;
        
        max_new = A[0] * A[1] * A[A.length-1];
        if(max_new > max){ max = max_new;}
        
        max_new = A[0] * A[A.length-2] * A[A.length-1];
        if(max_new > max){ max = max_new;}
        
        max_new = A[A.length-3] * A[A.length-2] * A[A.length-1];
        if(max_new > max){ max = max_new;}
        
        return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
