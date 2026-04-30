package br.com.fiap.bean;

public class Funcionario {
    //Criando atributos
    private String nome;
    private float valorHoraTrabalho;

    //Criando construtores vázio e com parametros
    public Funcionario() {}
    public Funcionario(String nome, float valorHoraTrabalho) {
        this.nome = nome;
        this.valorHoraTrabalho = valorHoraTrabalho;
    }

    //Criando setters e getters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getValorHoraTrabalho() {
        return valorHoraTrabalho;
    }
    public void setValorHoraTrabalho(float valorHoraTrabalho) {
        this.valorHoraTrabalho = valorHoraTrabalho;
    }

    //Criando métodos
    public float calcularSalario(){
        return ((valorHoraTrabalho * 40) * 4);
    }
}
