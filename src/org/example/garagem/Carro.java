package org.example.garagem;

public class Carro extends Veiculos{
    private int quantidadeDePortas;

    public Carro(){}

    public Carro(int quantidadeDePortas) {
        this.quantidadeDePortas = quantidadeDePortas;
    }

    public Carro(String marca, String modelo, int ano, int quantidadeDePortas) {
        super(marca, modelo, ano);
        this.quantidadeDePortas = quantidadeDePortas;
    }

    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }

    public void setQuantidadeDePortas(int quantidadeDePortas) {
        this.quantidadeDePortas = quantidadeDePortas;
    }

    @Override
    public void Acelerar(){
        super.Acelerar();
        super.getModelo();
        System.out.println("O carro " + getModelo() + " está Acelerando");
    }

    public void AbrirPorta(){
        super.getModelo();
        System.out.println("Abrindo "+ quantidadeDePortas + " portas do " + getModelo() );
    }
}
