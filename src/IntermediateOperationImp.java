import java.util.Collection;

public class IntermediateOperationImp<T> implements IntermediateOperation<T> {
    @Override
    public void distinct(Collection<T> collection) {
        collection.stream()
                .distinct()
                .forEach(x -> valuePrint(x));
    }

    @Override
    public void filter(Collection<T> collection) {
        Collection<Integer> collectionInteger = (Collection<Integer>) collection;
        collectionInteger
                .stream()
                .filter(x -> x % 2 == 0)
                .forEach(x -> valuePrint((T) x));
    }

    @Override
    public void map(Collection<T> collection) {
        Collection<Integer> collectionInteger = (Collection<Integer>) collection;
        collectionInteger
                .stream()
                .map(x -> x * 2)
                .forEach(x -> valuePrint((T) x));
    }

    @Override
    public void skip(Collection<T> collection) {
        collection
                .stream()
                .skip(2)
                .forEach(x -> valuePrint(x));
    }


    @Override
    public void limit(Collection<T> collection) {
        collection
                .stream()
                .limit(2)
                .forEach(x -> valuePrint(x));
    }

    @Override
    public void valuePrint(T x) {
        System.out.println(x);
    }
}