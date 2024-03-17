package entities;

public class PessoaJuridica extends Pessoa{
    private int numeroFuncionarios;
    public PessoaJuridica(String nome, double rendaAnual, int numeroFuncionarios){
        super(nome, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;

    }
    public PessoaJuridica(){
        this("",0.0,0);

    }
    public int getNumeroFuncionarios(){
        return this.numeroFuncionarios;
    }
    @Override
    public double valorImposto(){
        if(this.numeroFuncionarios > 10){
            return this.rendaAnual * 0.14;
        }else{
            return this.rendaAnual * 0.16;
        }
    }


}
