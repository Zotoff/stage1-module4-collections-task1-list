package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> arrList = new ArrayList<>();
        for (int i = 1; i < sourceList.size(); i++) {
            if ((i + 1) % 3 == 0) {
                arrList.add(sourceList.get(i));
                arrList.add(sourceList.get(i));
            }
        }
        return arrList;
    }
}
