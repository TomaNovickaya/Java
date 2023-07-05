// 3) Найти минимальное значение
// 4) Найти среднее значение
package HW_3;



public class HW_3_3 {
    public static void main(String[] args) {

        int n = 100;
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }

        
        double min = array[0];
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
           
            if(min > array[i])
                min = array[i];
            avg += array[i]/array.length;
        }

        
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
    }  
}
