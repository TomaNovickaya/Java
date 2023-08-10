public class Calculator_Main {
    public static void main(String[] args) {
        Calculator_Model model = new Calculator_Model();
        Calculator_View view = new Calculator_View();
        Calculator_Controller controller = new Calculator_Controller(model, view);
        String operation = view.getOperation();
        float num1 = view.getOperand();
        float num2 = view.getOperand();
        controller.PerformOperation(operation, num1, num2);
    }
}

//MVC
