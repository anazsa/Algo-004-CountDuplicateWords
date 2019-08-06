package hbcu.stay.ready.algor;
import java.util.*;

public class Solution {

    public String countUniqueWords(String input) {
        String words = ""; // empty string to enter words in

        HashMap<String, Integer> hashy = new HashMap<String, Integer>();

        // hashmap is with key and value, every key is unique, and you find the value
        //

        String[] stringedInput = input.split("\\W+"); //split the input string at space

        for(String key : stringedInput){
            if(!hashy.containsKey(key)) {
                hashy.put(key, 1);
            }
            else {
                int currentValue = hashy.get(key);
                currentValue++;
                hashy.put(key, currentValue);
            }
        }


        words += String.format("The %d unique words are:\n", hashy.size());
        int size = 0;
        for (String x : hashy.keySet()) {
            size++;
            int value = hashy.get(x);
            if (size < hashy.size()) {
                words += String.format("%s (Seen %d)\n", x, value );
            }
            else {
                words += String.format("%s (Seen %d)", x, value );
            }
        }

        return words;





    }
}
