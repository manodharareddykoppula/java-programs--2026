class Emp {
    String name;
    int id;
    int salary;
    boolean promotion;
    boolean designation;

    public Emp(String name, boolean designation, int id, boolean promotion, int salary) {
        this.name = name;
        this.designation = designation;
        this.id = id;
        this.salary = salary;
        this.promotion = promotion;
    }

    public Emp(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void meh(String name, int id, int salary) {
        System.out.println("The salary of a person is: " + salary);
        System.out.println("The id of a person is: " + id);
        System.out.println("The name of a person is: " + name);
    }
}

public class Employee extends Emp {

    public Employee(String name, boolean designation, int id,
                    boolean promotion, int salary) {
        super(name, designation, id, promotion, salary);
    }

    public Employee(String name, int id, int salary) {
        super(name, id, salary);
    }

    void over(String name, boolean designation, int id,
              boolean promotion, int salary) {

        System.out.println("------ Employee Details ------");
        System.out.println("The id of a person is: " + id);
        System.out.println("The name of a person is: " + name);
        System.out.println("The salary of a person is: " + salary);
        System.out.println("The designation of a person is: " + designation);
        System.out.println("The promotion of a person is: " + promotion);
    }

    public static void main(String[] args) {


        Employee em = new Employee(
                "manodhara", true, 225, false, 1200000);

        em.meh("manodhara", 222, 456600);
        em.over("bhanu", false, 345, true, 200000);

        System.out.println();


        Employee em2 = new Employee("Ravi", 267, 510000);

        em2.meh("manikanta", 300, 500000);
    }
}
