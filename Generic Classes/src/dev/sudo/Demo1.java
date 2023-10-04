package dev.sudo;
@SuppressWarnings("unchecked")
public class Demo1<T> {
    T[] data = (T[]) new Object[10];
    private int length = 0;

    public void append(T v){
        data[length++] = v;
    }

    public void display(){
        for(int i = 0; i<length; i++){
            System.out.println(data[i]);
        }
    }
}
