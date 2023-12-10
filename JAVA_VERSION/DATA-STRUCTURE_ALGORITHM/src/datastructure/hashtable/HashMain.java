package datastructure.hashtable;

public class HashMain {
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
}
