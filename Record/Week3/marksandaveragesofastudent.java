public class Marks {
    public static void main(String[] args) {

        int total = 0;

        for (int i = 0; i < 5; i++) {
            total += Integer.parseInt(args[i]);
        }

        double average = total / 5.0;

        System.out.println("Total = " + total);
        System.out.println("Average = " + average);
    }
}
