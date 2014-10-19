
package Q1;

public class Q1 {

    private static int plusArray(int[] array,int pos){
        if(pos < 0){
            return 0;
        }else{
            return array[pos] + plusArray(array,pos-1);
        }
    }
    public static void main(String[] args) {
        int[] test = {1,2,3};
        System.out.println("Soma : "+plusArray(test,test.length -1));
    }
    
}
