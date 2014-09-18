package Lesson5;

import java.util.Stack;

public class Brackets {

    public int solution(String S) {
        // write your code in Java SE 8
        if(S.length() == 0) return 1;
        
        char c = S.charAt(0);
        Stack stack = new Stack();
        stack.push(c);
        for(int i = 1; i < S.length(); i++){
            c = S.charAt(i);
            switch(S.charAt(i)){
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    break;   
                case ')':
                    if(stack.size()>0 && (char)stack.peek() == '('){
                        stack.pop();
                    }else{
                        return 0;
                    }
                    break;    
                case ']':
                    if(stack.size()>0 && (char)stack.peek() =='['){
                        stack.pop();
                    }else{
                        return 0;
                    }
                    break;    
                case '}':
                    if(stack.size()>0 && (char)stack.peek() == '{'){
                        stack.pop();
                    }else{
                        return 0;
                    }
                    break;    
            }
            
        }
        if(stack.size() == 0)
            return 1;
        else
            return 0;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Brackets b = new Brackets();
		
		System.out.println(b.solution("{[()()]}"));
	}

}
