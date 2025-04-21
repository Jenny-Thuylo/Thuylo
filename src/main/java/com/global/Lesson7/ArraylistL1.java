package com.global.Lesson7;
import java.util.ArrayList;

//Viết một chương trình Java để thay thế phần tử thứ hai của ArrayList
//bằng phần tử được chỉ định.
public class ArraylistL1 {
    public static void main(String[]args){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("red car");
        arrayList.add("blue car");
        arrayList.add("white car");
        System.out.println("befor change"+ arrayList);
        arrayList.set(1,"grey car");
        arrayList.remove(0);
        System.out.println("after change"+ arrayList);
    }
}
