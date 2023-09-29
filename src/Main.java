import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void main(String[] args) {
        // Реализуйте структуру телефонной книги с помощью HashMap.
        //Программа также должна учитывать, что во входной структуре
        // будут повторяющиеся имена с разными телефонами, их необходимо
        // считать, как одного человека с разными телефонами. Вывод должен
        // быть отсортирован по убыванию числа телефонов.

        TelephonNumbers telephonNumbers = new TelephonNumbers();
        telephonNumbers.add("Иванов", "1234456632");
        telephonNumbers.add("Петров", "9056731243");
        telephonNumbers.add("Смирнов", "9066754322");
        telephonNumbers.add("Григорьев", "9076542223");
        telephonNumbers.add("Антонов", "9086547896");
        telephonNumbers.add("Клеймёнов", "9090876769");
        telephonNumbers.add("Петров", "9090876764");
//        telephonNumbers.printBook();
        System.out.println(telephonNumbers.getByName("Петров"));
        System.out.println(telephonNumbers.getAll());
        System.out.println(telephonNumbers.getAllSorted());

    }
}