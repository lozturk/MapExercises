import java.util.*;

public class MapCharacterFrequency {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a sentence");
        //I am learning how to test web application
        String sentence = scan.nextLine().toLowerCase();

        Map<Character,Integer> map = new HashMap<>();

        for (int i = 0 ; i < sentence.length() ; i++) {
            char c = sentence.charAt(i);

            if (!map.containsKey(c)) {
                map.put(c,1);
            } else {
                map.put(c,map.get(c)+1);
            }
        }
            //write the map
//        System.out.println(map);
            //write all the keys in the map
//        System.out.println(map.keySet());
            //write all the values in the map
//        System.out.println(map.values());
            //We store all the keys in a Set
//        Set<Character> keys = map.keySet();
//        System.out.println(keys);
            //We store all the values in a collection
//        Collection<Integer> keys = map.values();
//        System.out.println(keys);

//        Set<Map.Entry<Character,Integer>> entries = map.entrySet();
//        System.out.println(entries);
        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println("Character: "+ entry.getKey()+" ==> "+entry.getValue()+" times");
        }



    }


}




