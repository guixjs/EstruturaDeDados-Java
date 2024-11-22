public class InsertionSort {
    public static void main(String[] args) {
        int chave, j, i, k;
        int[] lista = {'A','N','A','B','E','A','T','R','I','Z'};

        System.out.println("Nome desordenado");
        for (i = 0; i < lista.length; i++) {
            System.out.printf("%c ", lista[i]);
        }

        System.out.print("\n================\n");
        for (i = 1; i < lista.length ; i++) {
            chave = lista[i];
            j=i-1;
            System.out.printf("CHAVE: %c ",chave);
            System.out.println();
            if(chave<lista[j]){
                System.out.println("troca");
            }
                while (j >= 0 && lista[j] > chave) {
                    lista[j + 1] = lista[j];
                    j--;

                    for (k=0;k< lista.length;k++){

                        System.out.printf("%c ",lista[k]);
                    }

                    System.out.println();
                }
            lista[j+1] = chave;
        }
        for (i = 0; i < lista.length; i++) {
            System.out.printf("%c ", lista[i]);
        }
    }
}
