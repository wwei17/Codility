package Lesson5;

import java.util.Stack;

public class StoneWall {

    public int solution(int[] H) {
        // write your code in Java SE 8
        Stack st = new Stack();
        int count = 0;
        
        for(int i = 0; i < H.length; i++){
            while(st.size() > 0 && (int)(st.peek()) > H[i]){
                st.pop();    
            }
            if(st.size() > 0 && (int)(st.peek()) == H[i]){
                
            }else{
                count ++;
                st.push(H[i]);
            }
        }
        
        return count;
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
