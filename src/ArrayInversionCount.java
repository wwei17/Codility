
public class ArrayInversionCount {
	
	int[] B;
	
    public int solution(int[] A) {
        // write your code in Java SE 8
    	if(A == null || A.length < 2){
    		return 0;
    	}else{
    		B = new int[A.length];
    		printArray(A,0, A.length-1);
    		return solution(A.clone(), 0, A.length-1);
    		
    	}
    }
    
    public int solution(int[] A, int start, int end){
    	printArray(A,start, end);
    	if(end - start == 0){
    		return 0;
    	}else if(end - start == 1){
    		if(A[start] > A[end]){
    			int temp = A[end];
    			A[end] = A[start];
    			A[start] = temp;
    			return 1;
    		}else{
    			return 0;
    		}
    	}else{
    		int m = (start+end)/2;
    		int n1 = solution(A,start, m);
    		int n2 = solution(A,m+1,end);
    		printArray(A,start, end);
    		int nk = merge(A,start,end, m);
    		printArray(A,start, end);
    		System.out.println("n1="+n1+",n2="+n2+",nk="+nk);
    		return n1+n2+nk;
    	}
    }
    
    public int merge(int[] A, int start, int end, int m){
    	int k = 0;
    	int i1 = start, i2 = m+1, i = 0;
    	while(i1 <= m && i2 <= end){
    		if(A[i1] <= A[i2]){
    			B[start+i] = A[i1];
    			i1++;
    		}else{
    			B[start+i] = A[i2];
    			k += m-i1+1;
    			i2++;
    		}
    		i++;
    	}
    	while(i1 <= m){
			B[start+i] = A[i1];
			i1++;
    		i++;
    	}
    	while(i2 <= end){
			B[start+i] = A[i2];
			i2++;
    		i++;
    	}
    	for(i = start; i <= end; i++){
    		A[i] = B[i];
    	}
    	return k;
    }
    
    public static void main(String[] args){
    	System.out.println("Helloworld!");
    	
    	ArrayInversionCount a = new ArrayInversionCount();
    	int A[] = {-1,6,3,4,7,4};
    	int k = a.solution(A);
    	System.out.println(k);
    	
    }
    
    public void printArray(int[] A, int start, int end){
    	for(int i =start;i<=end;i++){
    		System.out.print(A[i] + " ");
    	}
    	System.out.println();
    }
    
}
