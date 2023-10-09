import java.util.*;

class PhoneBook {
    private static HashMap<String, Set<Integer>> phoneBook = new HashMap<>();

    //Добавляет запись в телефонную книгу.
    //Если запись с именем name уже существует, добавляет новый номер телефона в существующую запись.
    //Если запись с именем name не существует, создает новую запись с этим именем и номером телефона phoneNum.
    public void add(String name, Integer phoneNum) {
// Введите свое решение ниже
        if (phoneBook.get(name) == null) {
            Set<Integer> put = phoneBook.put(name, new HashSet<Integer>());
        }
        phoneBook.get(name).add(phoneNum);

    }

    //Поиск номеров телефона по имени в телефонной книге.
    //Если запись с именем name существует, возвращает список номеров телефона для этой записи.
    //Если запись с именем name не существует, возвращает пустой список.
    public ArrayList<Integer> find(String name) {
// Введите свое решение ниже
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (phoneBook.containsKey(name)) {
            arrayList.addAll(phoneBook.get(name));
        }
        return arrayList;
    }

    //Возвращает всю телефонную книгу в виде HashMap, где ключи - это имена, а значения - списки номеров телефона.
    public static HashMap<String, Set<Integer>> getPhoneBook() {
// Введите свое решение ниже
        return phoneBook;
    }

    private class MySet<E> {

        private Set<E> set = new HashSet<>();

        public Iterator<E> iterator() {
            return set.iterator();
        }

        public boolean add(E e) {
            return set.add(e);
        }

        public boolean remove(Object o) {
            return set.remove(o);
        }

        public void clear() {
            set.clear();
        }

        public void addAll(MySet<E> integerMySet) {
        }
    }
}

public class Task1 {
    public static void main(String[] args) {
        // Реализуйте структуру телефонной книги с помощью HashMap.
        //Программа также должна учитывать, что в во входной структуре
        // будут повторяющиеся имена с разными телефонами,
        // их необходимо считать, как одного человека с разными телефонами.
        // У одного человека не должно быть двух одинаковых телефонов
        // Вывод должен быть отсортирован по убыванию числа телефонов.

        String name1;
        String name2;
        int phone1;
        int phone2;

        if (args.length == 0) {
            name1 = "Ivanov";
            name2 = "Petrov";
            phone1 = 123456;
            phone2 = 654321;
        } else {
            name1 = args[0];
            name2 = args[1];
            phone1 = Integer.parseInt(args[2]);
            phone2 = Integer.parseInt(args[3]);
        }

        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add(name1, phone1);
        myPhoneBook.add(name1, phone2);
        //
        myPhoneBook.add(name1, phone2);
        //
        myPhoneBook.add(name2, phone2);

        System.out.println(myPhoneBook.find(name1));
        System.out.println(PhoneBook.getPhoneBook());
        System.out.println(myPhoneBook.find("Me"));

    }
}
