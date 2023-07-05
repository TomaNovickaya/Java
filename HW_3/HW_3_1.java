// 1) Нужно удалить из него чётные числа

package HW_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HW_3_1 {
     public static void main(String[] args) {
        task2();
     }
 
  
    static void task2(){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(2);
        list.add(77);
        list.add(55);
        list.add(22);
        list.add(12);
        list.add(10);
        list.add(20);
        System.out.println(list);

        
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            int o = (int) iterator.next();
             if (o%2!=0) {
        iterator.remove();//удаляем кота с нужным именем
            System.out.println(o); 
            }
        }
         
        
     }
}
