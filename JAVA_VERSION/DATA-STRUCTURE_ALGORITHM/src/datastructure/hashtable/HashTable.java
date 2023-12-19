package datastructure.hashtable;

import java.util.ArrayList;

public class HashTable {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        hashTable.set("nails", 1000);
        hashTable.set("tile", 50);
        hashTable.set("lumber", 80);
        hashTable.set("bolts", 200);
        hashTable.set("screws", 140);
        hashTable.printTable();
        System.out.println(hashTable.keys());
//        System.out.println(hashTable.get("tile"));
    }
    private int arraySize = 7;
    private Node[] dataMap;

    class Node {
        private String key;
        private int value;
        private Node next;

        Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    public HashTable() {
        dataMap = new Node[arraySize];
    }
    public void set(String key, int value) {
        int index = hash(key);
        Node newNode = new Node(key, value);
        if(dataMap[index] == null) {
            dataMap[index] = newNode;
        } else {
            Node temp = dataMap[index];
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public int get(String key) {
        int index = hash(key);
        Node temp = dataMap[index];
        while (temp != null) {
            if(temp.key.equals(key)) return temp.value;
            temp = temp.next;
        }

        return 0;
    }
    public ArrayList keys() {
        ArrayList<String> keys = new ArrayList<>();
        for(int i=0; i < dataMap.length; i++) {
            Node temp = dataMap[i];
            while (temp != null) {
                keys.add(temp.key);
                temp = temp.next;
            }
        }
        return keys;
    }
    private int hash(String key) {
        int hash = 0;
        char[] keyChar = key.toCharArray();

        for(int i=0; i < keyChar.length; i++) {
            int asciiValue = keyChar[i];
            hash = (hash + asciiValue * 27) % dataMap.length;
        }
        return hash;
    }
    public void printTable() {
        for(int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ":");
            Node temp = dataMap[i];
            while(temp != null) {
                System.out.println("   {" + temp.key + "= " +temp.value+ " }");
                temp = temp.next;
            }
        }
    }
}
