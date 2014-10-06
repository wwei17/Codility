package Lesson7;

public class MaxDoubleSliceSum {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int [] left = new int[A.length];
        int [] right = new int[A.length];
        for(int i = 1 ; i < A.length; i++){
        	left[i] = Math.max(left[i-1]+A[i], 0);
        }
        for(int i = A.length-2 ; i >= 0; i--){
        	right[i] = Math.max(right[i+1]+A[i], 0);
        }
        int max = 0;
        for(int i = 1 ; i < A.length-1; i++){
        	max = Math.max(max, left[i-1]+right[i+1]);
        }
        return max;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxDoubleSliceSum a = new MaxDoubleSliceSum();
		int[] A = {-1855,-7846,8024,-9237,724,-3356};
		System.out.println(a.solution(A));
	}

}
