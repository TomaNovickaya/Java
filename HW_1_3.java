// 3) Реализовать простой калькулятор
import java.util.Scanner;
public class HW_1_3 {
   public static void main(String[] args) {
      double x;
      double y;
      double ans;
      char op;
      try (Scanner reader = new Scanner(System.in)) {
        System.out.print("Введите первое число: ");
          x = reader.nextDouble();
          System.out.print("Введите второе число: ");
          y = reader.nextDouble();
          System.out.print("\n Выберите действие: (+, -, *, /): ");
          op = reader.next().charAt(0);
    }
      switch(op) {
         case '+': ans = x + y;
            break;
         case '-': ans = x - y;
            break;
         case '*': ans = x * y;
            break;
         case '/': ans = x / y;
            break;
         default:  System.out.printf("Ошибка");
            return;
      }
      System.out.print("\n Результат:\n");
      System.out.printf(x + " " + op + " " + y + " = " + ans);
   }
}

    
 
 
    

