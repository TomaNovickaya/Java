package HW_2;

import Task2.IConst;




public class Main implements IConst {
    public static void main(String[] args) {
        Cat person = new Cat("Мяу!", "Тамара", 27); 
        Owner people = new Owner("Людмила");
        System.out.println(person.getGreet() + "Меня зовут " + person.getName() + ". Мне " + person.getAge() + "года (лет)." + " Мой владелец " + people.getName()); // Получение имени с помощью публичного метода getName()
   
        test2 t2 = new test2();
        for (int i = 0; i <= 1; i++) {
            System.out.println("Следующее значение " + t2.getNext());
        }
        System.out.println("Сброс ");
        t2.reset();
        System.out.println("Начальное значение " + person.getAge());
        t2.setNum(27);
        for (int i = 0; i <=1; i++){
            System.out.println("Следующее значение " + t2.getNext());
        }

        for (int i=MIN; i<= 1; i++){
            if(i<=MAX){
            System.out.println("Средний возраст кота");
            }
            else if(i>MAX){
                System.out.println("Кошка-долгожитель");
            }
            else
            System.out.println(ERROR);
        }
        MyClass mc = new MyClass();
        mc.met1();
        mc.met2();
        mc.met3();

         class_2 t4 = new class_2();
        t4.getOwner();
        System.out.println("Владелец: " + t4.getOwner());
        System.out.println("Кот: " + t4.getCat());
      
       
           
        

     }
}
class Cat {
    private String name; // Приватное поле name
    private int age; // Приватное поле age
    private String greet;

    public Cat(String greet, String name, int age) {
        this.name = name;
        this.greet = greet;
        this.age = age;
    }
    public String getGreet() { // Публичный метод getName() для доступа к приватному полю name
        return greet;
    }
    public String getName() { // Публичный метод getName() для доступа к приватному полю name
        return name;
    }
    public int getAge() { // Публичный метод getName() для доступа к приватному полю name
        return age;
    }
     
}
class Owner {
    private String nam;

  public Owner(String nam) {
        this.nam = nam;
  }
  public String getName() { // Публичный метод getName() для доступа к приватному полю name
        return nam;
    }
}
