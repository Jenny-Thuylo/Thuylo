package com.global.Lesson7;
import java.util.ArrayList;
import java.util.Collections;

//Viết một chương trình lưu trữ các số nguyên từ 1 đến 64 trong một
//mảng và in chúng theo thứ tự ngược lại.
public class ArraylistL2 {
    public static void main(String[]args){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 1; i <= 64; i++){
            arrayList.add(i);
//            arrayList.toArray();
//            arrayList.clear();

        }
        System.out.println(arrayList);

        Collections.sort(arrayList, Collections.reverseOrder());
        System.out.println("sort" + arrayList);

        arrayList.removeAll(arrayList);
        System.out.println("after removed all"+ arrayList);

    }
}
