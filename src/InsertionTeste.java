public class InsertionTeste {
    public static void main(String[] args) {
        int [] valores = {'J', 'O', 'S', 'E', 'G', 'U', 'I', 'L', 'H', 'E'};
        insertionSort(valores);
    }

    public static void insertionSort(int[] values) {
        int i,k,chave;
        for (i= 1; i < values.length; i++) {

            int j = i;
            chave = values[j];
            System.out.printf("Chave: %c",values[j]);
            System.out.println();
            for (k = 0; k < values.length; k++) {
                System.out.printf("%c",values[k]);
            }
            System.out.println();

            System.out.printf("Compara %c com %c",values[j],values[j-1]);
            System.out.println();

            if(values[j] < values[j-1]){
                System.out.println("Troca");
                while (j > 0 && values[j] < values[j-1]) {
                    values[j] = values[j-1];
                    j -= 1;

                    System.out.println("CHAVE SENDO INSERIDA====");
                    for (k = 0; k < values.length; k++) {
                        System.out.printf("%c",values[k]);
                    }
                    System.out.println();

                }
                values[j] = chave;

                System.out.println("Lista após inserir a chave");
                for (k = 0; k < values.length; k++) {
                    System.out.printf("%c",values[k]);
                }
                System.out.println();

            }else{
                System.out.println("Não troca");
            }
        }

    }
    }