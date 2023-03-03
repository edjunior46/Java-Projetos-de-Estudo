package entities;

public class PessoaJuridica extends Pessoa {

    private Integer numFunc;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String nome, Double rendaAnual, Integer numFunc) {
        super(nome, rendaAnual);
        this.numFunc = numFunc;
    }

    public Integer getNumFunc() {
        return this.numFunc;
    }

    public void setNumFunc(Integer numFunc) {
        this.numFunc = numFunc;
    }

    @Override
    public Double imposto() {
        Double result = 0.0;
        if (this.numFunc > 10) {
            result += this.rendaAnual * 0.14;
        } else {
            result += this.rendaAnual * 0.16;
        }
        return result;
    }
    
}
