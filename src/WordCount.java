import java.util.Map;
import java.util.TreeMap;

public class WordCount {

    /**
     * The classic word-count algorithm:
     * given an array of strings,
     * return a Map<String, Integer> with a key for each different string,
     * with the value the number of times that string appears in the array.
     *
     * wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
     * wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
     * wordCount(["c", "c", "c", "c"]) → {"c": 4}
     */

    private static Map<String, Integer> wordCount(String[] strings) {

    Map<String, Integer>map = new TreeMap<>();

    for (int i = 0 ; i < strings.length;) {

        int count =0;

        if (!map.containsKey(strings[i])) {

            count++;
            map.put(strings[i], count);

        } else {
            map.put(strings[i], map.get(strings[i])+1);
        }

        i++;
    }


    return map;

    }

    public static void main(String[] args) {

    String[] strings = {"c", "b", "a", "c", "c", "c"};

        System.out.println(wordCount(strings));
    }

}
