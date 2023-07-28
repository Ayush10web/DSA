import java.util.*;

public class hashmap {

    public static void main(String[] args) {
        
        HashMap<String,Integer> map = new HashMap<>();
        map.put("India",120);
        map.put("China",150);
        map.put("US",60);

        System.out.println(map.get("China"));
    }
}
