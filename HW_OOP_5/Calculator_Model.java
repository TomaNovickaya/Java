public class Calculator_Model {
    private float result;

    public void add(float num1, float num2) {
        result = num1 + num2;
    }

    public void subtract(float num1, float num2) {
        result = num1 - num2;
    }

    public void divide(float num1, float num2)  {
        if (num2 != 0) {
            result = num1 / num2;
        } else {
            try {
                throw new IllegalAccessException("На ноль делить нельзя!");
            } catch (IllegalAccessException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public void multiply(float num1, float num2) {
        result = num1 * num2;
    }

    public float getResult(){
        return result;
    }
}
