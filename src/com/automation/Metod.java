package com.automation;

public class Metod {

    public void Add(int a, int b) {

        int c = a + b;
        System.out.println("Value is " + c);
    }

    protected void divide(int a ,int b) {

        int c = a / b;

        System.out.println(c);
    }

    public void loop(int a) {

        for (int i = 0; i < a; i++){

            System.out.println(i);
        }


    }

    public String sum(String a, int b) {

        String str1 = a + b;

        return str1;


    }
    public int Valod(int a,String b){

        System.out.println(b);
        return a;
    }

    public String Valod(String e, String c){

        return c;

    }


    public void myStr(String a){

        System.out.println(a.substring(0,3));

    }
}
