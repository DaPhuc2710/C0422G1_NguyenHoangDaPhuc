package tester.test_collection;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String,Integer>capitals= new HashMap<>();
        capitals.put("England",5);
        capitals.put("Germany",8);
        capitals.put("Vietnam",2);
        capitals.put("China",400);
        System.out.println(capitals);
        System.out.println(capitals.size());
        for ( String i:capitals.keySet()) {
            System.out.println("quốc gia là :"+i);
            System.out.println("Đô thị là"+capitals.get(i));
        }
        for ( Integer t:capitals.values()) {
            System.out.println( " thành phố là :"+t);
        }

        System.out.println(capitals.get("Vietnam")); // dùng để lấy value bằn key (sử dụng get)
        System.out.println(capitals.remove("China"));
        System.out.println(capitals);
        capitals.clear();
        System.out.println(capitals);

    }
}
