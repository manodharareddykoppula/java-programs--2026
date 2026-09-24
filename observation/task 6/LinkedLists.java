package collectionfw;

import java.util.LinkedList;

public class LinkedListFunctions {
        public static void main(String[] args) {

                LinkedList<Integer> list= new LinkedList<>();
                list.add(10);
                list.add(20);
                list.add(30);
                list.add(40);
                list.addFirst(50);
                System.out.println(list); //return the list
              list.add(2,34);
                System.out.println(list);// return the list after ading the index 2
                System.out.println( list.get(3)); //return the number in the index 2
                System.out.println(list.getFirst()); // return the element in the first of the list
                System.out.println(list.getLast()); // return the element in the  last of the list
                System.out.println(list.remove(2));// removes the element present in the index 2
                System.out.println(list);
                System.out.println(list.removeLast());//removes the element end of the list
                System.out.println(list);
                System.out.println(list.removeFirst());// removes the element first of the list
                System.out.println(list);
                System.out.println(list.offer(99));//offer is also same as add
                System.out.println(list);
                System.out.println(list.poll());//poll is also same as remove
                System.out.println(list);
                System.out.println(list.peek()); //peek represents the element present at the index0
                System.out.println(list.indexOf(99)); //return the index element present in 99
                System.out.println(list.lastIndexOf(45));  // return the value -1 if the element is not present

        }
}
