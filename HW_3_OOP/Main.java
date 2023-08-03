package HW_3;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


import Task2.IConst;




public class Main implements IConst {
    
    public static void main(String[] args) {
        Cat person = new Cat("Тамара", 27, "Hi"); 
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
        //MyClass mc = new MyClass();
        person.met1();
        person.met2();
        person.met3();

         class_2 t4 = new class_2();
        t4.getOwner();
        System.out.println("Владелец: " + t4.getOwner());
        System.out.println("Кот: " + t4.getCat());

        MyInter inter = (x) -> 50 - x;
        MyInter inter2 = (y) -> y - 27;
        System.out.println("Юбилей через " + inter.getMyInter(27) + " года (лет)");
        System.out.println("До долголетия " + inter2.getMyInter(100) + " года (лет)");
      

    class Animal {
    private String name;
    private int age;
    private int weight;
    private String color;

    public Animal(String name, int age, int weight, String color){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color =color;
    }
    public int getAge(){
        return age;
    }
    public int getWeight(){
        return weight;
    }
    @Override
    public String toString(){
        return "Animal{" +
                "name'" + name + '\'' + 
                ", age=" + age + 
                ", weight=" + weight +
                ", color=" + color +
                '}';
    }
}
       List<Animal> cats = new ArrayList<>();
        cats.add(new Animal("Ева", 3, 5,"белый"));
        cats.add(new Animal("Ева", 3, 5,"белый"));
        cats.add(new Animal("Зефирка", 10, 7,"пепельный"));
        cats.add(new Animal("Барсик", 7, 3,"черный"));

        //Создаем компаратор для сравнения по возрасту
        Comparator<Animal> ageAndColorComparator = new Comparator<Animal>() {
            @Override 
            public int compare(Animal cat1, Animal cat2) {
                //Сортируем по возрасту
                int ageCompare = cat1.getAge() - cat2.getAge();
                if(ageCompare != 0) {
                    return ageCompare;
                }
               return cat1.getWeight() - cat2.getWeight();
            } 
           };
        //Сортируем список животных с помощью компаратора
        cats.sort(ageAndColorComparator);

        //Выводим остортированный список
        for (Animal cat : cats){
            System.out.println(cat);

        }
           
        

     }
}
class Cat implements Method2{
    private String name; // Приватное поле name
    private int age; // Приватное поле age
    
    private String greet;

    public Cat( String name, int age,   String greet) {
        this.name = name;
      
        this.age = age;
        
        this.greet = greet;
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
    
    
     @Override
    public void met1() {
        System.out.println("Кошка  " + name);
    }

    @Override
    public void met2() {
       System.out.println("Возраст " + age);
    }

    @Override
    public void met3() {
         System.out.println("Сказала " + greet);
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


