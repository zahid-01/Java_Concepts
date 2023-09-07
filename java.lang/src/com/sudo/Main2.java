package com.sudo;

public class Main2 {
    public static void main(String[] args) {
        String z = "zahid";

        z += "khan";
        z.concat("hi");
        System.out.println(z);

        StringBuffer s = new StringBuffer("Lorem");
        System.out.println(s.append(" Ipsum"));
        System.out.println(s.charAt(4));

        String str1 = " zahid";
        String str2 = str1;

        System.out.println(str1);
        System.out.println(str2);

        str1 += " Hussain";

        System.out.println(str1);
        System.out.println(str2);

        try {
            System.out.println(Math.decrementExact(Integer.MIN_VALUE));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
