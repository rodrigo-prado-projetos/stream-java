import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 5, 8, 9, 1, 4, 7, 6, 6, 9, 9);
        IntermediateOperationImp(numbers);


    }

    private static void IntermediateOperationImp(List<Integer> numbers) {
        IntermediateOperationImp<Integer> integerIntermediateOperationImp = new IntermediateOperationImp<>();
        System.out.println("Limit:");
        integerIntermediateOperationImp.limit(numbers);
        System.out.println("\nSkip:");
        integerIntermediateOperationImp.skip(numbers);
        System.out.println("\nMap:");
        integerIntermediateOperationImp.map(numbers);
        System.out.println("\nFilter");
        integerIntermediateOperationImp.filter(numbers);
        System.out.println("\nDistinct");
        integerIntermediateOperationImp.distinct(numbers);
    }
}