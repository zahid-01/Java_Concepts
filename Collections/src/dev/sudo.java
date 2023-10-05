package dev;

import java.util.Collection;
import java.util.LinkedList;

public class sudo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(4);
        list.add(2);
        list.add(3);

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(4000);
        list1.add(2000);
        list1.add(3000);

        System.out.println(list);

        list.addAll(list1);
        System.out.println(list);
    }
}
