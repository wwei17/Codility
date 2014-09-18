package Lesson6;

public class Dominator {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int curr = 0;
        int size = 0;
        int count = 0;
        for(int i = 0; i < A.length; i++){
            if(size == 0){
                size ++;
                curr = A[i];
            }else{
                if(curr == A[i]){
                    size ++;    
                }else{
                    size --;    
                }
            }
        }
        for(int i = 0; i < A.length; i++){
            if(A[i] == curr){
                count ++;
            }
        }
        if(count > A.length/2){
            for(int i = 0; i < A.length; i++){
                if(A[i] == curr){
                    return i;    
                }
            }
            return -1;
        }else{
            return -1;    
        }
        
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
