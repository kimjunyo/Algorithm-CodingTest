package com.example.codingtest.study.datastructure.slidingwindow;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);Set set = new HashSet(list);
        set.size();
        list.remove(0);
        list.add(2);

        System.out.println(list);
    }
}
