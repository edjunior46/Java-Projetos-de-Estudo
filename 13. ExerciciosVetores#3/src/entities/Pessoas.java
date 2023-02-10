package entities;

public class Pessoas {
    
    public String name;
    private int idade;
    private double altura;

    public Pessoas(String name, int idade, double altura) {
        this.name = name;
        this.idade = idade;
        this.altura = altura;
    }

    public String getName() {
        return name;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setIdade(int newIdade) {
        this.idade = newIdade;
    }

    public void setAltura(double newAltura) {
        this.altura = newAltura;
    }

    public static double obterMedia(Pessoas[] arrPessoas) {
        double result = 0;

        for (int i = 0; i < arrPessoas.length; i++) {
            result += arrPessoas[i].altura;
        }

        return result / arrPessoas.length;
    }

    public static double obterPorcentagem(Pessoas[] arrPessoas) {
        double qtde = 0;

        for (int i = 0; i < arrPessoas.length; i++) {
            if (arrPessoas[i].idade < 16) {
                qtde++;
            }
        }

        return (qtde / arrPessoas.length) * 100;
    }

    public static void obterNomes(Pessoas[] arrPessoas) {
        for (int i = 0; i < arrPessoas.length; i++) {
            if (arrPessoas[i].idade < 16) {
                System.out.println(arrPessoas[i].name);
            }
        }
    }

}
