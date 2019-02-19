import java.util.Map;
import java.util.TreeMap;

public class Pairs {
    /**
     * Given an array of non-empty strings,
     * create and return a Map<String, String> as follows:
     * for each string add its first character as a key with its last character as the value.
     * pairs(["code", "bug"]) → {"b": "g", "c": "e"}
     * pairs(["man", "moon", "main"]) → {"m": "n"}
     * pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
     */

    public static Map<String, String> pairs(String[] strings) {

    Map<String, String> map = new TreeMap<>();

        for (int i = 0; i<strings.length; ) {

        String firstChar = strings[i].substring(0,1);
        String lastChar = strings[i].substring(strings[i].length()-1);

        map.put(firstChar,lastChar);

        i++;

        }

    return map;
    }

    public static void main(String[] args) {

        String [] strings = {"man", "moon", "good", "night"};

        System.out.println(pairs(strings));


    }

}
