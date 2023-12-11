package br.com.alura.domain;

public class Pet {
    
    public Pet () { }
    
    public Pet (String tipo, String nome, String raca, int idade, String cor, Float peso){
        this.tipo = tipo;
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.cor = cor;
        this.peso = peso;
    }

    Long id;
    String tipo;
    String nome;
    String raca;
    int idade;
    String cor;
    Float peso;

    public Long getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public int getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    public Float getPeso() {
        return peso;
    }
}
