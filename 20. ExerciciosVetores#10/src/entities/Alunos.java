package entities;

public class Alunos {
    
    private String nome;
    private double[] notas;

    public Alunos(String nome, double[] notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public static String obterAprovados(Alunos[] arrAlunos) {

        String aprovados = "";

        for (int i = 0; i < arrAlunos.length; i++) { 
            if ((arrAlunos[i].notas[0] + arrAlunos[i].notas[1]) / 2 >= 6) {
                aprovados += arrAlunos[i].nome + 
                "\r\n";
            }
        }

        return aprovados;
    }

}
