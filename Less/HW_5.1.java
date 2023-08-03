//1) Пусть дан список сотрудников:
//Иван Иванов
//Светлана Петрова
//Кристина Белова
//Анна Мусина
//Анна Крутова
//Иван Юрин
//Петр Лыков
//Павел Чернов
//Петр Чернышов
//Мария Федорова
//Марина Светлова
//Мария Савина
//Мария Рыкова
//Марина Лугова
//Анна Владимирова
//Иван Мечников
//Петр Петин
//Иван Ежов
//Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
  
import java.util.*;
import java.util.logging.Logger;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    private static List<String> lst = new ArrayList<>();
    private static Map<String, Integer> staff = new TreeMap<>();

    public static void main(String[] args) {
        // инициализация списка
        lst.add("Иван Иванов");
        lst.add("Светлана Петрова");
        lst.add("Кристина Белова");
        lst.add("Анна Мусина");
        lst.add("Анна Крутова");
        lst.add("Иван Юрин");
        lst.add("Петр Лыков");
        lst.add("Павел Чернов");
        lst.add("Петр Чернышов");
        lst.add("Мария Федорова");
        lst.add("Марина Светлова");
        lst.add("Мария Савина");
        lst.add("Мария Рыкова");
        lst.add("Марина Лугова");
        lst.add("Анна Владимирова");
        lst.add("Иван Мечников");
        lst.add("Петр Петин");
        lst.add("Иван Ежов");

        // подсчет повторений
        for (String s : lst) {
            String[] name = s.split(" ");
            if (staff.containsKey(name[0])) {
                staff.put(name[0], staff.get(name[0]) + 1);
            } else {
                staff.put(name[0], 1);
            }
        }

        // сортировка, получениеи списка
        List<String> listStaff = staff.entrySet().stream()
                .sorted((i1, i2) -> i2.getValue().compareTo(i1.getValue()))
                .map(e -> e.getKey() + "=" +e.getValue().toString())
                .collect(Collectors.toList());

        // вывод
        
                System.out.println("Повторения: \n" + listStaff);
    

    }
}


