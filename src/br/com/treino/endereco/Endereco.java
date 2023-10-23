package br.com.treino.endereco;
public record Endereco(String cep, String logradouro, String complemento,
     String bairro, String localidade, String uf, String ibge,
     String gia, String ddd, String siafi){

    public void write(String toJson) {
    }
}