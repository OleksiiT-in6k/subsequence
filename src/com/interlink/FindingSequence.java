package com.interlink;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by employee on 7/8/16.
 */
public class FindingSequence {
    public static List<Integer> getSubSequence(List<Integer> sequence) {
        List<Integer> subSequence;
        if (sequence == null || sequence.size() == 0) return new ArrayList<>();
        int sum = 0;
        int maxSum = 0;
        int maxStart = 0;
        int maxEnd = 0;
        if(checkForAllPositive(sequence))return sequence;

        for (int i = 0; i < sequence.size() - 1; i++) {
            for (int j = i + 1; j < sequence.size(); j++) {
                sum = countSumForDiapason(i,j,sequence);
                if (sum>maxSum){maxSum=sum;
                maxStart=i;
                maxEnd=j;
                }
            }
        }
        subSequence = sequence.subList(maxStart, maxEnd+1);
        return subSequence;
    }
    
    private static int countSumForDiapason(int start, int finish, List<Integer> list) {
        int sum = 0;
        for (int i = start; i <=finish; i++) {
            sum += list.get(i);
        }
        return sum;

    }

    private static boolean checkForAllPositive(List<Integer>list){
        for(Integer number:list){
            if(number<0)return false;
        }
        return true;

    }

}
