package com.hackeearth.codemonk.arraysandstring;

import java.util.*;

public class MonkAndRotation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for(int time=0; time<T; time++){
            int N = s.nextInt();
            int K = s.nextInt();
            int[] res = new int[N];
            int arrEle;
            int index;
            for(int i=0; i<N; i++){
                arrEle = s.nextInt();
                index = (i+K) % N;
                res[index] = arrEle;
            }
            for(int i=0; i<N; i++){
                System.out.print(res[i] + " ");
            }
            System.out.println();
        }
    }
}
