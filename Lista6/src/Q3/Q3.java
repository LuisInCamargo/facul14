package Q3;

import java.util.Arrays;

public class Q3 {

    private static void invertArray(Object[] array, int posInicial, int posFinal) {
        if (posInicial < posFinal) {
            Object temp = array[posInicial];
            array[posInicial] = array[posFinal];
            array[posFinal] = temp;
            invertArray(array, ++posInicial, --posFinal);
        }
    }

    private static Object getValue(Object[] array, int pos) {
        return array[pos];
    }

    public static void main(String[] args) {
        Object[] test = {11, 2, 20, 3, 112, 10};
        invertArray(test, 0, test.length - 1);
        System.out.println(Arrays.toString(test));

    }
}
