package dev.sudo;

class A{}
class B extends A{}
class C extends A{}


public class Main {
    private static <E> void show(E[] elements){
        for(E el: elements)
            System.out.print(el + " ");

        System.out.println("\n");
    }

    static <E> void varargs(E... elements){
        for (E el: elements)
            System.out.println(el);
    }

    static void boundsDemo(ArrList<? extends A> obj){
        obj.getTs();
    }
    public static void main(String[] args) {
        ArrList<B> integerArrList = new ArrList<>();
        ArrList<C> stringArrList = new ArrList<>();

//        integerArrList.setTs(2000);
//        integerArrList.setTs(3000);
//        integerArrList.setTs(4000);
//
//        stringArrList.setTs("Hey");
//        stringArrList.setTs("Hi");
//        stringArrList.setTs("Hello");

//        integerArrList.getTs();

//        show(new String[]{"zahid ", "Hussain ", "Khan "});
//        show(new Integer[]{1,2,3,4});

//        varargs(2,3,4, "Zahid");
//        varargs(new String[]{"Hello ", "World "});

        boundsDemo(integerArrList);
        boundsDemo(stringArrList);
    }
}
