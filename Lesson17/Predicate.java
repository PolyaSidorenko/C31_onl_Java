package Lesson17;

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}
