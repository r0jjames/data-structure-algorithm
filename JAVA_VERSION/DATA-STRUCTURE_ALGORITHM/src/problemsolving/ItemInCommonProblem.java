package problemsolving;

import java.util.HashMap;

public class ItemInCommonProblem {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 3, 1};
        System.out.println(itemInCommon2(arr1, arr2));
    }

    public static boolean itemInCommon(int[] arr1, int[] arr2) {
        for(int i : arr1) {
            for(int j: arr2) {
                if(i == j) return true;
            }
        }
        return false;
    }
    public static boolean itemInCommon2(int[] arr1, int[] arr2) {
        HashMap<Integer, Boolean> myHashmap = new HashMap<>();
        for (int i: arr1) {
            myHashmap.put(i, false);
        }
        for(int j: arr2) {
            if(myHashmap.get(j) != null) return true;
        }
        return false;
    }
}

