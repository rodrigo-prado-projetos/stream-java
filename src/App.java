import operation.intermediate.IntermediateOperationImp;
import operation.terminal.TerminalOperationImp;

import java.util.*;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 5, 8, 9, 1, 4, 7, 6, 6, 9, 9);
        intermediateOperationImp(numbers);
        terminalOperationImp(numbers);
    }

    private static void terminalOperationImp(List<Integer> numbers) {
        TerminalOperationImp terminalOperationImp = new TerminalOperationImp<Integer>();
        System.out.println("\nCount:");
        terminalOperationImp.count(numbers);
        System.out.println("\nMin:");
        terminalOperationImp.min(numbers);
        System.out.println("\nMax:");
        terminalOperationImp.max(numbers);
        System.out.println("\nCollect Map:");
        terminalOperationImp.collectGroupingBy(numbers);
        System.out.println("\nCollect Join:");
        terminalOperationImp.collectJoining(numbers);
    }

    private static void intermediateOperationImp(List<Integer> numbers) {
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