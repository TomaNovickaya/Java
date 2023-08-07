//Задача 2 : Напишите обобщенный метод printArray, который принимает массив любого типа и выводит его элементы на консоль.
//В этом примере мы объявляем обобщенный метод printArray, который принимает массив типа T. Затем мы используем цикл for-each, чтобы пройти по всем элементам массива и вывести их на консоль.
//В методе main мы создаем массивы типов Integer и String и вызываем printArray для каждого из них. В результате мы получаем вывод на консоль элементов каждого массива.
//Таким образом, обобщенные методы позволяют нам создавать код, который может работать с разными типами данных, обеспечивая повторное использование и гибкость.

public class Main
{
   public static void main(String[] args) {
        Integer[] iArray = {1,3,21,3};
        Double[] dArray = {1.3, 2.3, 23.3, 1.9};
        String[] strArray = {"a", "b", "c"};
        printArray(iArray);
        printArray(dArray);
        printArray(strArray);
        
    }
    public static <T> void printArray(T[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
