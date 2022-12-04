//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;

public class Task01 {
    public static void main(String[] args) {
        LinkedList<Integer> myLinkedList = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            myLinkedList.add(i);
        }
        System.out.println("Первоначальный список:");
        System.out.println(myLinkedList);
        System.out.println("Обработка...");
        for (int i = 1; i < myLinkedList.size(); i++) {
            myLinkedList.addLast(myLinkedList.get(myLinkedList.size() - 1 - i));
            myLinkedList.remove(myLinkedList.size() - 2 - i);
        }
        System.out.println("'Перевернутый' список:");
        System.out.println(myLinkedList);
    }
}
