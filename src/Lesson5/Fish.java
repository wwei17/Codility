package Lesson5;

import java.util.Stack;

public class Fish {

    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        Stack<Integer> q0 = new Stack<Integer>();
        Stack<Integer> q1 = new Stack<Integer>();
        
        for(int i = 0 ; i < A.length ; i++){
            if(B[i] == 0 ){
                while(q1.size() > 0 && q1.peek() < A[i]){
                    q1.pop();    
                }
                if(q1.size() > 0){
                        
                }else{
                    q0.push(A[i]);    
                }
            }else{
                
                q1.push(A[i]);    
                
            }
        }
        
        return q1.size() + q0.size();
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
