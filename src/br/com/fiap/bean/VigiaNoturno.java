package br.com.fiap.bean;
//Associando a classe filho com pai
public class VigiaNoturno extends Funcionario{
    //Criando atributos
    private float adicionalNoturno;

    //Criando construtores
    public VigiaNoturno(){}
    public VigiaNoturno(String nome, float valorHoraTrabalho, float adicionalNoturno) {
        super(nome, valorHoraTrabalho);
        this.adicionalNoturno = adicionalNoturno;
    }

    //Criando getters e setters
    public float getAdicionalNoturno() {
        return adicionalNoturno;
    }
    public void setAdicionalNoturno(float adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }

    //Criando metodo
    public float calcularSalario() {
        return ((getValorHoraTrabalho() * 40) * 4 + adicionalNoturno);
    }
}
