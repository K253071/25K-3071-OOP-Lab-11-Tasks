import java.util.*;

public class Task4 {

    
    public static <T extends Number & Comparable<T>> void sortList(List<T> list) {
        Collections.sort(list);
    }

    
    public static double sumList(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    
    public static <T extends Number & Comparable<T>> T maxValue(List<T> list) {
        return Collections.max(list);
    }

    public static void main(String[] args) {

        
        List<Number> list = new ArrayList<>();
        list.add(10);
        list.add(5.5);
        list.add(20);
        list.add(7.2);

        
        list.sort((a, b) -> Double.compare(a.doubleValue(), b.doubleValue()));

        System.out.println("Sorted List: " + list);

        double sum = sumList(list);
        System.out.println("Sum: " + sum);

        Number max = Collections.max(list, (a, b) -> Double.compare(a.doubleValue(), b.doubleValue()));
        System.out.println("Max: " + max);
    }
}
