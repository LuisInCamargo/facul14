
package Q2;


public class Q2 {

    private static int foundMax(int[] array, int pos){
        int maior = array[pos];
         if(pos == 0){
            return 0;
        }else{
            return maior > array[pos -1]? maior :foundMax(array,pos-1);
        }
    }
    public static void main(String[] args) {
        int[] test = {11,2,20,3,112,10};
        System.out.println("Maior número :"+foundMax(test,test.length-1));
    }
}
