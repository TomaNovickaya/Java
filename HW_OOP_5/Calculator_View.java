import java.util.Scanner;

public class Calculator_View {
    private Scanner scanner;

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
