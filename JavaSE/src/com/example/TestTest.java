package com.example;

import com.example.model.MyMap;
import com.example.model.Student;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestTest {

    @Test
    public void test_1() {
        Student s1 = new Student("张三", 20);
        Student s2 = new Student("张三", 20);
        System.out.println(s1.hashCode() == s2.hashCode());
        System.out.println(s1.equals(s2));

        List<Student> list = new ArrayList<>();
        list.add(s1);
        System.out.println(list.contains(s2));

        Map<Student, String> map = new HashMap<>();
        map.put(s1, "QQQQ");
        map.put(s2, "QQQQ");
        System.out.println(map.size());
    }

    @Test
    public void test_2() {
        MyMap<String, String> myMap = new MyMap<>();
        MyMap<String, Student> myMap2 = new MyMap<>();
        myMap.put("A", "AAAA");
        myMap.put("B", "BBBB");
        myMap2.put("S", new Student("张三", 20));
        System.out.println(myMap.getSize());
        System.out.println(myMap.get("A"));
        System.out.println(myMap2.get("S").getName());
        System.out.println(0 % 1000);
        System.out.println(1 % 1000);
        System.out.println(2 % 1000);
    }

    @Test
    public void test_3() {
        String taxRate = "0.07";
        Double taxRateDouble = Double.parseDouble(taxRate);
        System.out.println(taxRateDouble > 0.06);
    }

}
