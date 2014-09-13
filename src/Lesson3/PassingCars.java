package Lesson3;

public class PassingCars {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int one = 0;
        int zero = 0;
        long total = 0;
        for(int i = 0; i < A.length ; i++){
            if(A[i] == 0){
                zero++;
            }else{
                one++;
                total += zero;
            }    
        }
        if(total <= 1000000000){
            return (int)total;
        }else{
            return -1;    
        }
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
