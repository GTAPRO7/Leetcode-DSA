import java.util.LinkedList;

public class MyHashSet {
    private static final int BASE = 769;
    private LinkedList<Integer>[] table;

    @SuppressWarnings("unchecked")
    public MyHashSet() {
        table = new LinkedList[BASE];
        for (int i = 0; i < BASE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hash(int key) {
        return key % BASE;
    }

    public void add(int key) {
        int index = hash(key);
        LinkedList<Integer> bucket = table[index];
        for (Integer element : bucket) {
            if (element == key) {
                return;
            }
        }
        bucket.add(key);
    }

    public void remove(int key) {
        int index = hash(key);
        LinkedList<Integer> bucket = table[index];
        bucket.remove(Integer.valueOf(key));
    }

    public boolean contains(int key) {
        int index = hash(key);
        LinkedList<Integer> bucket = table[index];
        for (Integer element : bucket) {
            if (element == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        MyHashSet myHashSet = new MyHashSet();

        System.out.println("Executing Example 1 Operations:");

        myHashSet.add(1);
        System.out.println("add(1) -> set contains 1");

        myHashSet.add(2);
        System.out.println("add(2) -> set contains 1, 2");

        boolean test1 = myHashSet.contains(1);
        System.out.println("contains(1): " + test1 + " (Expected: true)");

        boolean test2 = myHashSet.contains(3);
        System.out.println("contains(3): " + test2 + " (Expected: false)");

        myHashSet.add(2);
        System.out.println("add(2) duplicate check");

        boolean test3 = myHashSet.contains(2);
        System.out.println("contains(2): " + test3 + " (Expected: true)");

        myHashSet.remove(2);
        System.out.println("remove(2)");

        boolean test4 = myHashSet.contains(2);
        System.out.println("contains(2): " + test4 + " (Expected: false)\n");

        System.out.println("Testing Collision Resolution (Keys 1 and 770 both hash to 1 % 769 = 1):");
        myHashSet.add(770);
        System.out.println("add(770)");
        System.out.println("contains(1):   " + myHashSet.contains(1) + " (Expected: true)");
        System.out.println("contains(770): " + myHashSet.contains(770) + " (Expected: true)");

        myHashSet.remove(1);
        System.out.println("remove(1)");
        System.out.println("contains(1):   " + myHashSet.contains(1) + " (Expected: false)");
        System.out.println("contains(770): " + myHashSet.contains(770) + " (Expected: true)");
    }
}