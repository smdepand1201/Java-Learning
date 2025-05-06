import java.util.ArrayList;

public class StatsCalculator {
    public static final String VERSION = "1.0";

    private static int totalCalculations = 0;

    static {
        System.out.println("Initializing StatsCalculator v" + VERSION);
    }

    public static double calculateAverage(ArrayList<Integer> numbers) {
        if (numbers.isEmpty()) return 0;
        int sum = 0;
        for (Integer num : numbers) { 
            sum += num; 
        }
        totalCalculations++;
        return (double) sum / numbers.size();
    }

    public static int findMax(ArrayList<Integer> numbers) {
        if (numbers.isEmpty()) return Integer.MIN_VALUE;
        int max = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            max = Math.max(max, numbers.get(i));
        }
        totalCalculations++;
        return max;
    }

    public static String formatResult(double value) {
        return String.format("Result: %.2f", value);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> dataset = new ArrayList<>();
        
        dataset.add(42);
        dataset.add(87);
        dataset.add(56);
        dataset.add(91);
        dataset.add(23);

        double avg = calculateAverage(dataset);
        int max = findMax(dataset);

        System.out.println(formatResult(avg));
        System.out.println("Maximum value: " + max);
        System.out.println("Total calculations performed: " + totalCalculations);

        System.out.println("Rounded average: " + Math.round(avg));
    }
}