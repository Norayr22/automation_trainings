package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList <String> obj1 = new ArrayList<String>();
        obj1.add("89898989");
        obj1.add("M");
        obj1.add("Selenum Webdriver");
        obj1.add("12.34");
        obj1.add("M");

        ListIterator <String> iterator = obj1.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

            while (iterator.hasPrevious()) {
                System.out.println(iterator.previous());
            }
                ArrayList < String > celebrities = new ArrayList < String > ();

                celebrities.add("Tom Cruise");
                celebrities.add("Will Smith");
                celebrities.add("Jackie Chan");
                celebrities.add("Akshay Kumar");

                ListIterator < String > listIterator = celebrities.listIterator();

                System.out.println("Forword direction:- ");

                while (listIterator.hasNext()) {
                    System.out.println(listIterator.next());
                }

                System.out.println("Backward direction:- ");

                while (listIterator.hasPrevious()) {
                    System.out.println(listIterator.previous());

                }



            }

            }
/*
        //Add "Hello" on the index 2.
        obj1.add(2, "Hello");

        obj1.set(1,"Vaxo");
        System.out.println(obj1);



        System.out.println(obj1);

        obj1.remove("Hello");
        System.out.println(obj1);
        //Delete index 2
        obj1.remove(2);
        System.out.println(obj1);

        String str = (String) obj1.get(1);

        System.out.println(obj1.contains("Vaxos"));



        System.out.println(obj1.indexOf("Vaxo"));
        Object a = obj1.get(0);

        obj1.clear();
        System.out.println(obj1);



       // System.out.println(obj1.get(0));

//        System.out.println(obj1.get(3));
//
//        int myListSize = obj1.size();
//        for (int i = 0;i <myListSize; i++){
//            System.out.println(obj1.get(i));
//        }



    }*/


