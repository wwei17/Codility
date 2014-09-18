package Lesson4;

import java.util.Arrays;

public class Triangle {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int n = A.length;
        if(n < 2){
            return 0;
        }
        int[] B = A.clone();
        Arrays.sort(B);
        
        for(int i = 0; i < n-2; i ++){
            if( (long)B[i] + (long)B[i+1] > B[i+2] &&
                (long)B[i+1] + (long)B[i+2] > B[i] &&
                (long)B[i+2] + (long)B[i] > B[i+1]){
                return 1;
            }
        }
        return 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
