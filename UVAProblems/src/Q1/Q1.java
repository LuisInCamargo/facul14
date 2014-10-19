package Q1;

import java.util.Scanner;

public class Q1 {

    //Primeiro: Imprimir quais são os numeros seguindo as condições iniciais
    //Segundo: Contar os ciclos 
    //Terceiro: Comparar valores e ver qual é o maior ciclos de todos.
    private static void loop(int initial, int end) {
        int maior = foundCycles(initial, 0);
        int menor = foundCycles(initial, 0);
        int temp = 0;
        for (int i = initial + 1; i <= end; i++) {
            temp = foundCycles(i, 0);
            if (temp > maior) {
                System.out.println(temp);
                maior = temp;
            } else {
                if (temp < menor) {
                    System.out.println(temp);
                    menor = temp;
                }

            }
        }
    }

    private static boolean isSecure(int num) {
        return num == 1;
    }

    public static int foundCycles(int num, int cont) {
        if (isSecure(num)) {
            System.out.println(cont + 1 + " ciclos.");
            return cont;
        } else {
            if (num % 2 == 0) {
                return foundCycles(num / 2, cont + 1);
            } else {
                return foundCycles((num * 3) + 1, cont + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int initial = 0;
        int end = 0;

        System.out.println("Write two integers between [0,1,000,000] :");
        initial = input.nextInt();
        end = input.nextInt();

        foundCycles(22, 0);
    }

}
