package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> swapped = new HashMap<>();
        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()){
            Integer keyToValue = entry.getKey();
            String valueTpKey = entry.getValue();
            swapped.put(valueTpKey, keyToValue);
        }

        return swapped;
    }

    public static void main(String[] args) {
        KeyValueSwapper keyValueSwapper = new KeyValueSwapper();
        Map<String, Integer> swap = keyValueSwapper.swap(Map.of(1, "Monday",
                2, "Tuesday",
                3, "Wednesday",
                4, "Thursday",
                5, "Friday",
                6, "Saturday",
                7, "Sunday"));
        System.out.println(swap);
    }

}
