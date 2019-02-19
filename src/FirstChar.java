import java.util.Map;
import java.util.TreeMap;

public class FirstChar {
    /**
     * Given an array of non-empty strings,
     * return a Map<String, String> with a key for every different first character seen,
     * with the value of all the strings starting with that character appended together in the order they appear in the array.
     * firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
     * firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
     * firstChar([]) → {}
     */
    private static Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new TreeMap<>();
           for (int i = 0; i < strings.length;){
               String keys = strings[i].substring(0,1);
               if (!map.containsKey(keys)) {
                   map.put(keys,strings[i]);
               } else {
                   map.put(keys, map.get(keys)+strings[i]);
               }
           i++;
        }
        return map;
    }
    public static void main(String[] args) {

        String [] kelimeler;             //==> declaring an array
        kelimeler = new String[5];       //==> allocating memory to array
        kelimeler[0] = "salt";
        kelimeler[1] = "sea";
        kelimeler[2] = "soda";
        kelimeler[3] = "toast";
        kelimeler[4] = "tea";

        System.out.println(firstChar(kelimeler));
    }

}
