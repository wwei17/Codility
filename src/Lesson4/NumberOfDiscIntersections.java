package Lesson4;

import java.util.Arrays;

public class NumberOfDiscIntersections {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int n = A.length;
        if(n<2) return 0;
        
        int[] B = new int[n];
        int[] C = new int[n];

        for(int i = 0; i < n; i++){
            B[i] = i - A[i];
            C[i] = i + A[i];
        }
        Arrays.sort(B);
        Arrays.sort(C);
        long count = 0;
        int j = 0;
        for(int i = 0; i < n; i++){
            while(j < n && C[i] >= B[j]){
                j++;
                count += j-i;
            }
        }
        count -= n;
        
        if(count > 10000000){
            return -1;
        }else{
            return (int)count;    
        }
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
