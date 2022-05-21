package operation.terminal;

import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

public class TerminalOperationImp<T> implements TerminalOperation<T> {
    @Override
    public void count(Collection<T> collection) {
        valuePrint(collection.stream().count());
    }

    @Override
    public void min(Collection<T> collection) {
        Collection<Integer> collectionInteger = (Collection<Integer>) collection;
        valuePrint(
                collectionInteger
                        .stream()
                        .min(Comparator.naturalOrder())
        );
    }

    @Override
    public void max(Collection<T> collection) {
        Collection<Integer> collectionInteger = (Collection<Integer>) collection;
        valuePrint(
                collectionInteger
                        .stream()
                        .max(Comparator.naturalOrder())
        );
    }

    @Override
    public void collectJoining(Collection<T> collection) {
        Collection<Integer> collectionInteger = (Collection<Integer>) collection;
        valuePrint(
                collectionInteger
                        .stream()
                        .collect(Collectors.groupingBy(x -> x % 2 == 0))
        );
    }

    @Override
    public void collectGroupingBy(Collection<T> collection) {
        valuePrint(
                collection
                        .stream()
                        .map(x -> String.valueOf(x))
                        .collect(Collectors.joining(";"))
        );
    }

    @Override
    public void valuePrint(Object obj) {
        System.out.println(obj);
    }
}