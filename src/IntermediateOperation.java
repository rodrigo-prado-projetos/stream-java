import java.util.Collection;

public interface IntermediateOperation<T> {
    void distinct(Collection<T> numbers);

    void filter(Collection<T> numbers);

    void map(Collection<T> numbers);

    void skip(Collection<T> numbers);

    void limit(Collection<T> numbers);

    void valuePrint(T x);
}