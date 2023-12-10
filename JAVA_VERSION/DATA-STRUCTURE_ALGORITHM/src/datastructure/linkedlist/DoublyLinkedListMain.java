package datastructure.linkedlist;

public class DoublyLinkedListMain {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        doublyLinkedList.append(4);
        doublyLinkedList.append(5);
        doublyLinkedList.append(6);
        doublyLinkedList.append(7);
        doublyLinkedList.append(8);
        doublyLinkedList.append(9);
//        doublyLinkedList.insert(3, 11);
        doublyLinkedList.remove(4);
//        System.out.println("Deleted Node: " + deletedNode.getValue());
//        System.out.println("GET:" + doublyLinkedList.get(3).getPrev().getValue());
//        doublyLinkedList.set(0, 1);
//        doublyLinkedList.removeFirst();
//        doublyLinkedList.prepend(1);
//        doublyLinkedList.removeLast();
//        System.out.println(doublyLinkedList.removeLast().getValue());
        doublyLinkedList.getHead();
        doublyLinkedList.getTail();
        doublyLinkedList.getLength();
        doublyLinkedList.printList();
    }
}
