package br.com.fiap.main;

import br.com.fiap.bean.Quadrado;
import br.com.fiap.bean.Retangulo;
import br.com.fiap.bean.Triangulo;

import javax.swing.*;

public class Main {
    static void main() {
        String aux, escolha = "sim";
        float lado, altura, area;
        int opcao;
        while (escolha.equalsIgnoreCase("sim")){
            try {
                aux = JOptionPane.showInputDialog("Qual calculo deseja realizar?\n1-Quadrado\n2-Retangulo\n3-Triangulo\ninsira:");
                opcao = Integer.parseInt(aux);
                switch (opcao) {
                    case 1:
                        aux = JOptionPane.showInputDialog("Insira o valor dos lados");
                        lado = Float.parseFloat(aux);
                        Quadrado quad = new Quadrado(lado);
                        area = quad.calcularArea();
                        JOptionPane.showMessageDialog(null, String.format("Área do quadrado: %.1f", area));
                        break;
                    case 2:
                        aux = JOptionPane.showInputDialog("Digite o valor do lado");
                        lado = Float.parseFloat(aux);
                        aux = JOptionPane.showInputDialog("Digite a altura");
                        altura = Float.parseFloat(aux);
                        Retangulo retan = new Retangulo(lado, altura);
                        area = retan.calcularArea();
                        JOptionPane.showMessageDialog(null, String.format("Área do retangulo: %.1f", area));
                        break;
                    case 3:
                        aux = JOptionPane.showInputDialog("Digite o valor do lado");
                        lado = Float.parseFloat(aux);
                        aux = JOptionPane.showInputDialog("Digite o valor da altura: ");
                        altura = Float.parseFloat(aux);
                        Triangulo tri = new Triangulo(lado, altura);
                        area = tri.calcularArea();
                        JOptionPane.showMessageDialog(null, String.format("Área do triangulo: %.1f", area));
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opções inválidas!");
                }
                escolha = JOptionPane.showInputDialog("Deseja continuar(sim|não)?");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Fim do programa. Volte sempre!");
    }
}
