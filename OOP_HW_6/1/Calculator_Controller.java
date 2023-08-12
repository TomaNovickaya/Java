
//1. Принцип единственной ответственности. Класс для реализации выбора оператора
public class Calculator_Controller implements InterCalculator{
    private Calculator_View view;
    private Calculator_Model model;

    public Calculator_Controller(Calculator_Model model, Calculator_View view) {
        this.model = model;
        this.view = view;
    }

    public void PerformOperation(String operation, float num1, float num2) {
        switch (operation) {
            case "+":
                model.add(num1, num2);
                break;
            case "-":
                model.subtract(num1, num2);
                break;
            case "*":
                model.multiply(num1, num2);
                break;
            case "/":
                model.divide(num1, num2);
                break;
            default:
                System.out.println("Некорректная операция!");

        }

        view.DisplayResult(model.getResult());

    }

    @Override
    //2. Принцип открытости/закрытости
    public void addoperation(String operation) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addoperation'");
    }
}

class addOperation implements InterCalculator{
    
}
