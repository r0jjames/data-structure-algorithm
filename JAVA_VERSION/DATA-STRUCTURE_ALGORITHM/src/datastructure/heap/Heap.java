package datastructure.heap;

import java.util.ArrayList;
import java.util.List;

public class Heap {
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
    private List<Integer> heap;

    public Heap() {
        this.heap = new ArrayList<>();
    }
    public List<Integer> getHeap() {
        return new ArrayList<>(heap);
    }

    private int leftChildIndex(int parentIndex) {
        return 2 * parentIndex + 1;
    }
    private int rightChildIndex(int parentIndex) {
        return 2 * parentIndex + 2;
    }
    private int parent(int childIndex) {
        return (childIndex - 1) / 2;
    }
    public void swap(int index1, int index2) {
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }
    public void insert(int value) {
        heap.add(value);
        int currentIndex = heap.size() - 1;
        while(currentIndex > 0 && heap.get(currentIndex) > heap.get(parent(currentIndex))) {
            swap(currentIndex, parent(currentIndex));
            currentIndex = parent(currentIndex);
        }
    }
    public Integer remove() {
        if(heap.isEmpty()) return null;
        if(heap.size() == 1) {
            return heap.remove(0);
        }
        int maxValue = heap.get(0);
        heap.set(0, heap.remove(heap.size() - 1));
        // Sink down method
        sinkDown(0);
        return maxValue;
    }
    private void sinkDown(int index) {
        int maxIndex = index;

        while(true) {
            int leftIndex = leftChildIndex(index);
            int rightIndex = rightChildIndex(index);
            if(leftIndex < heap.size() && heap.get(leftIndex) > heap.get(maxIndex)) {
                maxIndex = leftIndex;
            }
            if(rightIndex < heap.size() && heap.get(rightIndex) > heap.get(maxIndex)) {
                maxIndex = rightIndex;
            }
            if (maxIndex != index) {
                swap(index, maxIndex);
                index = maxIndex;
            } else {
                return;
            }
        }
    }
}
