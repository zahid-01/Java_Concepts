package dev;

public class Singelton {
    private float water;
    private float milk;

    static private Singelton ourClass = null;

    private Singelton() {
        water = 1;
        milk = 1;
    }

    public static Singelton getInstance() {
        if (ourClass == null)
            ourClass = new Singelton();

        return ourClass;
    }

    public void makeCoffee(){
        System.out.println("Your coffee is being prepared!");
        System.out.println("50% " + milk + " & " + water);
    }

}
