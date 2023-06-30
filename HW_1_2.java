// 2) Вывести все простые числа от 1 до 1000
public class HW_1_2 {
      public static void main(String[] args) {

 int n = 1000;
int res=0;
 for (int i=1; i<= n; i++){
    if (i%1 == 0 && i%i == 0){
        res = i;
         System.out.println(res); 
    }

 }
 
 }
}
