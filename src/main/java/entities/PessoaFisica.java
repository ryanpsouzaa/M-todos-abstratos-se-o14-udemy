package entities;

public class PessoaFisica extends Pessoa{
    private double gastoSaude;
    public PessoaFisica(String nome,double rendaAnual,double gastoSaude){
        super(nome,rendaAnual);
        this.gastoSaude = gastoSaude;
    }
    public double getGastoSaude(){
        return this.gastoSaude;
    }
    @Override
    public double valorImposto(){
        double valorSaude = 0.0;
        if(this.gastoSaude > 0){
            valorSaude = (this.gastoSaude * 0.5);
        }
        if(this.rendaAnual < 20000.00){
            return (this.rendaAnual * 0.15) - (valorSaude);
        }else{
            return (this.rendaAnual * 0.25) - (valorSaude);
        }
    }

}
