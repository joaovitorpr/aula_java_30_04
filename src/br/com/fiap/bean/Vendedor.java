package br.com.fiap.bean;
//Criando extend para associação
public class Vendedor extends Funcionario{
    //Criando atributos
    private float comissao;

    //Criando construtores
    public Vendedor(){}
    public Vendedor(String nome, float valorHoraTrabalho, float comissao) {
        super(nome, valorHoraTrabalho);
        this.comissao = comissao;
    }

    //Criano getters e setters
    public float getComissao() {
        return comissao;
    }
    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    //Criando metodo
    public float calcularSalario(){
        return (((getValorHoraTrabalho() * 40) * 4) * (1 + comissao/100));
        //Ou pode fazer igual isso: return super.calcularSalario() * (1 + comissao / 100);
    }
}
