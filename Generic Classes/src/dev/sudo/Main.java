package dev.sudo;

public class Main{
    public static void main(String[] args) {
        Demo<String> t = new Demo<>();

        t.setT("zahid");
        t.getT();

        Demo1<Integer> integerDemo1 = new Demo1<>();
        integerDemo1.append(200);
        integerDemo1.append(300);
        integerDemo1.append(400);
        integerDemo1.append(500);
        integerDemo1.append(600);

//        integerDemo1.display();

        MultiDemo<Integer, Integer> demo = new MultiDemo<>();
        demo.setParams(1200, 1300);

        DemoSub demoSub = new DemoSub();
        demoSub.setT(22);
        demoSub.getT();
    }
}
