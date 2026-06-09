import java.lang.reflect.Array;

interface Function<T> {
    T apply(T o);
}

public class ArrayMapper {

    @SuppressWarnings("unchecked")
    public static <T> T[] arrayMapping(T[] array, Function<T> function) {
        if (array == null || function == null) {
            throw new NullPointerException("Массив и функция не должны быть null");
        }

        Class<?> componentType = array.getClass().getComponentType();

        T[] result = (T[]) Array.newInstance(componentType, array.length);

        for (int i = 0; i < array.length; i++) {
            result[i] = function.apply(array[i]);
        }

        return result;
    }
}