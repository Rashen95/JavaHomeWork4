//Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;
import java.util.Queue;

public class Task02 {
    public static void enqueue(Queue<Integer> object, int element) {
        object.offer(element);
    }

    public static void dequeue(Queue<Integer> object) {
        object.poll();
    }

    public static void first(Queue<Integer> object) {
        System.out.println("Первый элемент нашей очереди: " + object.peek());
    }

    public static void main(String[] args) {
        Queue<Integer> myLinkedList = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            myLinkedList.offer(i);
        }
        System.out.println("Наша очередь: " + myLinkedList);
        enqueue(myLinkedList, 999);
        System.out.println("Очередь после добавления числа 999: " + myLinkedList);
        dequeue(myLinkedList);
        System.out.println("Очередь после удаления первого числа: " + myLinkedList);
        first(myLinkedList);
        System.out.println("Очередь после использования метода first: " + myLinkedList);
    }
}
