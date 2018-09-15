package Overriding;

public class Demo1 {

     void print(){
       int myArry [] = new int[5];
         myArry[0] = 2;
         myArry[1] = 2;
         myArry[2] = 3;
         myArry[3] = 3;
         myArry[4] = 3;

         int leftSize = myArry.length/2;

         int rightSize = myArry.length-leftSize;

            int count = 0;
         for (int i = 0;i < leftSize; i++){
                count = count + myArry[i];

         }
         System.out.println("Value" +count);
         count = count/leftSize;
         System.out.println(count);

         int count1 = 0;
         for (int i = leftSize; i < myArry.length; i++) {

            count1 = count1 + myArry[i];
         }
         System.out.println("Value1" +count1);
         count1 = count1/rightSize;
         System.out.println(count1);
         if (count > count1){

             System.out.println(count);
         }else {

             System.out.println(count1);
         }


     }
   }


