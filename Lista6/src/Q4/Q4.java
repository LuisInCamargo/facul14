package Q4;

public class Q4 {

    private static void binSearch(int num, int[] array, int min, int max) {
        int[] aux = array;
        if (max > min) {
            if (num < array[max]) {
                int auxTam = (min + max)/2;
                if(num > array[auxTam]){
                    min = auxTam;
                }else{
                    max = auxTam;
                }
                binSearch(num,array,min,max);
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int[] n = {1,2,3,4,5,6,7};
        binSearch(4,n,0,n.length-1);
    }
}
