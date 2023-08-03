import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
    //  2) Подсчитать количество вхождения каждого слова
    // Пример:
    // Россия идет вперед всей планеты. Планета — это не Россия.
    // toLoverCase().
    // (Усложнение - игнорировать пунктуацию)*
    System.out.println("Введите текст");
    Scanner in = new Scanner(System.in);
    String text = in.nextLine();
    String[] words = text.split("\\s+");
    HashMap<String, Integer> hashMap = new HashMap<>();
    for (String word : words)
    {
        if (!hashMap.containsKey(word))
        {
            hashMap.put(word, 0);
        }
        hashMap.put(word, hashMap.get(word) + 1);
    }
    for (String word : hashMap.keySet())
    {
        System.out.println(word + "-" + hashMap.get(word));
    }
}
}
