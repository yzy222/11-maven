package com.map;


import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        //jdk8之后，如果单向链表中元素超过8个，单向链表会变成红黑树数据，当红黑树节点数小于6时会变成单向链表
        //初始化容量16，0.75增长；key可以为null
        //clear() 清空map集合
        //size() 获取键值对数量
        //isEmpty() 判断map集合中元素是否为空
        //boolean containsKey(Object key) 判断map集合中是否包含某个key
        //boolean containsValue(Object value) 判断map集合中是否包含某个value 底层调用equals方法
        //V get(Object key) 通过key获取value
        //V put(K key, V value) 向map集合中添加键值对
        //V remove(Object key) 通过key删除键值对
        //Set<K> keySet() 获取map集合中所有的key 返回set集合
        //Collection<V> values() 获取map中所有value 返回Collection
        //Set<Map.Entry<K,V>> entrySet() map集合转换为set集合
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"一");
        map.put(2,"二");
        map.put(3,"三");
        map.put(4,"四");
        map.put(5,"五");
        //V get(Object key) 通过key获取value
        System.out.println(map.get(2));
        //size() 获取键值对数量
        System.out.println("键值对数量为"+map.size());
        //V remove(Object key) 通过key删除键值对
        map.remove(2);
        System.out.println("键值对数量:"+map.size());
        //boolean containsKey(Object key) 判断map集合中是否包含某个key
        System.out.println(map.containsKey(2));
        //Collection<V> values() 获取map中所有value 返回Collection
        Collection<String> c = map.values();
        for (String s:
            c){
            System.out.println(s);
        }
        //Set<K> keySet() 获取map集合中所有的key 返回set集合
        Set<Integer> set=map.keySet();
        for (Integer i:
             set) {
            System.out.println(i+map.get(i));
        }
        Iterator<Integer> iterator=set.iterator();
        while(iterator.hasNext()) System.out.println(map.get(iterator.next()));
        //boolean containsValue(Object value) 判断map集合中是否包含某个value
        System.out.println(map.containsValue("三"));
        //clear() 清空map集合
        //map.clear();
        //isEmpty() 判断map集合中元素是否为空
        System.out.println(map.isEmpty());
        System.out.println("-------------------------------------------------");
        //Set<Map.Entry<K,V>> entrySet() map集合转换为set集合
        Set<Map.Entry<Integer,String>> set1=map.entrySet();
        /*Iterator<Map.Entry<Integer,String>> it=set1.iterator();
        while(it.hasNext()) {//System.out.println(it.next().getKey()+"="+it.next().getValue());
            Map.Entry<Integer,String> entry=it.next();
            System.out.println(entry.getKey()+"="+entry.getValue());
        }*/
        for (Map.Entry<Integer,String> entry:
             set1) {
            System.out.println(entry.getKey()+entry.getValue());
        }
    }
}
