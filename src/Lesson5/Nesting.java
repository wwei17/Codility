package Lesson5;

import java.util.Stack;

public class Nesting {
    public int solution(String S) {
        // write your code in Java SE 8
        Stack st = new Stack();
        char c = ' ';
        for(int i = 0; i < S.length(); i ++){
            c = S.charAt(i);
            
            if(c == '('){
                st.push(c);    
            }else if(c == ')'){
                if(st.size()>0 && (char)(st.peek()) == '('){
                    st.pop();    
                }else{
                    return 0;    
                }
            }
        }
        if(st.size() == 0){
            return 1;    
        }else{
            return 0;    
        } 
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
