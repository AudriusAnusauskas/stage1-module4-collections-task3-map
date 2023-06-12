package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        for(Map.Entry<Integer, Integer> entry : functionMap.entrySet()){
            if(entry.getValue() == requiredValue){
                return true;
            }
        }
        return false;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> intMap = new HashMap<>();

        Integer keys;
        Integer values;
        for(Integer e : sourceList){
            keys = e;
            values = 5*e + 2;
            intMap.put(keys, values);
        }
        return intMap;
    }
}
