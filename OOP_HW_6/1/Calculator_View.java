import java.util.Scanner;

//1. Принцип единственной ответственности. Класс для ввода и вывода

public class Calculator_View {
    private Scanner scanner;
//2. Принцип подстановки Барбары Лисков. Объекты класса могут быть использованы вместо объектов любого из его подклассов, не нарушая работу программы.
    public Calculator_View(){
        scanner = new Scanner(System.in);
    }

    public void DisplayResult(float result){
        System.out.println("Результат: " + result);
    }

    public String getOperation(){
        System.out.println("Введите операцию (+, -, *, /): ");
        return scanner.nextLine();
    }
    public float getOperand(){
        System.out.println("Введите число: ");
        return Float.parseFloat(scanner.nextLine());
    }
}
