package br.com.fiap.bean;
//colocar a herança da classe
public class Retangulo extends Quadrado{ //Extends diz que a classe atual é filha da classe anterior. Nesse caso, retangulo é uma classe filha da classe quadrado.

    //Atributos
    private float altura;

    //construtor vazio
    public Retangulo(){}

    //construtor com passagem de parametro
    public Retangulo(float lado, float altura) {
        super.setLado(lado); //O super é usado para puxar o atributo pai para a classe filho, para que ele seja preenchido.
        this.altura = altura;
    }

    //Métodos getters e setters
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    //métodos da classe
    public float calcularArea(){
        return super.getLado() * altura;
    }
}
