package Lesson3;

public class CountDiv {

	int solution(int A, int B, int K) {
	    // write your code in C90
	    int a = A%K==0? A/K-1: A/K;
	    return B/K - a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
