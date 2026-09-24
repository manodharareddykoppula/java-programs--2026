package collectionfw;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> number= new Vector<>();
        number.addFirst(12);
        number.add(1,24);
        number.add(36);
        number.add(48);
        System.out.println(number);
        System.out.println(number.get(3));
        System.out.println(number.getFirst());
        System.out.println(number.getLast());
        System.out.println(number.remove(3));
        System.out.println(number.removeFirst());
        System.out.println(number.removeLast());
        System.out.println(number.size());
        number.add(48);
        System.out.println(number.contains(48));
System.out.println(number);
/* here the offer and poll and peek opertions are not performed in the vector*/
    }
}
