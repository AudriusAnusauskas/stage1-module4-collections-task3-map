package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> wordMap = new HashMap<>();
        String cleanedSentence = sentence.replaceAll("[.,]", "");
        String[] elements = cleanedSentence.toLowerCase().split("\\s+");

        for (String e : elements) {
            if (sentence == "") {
                wordMap.clear();
            } else {
                wordMap.put(e, wordMap.getOrDefault(e, 0) + 1);
            }
        }


        return wordMap;
    }

    public static void main(String[] args) {
        WordRepetitionMapCreator wrmc = new WordRepetitionMapCreator();
        Map<String, Integer> result = wrmc.createWordRepetitionMap("");
        for (Map.Entry<String, Integer> entry : result.entrySet()) {

            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
