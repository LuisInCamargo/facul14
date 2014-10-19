package Q1;

public class Q1 {

    //Primeiro: Imprimir quais são os numeros seguindo as condições iniciais
    //Segundo: Contar os ciclos 
    //Terceiro: Comparar valores e ver qual é o maior ciclos de todos.
    
    public static  void loop(int initial, int end) {
        int maior = foundCycles(initial, 0);
        int menor = foundCycles(initial, 0);
        int temp ;
        for (int i = initial + 1; i <= end; i++) {
            temp = foundCycles(i, 0);
            if (temp > maior) {
                maior = temp;
            } else {
                if (temp < menor) {
                    menor = temp;
                }
            }
        }
         System.out.println(initial+" "+end+" "+maior);
    }

    public static boolean isSecure(int num) {
        return num == 1;
    }

    public static int foundCycles(int num, int cont) {
        if (isSecure(num)) {          
            return cont + 1;
        } else {
            if (num % 2 == 0) {
                return foundCycles(num / 2, cont + 1);
            } else {
                return foundCycles((num * 3) + 1, cont + 1);
            }
        }
    }

    public static void main(String[] args) {
        int initial = 0;
        int end = 0;
       
        initial = Integer.parseInt(args[0]);
        end = Integer.parseInt(args[1]);

        loop(initial,end);
    }

}
