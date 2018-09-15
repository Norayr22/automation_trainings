package Overriding;

public class Demo2 extends Demo1  {


        void print(){
        int myArry2D [][] = new int[2][4];

            myArry2D [0] [0] = 40;
            myArry2D [0] [1] = 41;
            myArry2D [0] [2] = 42;
            myArry2D [0] [3] = 43;
            myArry2D [1] [0] = 44;
            myArry2D [1] [1] = 45;
            myArry2D [1] [2] = 46;
            myArry2D [1] [3] = 47;

            System.out.println(myArry2D[1] [3]);

        }






    //    public boolean arry(){
//        int [] a = {1,3,3,6,7};
//
//        for (int i = 0;i< a.length-1  ; i++){
//            if (a[i] > a [i+1] ) {
//
//                return false;
//            }
//        }
//
//            return true;
//
//    }
//
//    public void arry1() {
//        int[] a = {1, 3, 4, 5, 6, 7};
//        int b = a.length / 2;
//        int y = 0;
//
//        for (int i = 1; i < a.length / 2; i++) {
//            y = a[i - 1] + a[i];
//
//
//        }
//
//    }

}
