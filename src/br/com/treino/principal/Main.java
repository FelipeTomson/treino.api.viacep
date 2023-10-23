package br.com.treino.principal;

import br.com.treino.consulta.Consulta;
import br.com.treino.endereco.Endereco;
import br.com.treino.salvaCep.salvaCep;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Consulta consulta = new Consulta();
        System.out.println("Digite o cep que deseja buscar:");
        var cep = entrada.nextLine();

        try {
            Endereco novoEndereco = consulta.buscaCep(cep);
            System.out.println(novoEndereco);
            salvaCep salva = new salvaCep();
            salva.salvaJson(novoEndereco);
        }catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando o aplicativo");

        }
    }
}

