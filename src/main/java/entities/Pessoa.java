package entities;

public abstract class Pessoa {
    protected String nome;
    protected double rendaAnual;

    public Pessoa(String nome, double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;

    }

    public Pessoa() {
        this("", 0.0);
    }

    public String getNome() {
        return this.nome;
    }

    public double getRendaAnual() {
        return this.rendaAnual;
    }

    public abstract double valorImposto();

    public String toString(){
        return getNome() + ", valor do imposto: R$ " + String.format("%.2f", valorImposto());
    }
}

