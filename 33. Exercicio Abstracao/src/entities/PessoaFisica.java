package entities;

public class PessoaFisica extends Pessoa {

    private Double gastosSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return this.gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public Double imposto() {
        Double result = 0.0;
        if (this.rendaAnual < 20000) {
            result += this.rendaAnual * 0.15;
        } else {
            result += this.rendaAnual * 0.25;
        }

        if (this.gastosSaude > 0) {
            result -= this.gastosSaude * 0.5;
        }

        return result;
    }
    
}
