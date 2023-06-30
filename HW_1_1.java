// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)


public class HW_1_1 {
    
  public static void main(String[] args) {
 int sum = 0;
 int n = 5;
 int fact = 1;
 for (int i=1; i<= n; i++){
    sum = sum + i;
    fact = fact * i;

 }
 System.out.println(sum); 
System.out.println(fact);
 
 }

}