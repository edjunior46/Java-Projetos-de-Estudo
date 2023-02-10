package entities;

public class Pessoas {
    
    private String nome;
    private char genero;
    private double altura;

    public Pessoas(String nome, char genero, double altura) {
        this.nome = nome;
        this.genero = genero;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public static double obterMaiorAltura(Pessoas[] arrPessoas) {
        int result = 0;

        for (int i = 0; i < arrPessoas.length; i++) {
            if (arrPessoas[i].getAltura() >= arrPessoas[result].getAltura()) {
                result = i;
            }
        }

        return arrPessoas[result].getAltura();
    }

    public static double obterMenorAltura(Pessoas[] arrPessoas) {
        int result = 0;

        for (int i = 0; i < arrPessoas.length; i++) {
            if (arrPessoas[i].getAltura() <= arrPessoas[result].getAltura()) {
                result = i;
            }
        }

        return arrPessoas[result].getAltura();
    }

    public static double obterMediaMulheres(Pessoas[] arrPessoas) {
        double result = 0;
        int qtde = 0;

        for (int i = 0; i < arrPessoas.length; i++) {
            if (arrPessoas[i].getGenero() == 'f') {
                result += arrPessoas[i].getAltura();
                qtde++;
            }
        }

        return result / qtde;
    }

    public static int obterQtdeHomens(Pessoas[] arrPessoas) {
        int result = 0;

        for (int i = 0; i < arrPessoas.length; i++) {
            if (arrPessoas[i].getGenero() == 'm') {
                result++;
            }
        }

        return result;
    }

}
