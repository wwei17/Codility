package Lesson3;

public class GenomicRangeQuery {
	public int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
        int[][] B = new int[4][S.length()];
        int j=0;
        for(int i = 0; i < S.length(); i++){
            char c = S.charAt(i);
            if(c == 'A'){
                j = 0;    
            }else if(c == 'C'){
                j = 1;
            }else if(c == 'G'){
                j = 2;
            }else if(c == 'T'){
                j = 3;    
            }
            if(i > 0){
                B[0][i] = B[0][i-1];
                B[1][i] = B[1][i-1];
                B[2][i] = B[2][i-1];
                B[3][i] = B[3][i-1];
            }
            B[j][i] += 1;
        }
        int[] result = new int[P.length];
        for(int i = 0 ; i < P.length; i++){
            if(P[i] > 0){
                if(B[0][Q[i]] - B[0][P[i]-1] > 0){
                    result[i] = 1;
                }else if(B[1][Q[i]] - B[1][P[i]-1] > 0){
                    result[i] = 2;
                }else if(B[2][Q[i]] - B[2][P[i]-1] > 0){
                    result[i] = 3;
                }else if(B[3][Q[i]] - B[3][P[i]-1] > 0){
                    result[i] = 4;
                }
            }else{
                if(B[0][Q[i]]> 0){
                    result[i] = 1;
                }else if(B[1][Q[i]]> 0){
                    result[i] = 2;
                }else if(B[2][Q[i]] > 0){
                    result[i] = 3;
                }else if(B[3][Q[i]]> 0){
                    result[i] = 4;
                }
            }
        }
        return result;

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
