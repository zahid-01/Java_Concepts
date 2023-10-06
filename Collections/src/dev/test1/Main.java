package dev.test1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(2,3,4,5,6,76,12));
        arrayList.addAll(List.of(2,3,4,5));

        System.out.println(arrayList);
    }
}
