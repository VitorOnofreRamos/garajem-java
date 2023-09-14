package org.example.garagem;

public class Moto extends Veiculos{
    private String tipoDaMoto;

    public Moto(){}

    public Moto(String tipoDaMoto) {
        this.tipoDaMoto = tipoDaMoto;
    }

    public Moto(String marca, String modelo, int ano, String tipoDaMoto) {
        super(marca, modelo, ano);
        this.tipoDaMoto = tipoDaMoto;
    }

    public String getTipoDaMoto() {
        return tipoDaMoto;
    }

    public void setTipoDaMoto(String tipoDaMoto) {
        this.tipoDaMoto = tipoDaMoto;
    }

    public void Acelerar(){
        super.Acelerar();
        super.getModelo();
        System.out.println("A moto " + getModelo() + " está Acelerando");
    }

    public void Empinar(){
        super.getModelo();
        System.out.println("A moto " + getModelo() + " do tipo " + tipoDaMoto + " está empinando");
    }
}
