package ru.byzatic.commons;
public class ObjectsUtils {
    public static <T> void requireNonNull(T obj, Throwable exception) throws Throwable {
        if (obj == null) {
            throw exception;
        }
    }
}
