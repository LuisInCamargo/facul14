package Q4;

public class Q4 {

    private static int binSearch(int num, int[] array, int min, int max) {
        if (max <= min) {
            return max;
        } else {
            if (num < array[max]) {
                int auxTam = (min + max) / 2;
                if (num > array[auxTam]) {
                    min = auxTam;
                } else {
                    max = auxTam;
                }
                return binSearch(num, array, min, max);
            }
            return max;
        }
    }

    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Posição : " + binSearch(4, n, 0, n.length - 1));
    }
}
