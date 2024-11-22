public class BubbleSort {
    public static void main(String[] args) {
        int[] lista = {25,56,0,3,-21,38,10,96,19,93};//COLOQUEM AQUI OS NÚMEROS DA LISTA
        int aux,i,j,k;
        for (i = 0; i < lista.length; i++) {
            System.out.println("PARTE "+(i+1)+"=============");
            for (j = 0; j < lista.length - 1; j++) {
                System.out.println("Estado atual da lista:");
                for (k = 0; k < lista.length; k++) {
                    System.out.print(lista[k]+" ");
                }
                System.out.println();
                System.out.println("Comparando "+lista[j]+" com "+lista[j+1]);
                if (lista[j] > lista[j + 1]) {
                    aux = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = aux;
                    System.out.println("Trocando "+lista[j]+" com "+lista[j+1]);
                    System.out.println();
                }else {
                    System.out.printf("Não houve troca, pois %d é menor que %d\n",lista[j],lista[j+1]);
                    System.out.println();
                }
            }

            System.out.println();
        }

        for (i=0;i<lista.length;i++){
            System.out.print(lista[i]+" ");
        }
    }
}
