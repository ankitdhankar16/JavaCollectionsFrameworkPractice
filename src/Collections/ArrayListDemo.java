package Collections;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void run() {
        ArrayList<Integer> list = new ArrayList<>(10);     //with initial capacity
//        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(12);
        list.add(13);
        list.add(89);


        System.out.println(list.size());
//
//        System.out.println(list.get(2));
//        System.out.println(list.size());
//
//        for (int i=0; i<list.size() ;i++){
//            System.out.println(list.get(i));
//        }
//
//        for(int x : list){
//            System.out.println(x);
//        }
//
//        System.out.println(list.contains(10));
//        System.out.println(list.contains(4556));
//        list.remove(2);
//        list.add(2,15);
//        list.set(2,256);
    }
}
