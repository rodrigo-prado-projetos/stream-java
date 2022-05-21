package operation.terminal;

import java.util.Collection;

public interface TerminalOperation<T> {
    void count(Collection<T> numbers);

    void min(Collection<T> numbers);

    void max(Collection<T> numbers);

    void collectJoining(Collection<T> numbers);

    void collectGroupingBy(Collection<T> numbers);

    void valuePrint(Object x);
}