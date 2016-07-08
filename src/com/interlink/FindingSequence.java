package com.interlink;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by employee on 7/8/16.
 */
public class FindingSequence {
    public static List<Integer> getSubSequence(List<Integer> sequence) {
        List<Integer>subSequence=new ArrayList<>();
        if(sequence==null||sequence.size()==0)return new ArrayList<>();
        subSequence.add(sequence.get(0));
        return subSequence;

    }
}
