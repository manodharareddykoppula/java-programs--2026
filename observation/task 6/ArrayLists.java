package collectionfw;

public class ArrayListFunctions {
    public static void main(String[] args) {
        java.util.ArrayList<String> name = new java.util.ArrayList<>();
        java.util.ArrayList<String> man = new java.util.ArrayList<>();
        name.addFirst("manodhara");
        name.add(0, "saradha");
        name.add(2, "narasimha");
        name.add(1, "pravallika");
        System.out.println(name);
        name.remove(2);
        System.out.println(name);
        man.add("manodhara");
        name.removeAll(man);
        System.out.println(name);
        System.out.println( name.contains("babbulu")); //return boolean value
        System.out.println( name.indexOf("narasimha")); // return integer value
        System.out.println(man.contains(34)); // retrun boolean value
        System.out.println(man.lastIndexOf(2)); // retrun -1 if it is not present
        int sa=name.size();
        System.out.println(sa); //return integer value
        System.out.println(name.get(2));
        System.out.println(name.add("narasimha"));
        System.out.println(name.add("manodhara"));
        System.out.println(name.set(2,"gurava reddy"));
        System.out.println(name);
        //name.subList(2,4);
        System.out.println( name.subList(0,4)); //returns the ArrayList cinsists of the index

    }
}
