package studentApp;

public interface Validator<T> {
    boolean validate(T t) throws IllegalArgumentException;
}
