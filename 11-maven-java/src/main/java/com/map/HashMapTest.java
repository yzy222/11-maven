package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(34,"三十四");
        map.put(12,"十二");
        map.put(56,"五六");
        map.put(56,"五十六");
        map.put(78,"七十八");
        map.put(90,"九十");
        Set<Map.Entry<Integer,String>> set=map.entrySet();
        for (Map.Entry<Integer,String> entry :set){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
