package Lesson9;

import java.util.HashMap;
import java.util.Map;

public class CountNonDivisible {
    public int[] solution(int[] A) {
        // write your code in Java SE 8
        int N = A.length;
        int n = 0;
        int[] B = new int[2*N+1];
        int[] C = new int[N];
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0 ; i <2*N+1; i++){
            B[i] = 0;    
        }
        for(int i = 0 ; i <N; i++){
            B[A[i]]++;
            map.put(A[i],0);
        }
        //printArray(B);

        
        for(int i = 0 ; i< 2*N+1; i++){
            if(B[i] != 0){
                map.put(i, N+map.get(i)-B[i]); 
                //C[n] = N + C[n] - B[i];
                n += B[i];
                int k = i+i;
                while(k <= N*2+1){
                    if(map.containsKey(k)){
                        map.put(k, map.get(k)-B[i]);    
                    }
                    k+=i;
                }
                //printMap(map);
            }
        }
        for(int i = 0; i<N; i++){
            C[i] = map.get(A[i]);    
        }
        return C;
    }
    
    void printArray(int [] B){
        for(int i = 0; i < B.length; i++){
            System.out.print(B[i]+" ");    
        }
        System.out.println();
    }
    
    void printMap(HashMap<Integer, Integer> map){
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
