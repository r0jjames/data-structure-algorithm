package datastructure.heap;

public class HeapMain {
    public static void main(String[] args) {

        Heap heap = new Heap();
        heap.insert(95);
        heap.insert(75);
        heap.insert(80);
        heap.insert(55);
        heap.insert(60);
        heap.insert(50);
        heap.insert(65);
        System.out.println(heap.getHeap());
        heap.remove();
        System.out.println(heap.getHeap());
        heap.remove();
        System.out.println(heap.getHeap());

        /*
         EXPECTED OUTPUT:
        ---------------
        [95, 75, 80, 55, 60, 50, 65]
        [80, 75, 65, 55, 60, 50]
        [75, 60, 65, 55, 50]

         */

        /* To validate the insert and get method
        Heap datastructure.heap = new Heap();
        datastructure.heap.insert(99);
        datastructure.heap.insert(72);
        datastructure.heap.insert(61);
        datastructure.heap.insert(58);
        System.out.println(datastructure.heap.getHeap());
        datastructure.heap.insert(100);
        System.out.println(datastructure.heap.getHeap());
        datastructure.heap.insert(75);
        System.out.println(datastructure.heap.getHeap());

        EXPECTED OUTPUT:
        ---------------
        [99, 72, 61, 58]
        [100, 99, 61, 58, 72]
        [100, 99, 75, 58, 72, 61]
         */
    }
}
