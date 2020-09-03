package com.offcn.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class shuzuzhuanjihe {
    public static void main(String[] args) {
        //数组转集合
//        String[] array = new String[]{"zhangsan","lisi","wangwu"};
//        List<String> strings = Arrays.asList(array);
//        for(String s : strings){
//            System.out.println(s);
//        }
        //集合转数组
        List<String> mlist = new ArrayList<>();
        mlist.add("zhu");
        mlist.add("wen");
        mlist.add("tao");
        String[] array = mlist.toArray(new String[0]);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
