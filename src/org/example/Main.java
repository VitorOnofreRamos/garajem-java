package org.example;

import org.example.garagem.Veiculos;
import org.example.garagem.Carro;
import org.example.garagem.Moto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var carro1 = new Carro();
        carro1.setMarca("Toyota");
        carro1.setModelo("Corolla");
        carro1.setAno(2013);
        carro1.setQuantidadeDePortas(4);

        carro1.Acelerar();
        carro1.AbrirPorta();

        var carro2 = new Carro();
        carro2.setMarca("Fiat");
        carro2.setModelo("Uno");
        carro2.setAno(1999);
        carro2.setQuantidadeDePortas(4);

        carro2.Acelerar();
        carro2.AbrirPorta();

        var moto1 = new Moto();
        moto1.setMarca("Suzuki");
        moto1.setModelo("GSX-S750");
        moto1.setAno(2017);
        moto1.setTipoDaMoto("Esportiva");

        moto1.Acelerar();
        moto1.Empinar();

        var carroCadastrado = CadastrarCarro();
        System.out.println(carroCadastrado.getModelo());

        carroCadastrado.Acelerar();
        carroCadastrado.AbrirPorta();

        var motoCadastrado = CadastrarMoto();
        System.out.println(motoCadastrado.getModelo());

        motoCadastrado.Acelerar();
        motoCadastrado.Empinar();
    }

    public static Carro CadastrarCarro() {
        var scanner = new Scanner(System.in);
        var novoCarro = new Carro();

        System.out.println("Marca");
        novoCarro.setMarca(scanner.nextLine());
        System.out.println("Modelo");
        novoCarro.setModelo(scanner.nextLine());
        System.out.println("Ano");
        novoCarro.setAno(scanner.nextInt());
        System.out.println("Portas");
        novoCarro.setQuantidadeDePortas(scanner.nextInt());
        System.out.println("Cadastro concluído " + novoCarro.toString());

        return novoCarro;
    }

    public static Moto CadastrarMoto() {
        var scanner = new Scanner(System.in);
        var novoMoto = new Moto();

        //Sempre Deixe o "nextInt por último
        System.out.println("Marca");
        novoMoto.setMarca(scanner.nextLine());
        System.out.println("Modelo");
        novoMoto.setModelo(scanner.nextLine());
        System.out.println("Tipo");
        novoMoto.setTipoDaMoto(scanner.nextLine());
        System.out.println("Ano");
        novoMoto.setAno(scanner.nextInt());
        System.out.println("Cadastro concluído " + novoMoto.toString());

        return novoMoto;
    }
}