package com.interlink;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by employee on 7/8/16.
 */
public class FindingSequence {
    public static List<Integer> getSubSequence(List<Integer> sequence) {
        List<Integer> subSequence = new ArrayList<>();
        if (sequence == null || sequence.size() == 0) return new ArrayList<>();
        int sum = 0;
        int maxSum = 0;
        int indexStart = 0;
        int indexEnd = 0;
        int maxIndexStart=0;
        int maxIndexEnd=0;
        for (int i = 0; i < sequence.size(); i++) {
            if (sequence.get(i) > 0) {
                sum += sequence.get(i);
            } else {
                if (sum > maxSum) {
                    maxIndexStart = indexStart;
                    maxIndexEnd = i;
                }
                sum = 0;
                indexStart = i + 1;
            }
            if (maxIndexEnd==0)maxIndexEnd=sequence.size();
        }
        subSequence=sequence.subList(maxIndexStart,maxIndexEnd);
        return subSequence;

    }
}
