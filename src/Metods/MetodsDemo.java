package Metods;

import java.util.Random;

public class MetodsDemo {

    public void Met_loop() {

        for (int i = 3; i < 10; i++) {
            System.out.println(i);
        }
    }

    public void Met_loopIf() {

        for (int i = 10; i <= 40; i++) {
            if (i == 15 || i == 25) {
                continue;
            }
            System.out.println(i);
        }
    }

    public void Met_while() {

        int a = 1;
        while (a <= 10) {
            System.out.println(a);
            a++;
        }

    }

    public void Met_while1() {

        int b = 1;
        while (b < 1) {
            System.out.println("Duxov");
        }
        System.out.println(b);
    }

    public void Met_Endless() {
        for (; ; ) {

            System.out.println("1");

        }
    }

    public void Met_Do_While() {

        int i = 1;
        do {
            System.out.println(i);
            i++;
        }
        while (i == 0);
    }

    public void Met_Do_While1() {

        int i = 1;
        do {
            System.out.println(i);
            i++;
        }
        while (i == 0);


    }

    public void Met_For_Fakt() {

        int t = 1;
        for (int i = 1; i <= 10; i++) {

            int a = t * i;
            t = a;
        }
        System.out.println(t);
    }

    public void Met_For_50() {

        for (int i = 0; i >= -50; i = i - 5) {
            System.out.println(i);
        }
    }

    public void Met_Bool() {
        boolean find = false;
        String a = "Hello World";
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'q') {
                find = true;
                break;
            }

        }
    }

    public boolean Met_booll(int a, int b) {
        //boolean booll = false;
        if (a < b) {
            return true;

        }
        return false;
    }

    public void Met_pol(int a) {

        int c = a + 2;

        System.out.println(c);

    }

    public void Met_pol(int a, int b) {

        int c = a + b;
        System.out.println(c);

    }

    public void Met_pol(int a, int b, double c) {

        double d = a + b * c;

        System.out.println(d);
    }

    public boolean search(String str) {
        int a = str.indexOf('x');
        if(a != str.length() - 1 && str.charAt(a + 1) == 'x') {
            return true;

        }
            return false;

//        for (int i = 0; i < str.length() - 1; i++) {
//            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
//                return true;
//            }
//
//        }
//        return false;
    }

    public void strMix(String str){
        for(int i = 0;i < str.length(); i = i + 2) {

            System.out.print(str.charAt(i));


        }

    }
}