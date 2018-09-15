package List;

import java.util.ArrayList;



public class ExamDemo {

    public static void main(String[] args) {


        ArrayList obj1 = new ArrayList();

        obj1.add("Object1");
        obj1.add("Object4");
        obj1.add("Object3");
        obj1.add("Object4");
        obj1.add("Object5");
        ArrayList obj1_1 = obj1;


        ArrayList obj2 = new ArrayList();
        obj2.add("Object1");
        obj2.add("Object4");
        obj2.add("Object1");
        obj2.add("Object6");
        obj2.add("Object1");
        int size = obj1.size();
        System.out.println(obj1.removeAll(obj2));
        System.out.println(obj2.removeAll(obj1_1));
        System.out.println(obj1);
        System.out.println(obj2);

//        for (int i = 0; i < size;i++){
////            if (obj1.get(i) == obj2.get(i)){
////                continue;
////            }else {
////                System.out.print(obj1.get(i) + " ");
////                System.out.println(obj2.get(i));
////
////            }
////
////
////
////        }




//        System.out.println(obj1.equals(obj2));
//

//       String str1 = (String) obj1.get(3);
//       String str2 = (String) obj1.get(2);
//       obj1.set(2,str1);
//       obj1.set(3,str2);
//        System.out.println(obj1);
//
//
//
//        Collections.shuffle(obj1);
//        System.out.println(obj1);


    }
}
