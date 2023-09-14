package org.example.garagem;

public class Veiculos {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculos(){}

    public Veiculos(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Veiculos{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                '}';
    }

    public void Acelerar(){
        System.out.println("O " + modelo + " está acelerando.");
    }

    public void Freiar(){
        System.out.println("O " + modelo + " está freiando");
    }
}
