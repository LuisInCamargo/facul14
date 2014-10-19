package Q2;

import java.io.*;

public class Q2 {

    private static boolean isUnderRange(int num){
        return num <= Math.pow(2.0, 32.0);
    }
    public static void main(String[] args) {
        String line = null;
        String[] n = null;
        int[] numbers = new int[2];
        BufferedReader arqIn = null;
        try{
            arqIn = new BufferedReader(new FileReader(args[0])); 
            while ((line = arqIn.readLine()) != null) {
                n = line.split(" ");
                numbers[0] = Integer.parseInt(n[0]);
                numbers[1] = Integer.parseInt(n[1]);
                if(isUnderRange(numbers[0]) && isUnderRange(numbers[1])){
                    System.out.println(Math.abs(numbers[0]- numbers[1]));
                }
            }
            arqIn.close();
        } catch (FileNotFoundException fnfe) {
            System.err.println("Arquivo não encontrado.");
        } catch (IOException ioe) {
            System.out.println("Não consegue ler o arquivo.");
        }
    }
}
