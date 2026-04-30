package br.com.fiap.bean;
//Colocando herança
public class Triangulo extends Quadrado{

    //Criando Atributo
    public float altura;

    //Criando construtores
    public Triangulo(){} //vázio
    public Triangulo(float lado, float altura) {//passagem de parametro
        super(lado); //equivalente ao super.setLado(lado).
        this.altura = altura;
    }

    //Criando métodos getters e setters
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    //Criando metodo
    public float calcularArea() {
        return super.getLado() * altura / 2;
    }
}
