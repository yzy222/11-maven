package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ToolTest {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        //变线程安全
        Collections.synchronizedList(list);
        //排序 集合中元素实现comparable接口
        Collections.sort(list);
        //
    }
}
