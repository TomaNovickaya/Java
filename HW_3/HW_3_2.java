// 2) Найти минимальное значение
package HW_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HW_3_2 {
     public static void main(String[] args) {
        task2();
     }
 
  
    static void task2(){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(182);
        list.add(77);
        list.add(55);
        list.add(22);
        list.add(12);
        list.add(10);
        list.add(120);
        System.out.println(list);

        int max=0;
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            int o = (int) iterator.next();
             if (o>max) {
                max=o;
       
            System.out.println(max); 
            }
        }
         
        
     }
}
