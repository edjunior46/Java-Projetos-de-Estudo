package entities;

import java.util.List;

public class Funcionarios {

    private Integer id;
    private String nome;
    private Double salario;

    public Funcionarios(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer newId) {
        this.id = newId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public static void aumentoSalario(Integer id, Double porcentagem, List<Funcionarios> func) {
        for (int i = 0; i < func.size(); i++) {
            if (func.get(i).getId() == id) {
                func.get(i).setSalario(((func.get(i).getSalario() * porcentagem) / 100) + func.get(i).getSalario());
            }
        }
    }

}
