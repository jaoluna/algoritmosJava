package br.com.alura.algoritmos;

public class TestaMenorPreco {
    public static void main(String[] args) {
        //double atual = 0;
        //double maisBarato = 0;
        double[] precos = new double[5];

        precos[0] = 1000000;
        precos[1] = 46000;
        precos[2] = 16000;
        precos[3] = 46000;
        precos[4] = 17000;


        /*for (int i = 0; i < precos.length; i++){
           atual = precos[i];
           if (maisBarato == 0){
               maisBarato = atual;
           }
           if (maisBarato > atual){
               maisBarato = atual;
           }
        }*/

        int maisBarato = 0;
        for (int atual = 0; atual < precos.length; atual++){
            if(precos[atual] < precos[maisBarato]){
                maisBarato = atual;
            }
        }

        System.out.println(precos[maisBarato]);

    }
}
