package Lesson4;

import java.util.HashMap;

public class Distinct {

    public int solution(int[] A) {
        // write your code in Java SE 8
        HashMap<Integer, Integer> m = new HashMap<Integer,Integer>();
        
        for(int i = 0; i < A.length ; i++){
            if(m.containsKey(A[i])){
                    
            }else{
                m.put(A[i],1);    
            }
        }
        return m.size();
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
