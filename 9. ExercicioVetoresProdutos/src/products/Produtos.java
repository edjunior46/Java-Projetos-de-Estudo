package products;

public class Produtos {
    
    public static double[] vectPrecos(int qtdeProdutos) {
        double[] arrPrecos = new double[qtdeProdutos];
        return arrPrecos;
    }

    public static double calcularMedia(double[] arrPrecos) {
        double result = 0;

        for (int i = 0; i < arrPrecos.length; i++) {
            result += arrPrecos[i];
        }

        return result / arrPrecos.length;
    }

}
