package validators;

public interface Validator<T> {
    void check(T t);
}