package entities;

public class Altura {

    public static double calcularAltura(double[] vect) {

        double result = 0;

        for (int i = 0; i < vect.length; i++) {
            result += vect[i];
        }

        return result / vect.length;

    }

}