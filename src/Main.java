import java.util.*;

class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Петр", "Первый", 7);
        Person person2 = new Person("Екатерина", "Вторая", 4);
        Person person3 = new Person("Александр", "Третий", 3);
        Person person4 = new Person("Йоханныс", "Четвертый", 2);
        Person person5 = new Person("Карл", "Пятый", 1);

        Deque<Person> list = new LinkedList<>();

        list.offer(person1);
        list.offer(person2);
        list.offer(person3);
        list.offer(person4);
        list.offer(person5);

        while (!list.isEmpty()) {
            if (list.peek().ticket()) {
                System.out.println(list.peek().message());
                Person e = list.poll();
                list.addLast(e);
            } else {
                list.remove();
            }
        }
    }
}