package Q2;

import java.io.*;

public class Q2 {

    public static void main(String[] args) {
        String line = null;
        BufferedReader arqIn = null;
        String[] n = null;
        int[] numbers = new int[2];
        try {
            arqIn = new BufferedReader(new FileReader("yes.txt"));
            while ((line = arqIn.readLine()) != null) {
                n = line.split(" ");
                numbers[0] = Integer.parseInt(n[0]);
                numbers[1] = Integer.parseInt(n[1]);
            }
        } catch (FileNotFoundException fnfe) {
            System.err.println("Arquivo não encontrado.");
        } catch (IOException ioe) {
            System.out.println("Não consegue ler o arquivo.");
        }
    }
}
