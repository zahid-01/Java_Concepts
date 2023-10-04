package dev.sudo;

public class ArrList<T> {
    private T[] ts = (T[]) new Object[3];
    private int length;

    public void setTs(T t) {
        if (length > 2)
            return;

        ts[length++] = t;
    }

    public void getTs() {
        for (int i = 0; i < length; i++)
            System.out.println(ts[i]);
    }
}
