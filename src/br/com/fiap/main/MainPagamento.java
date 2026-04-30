package br.com.fiap.main;

import br.com.fiap.bean.Funcionario;
import br.com.fiap.bean.Vendedor;
import br.com.fiap.bean.VigiaNoturno;

import javax.print.attribute.standard.JobOriginatingUserName;
import javax.swing.*;

public class MainPagamento {
    static void main() {
        String aux, nome, escolha = "sim";
        float calculo, valorhoratrabalho, adicionalnoturno, comissao;
        int opcoes;
        while (escolha.equalsIgnoreCase("sim")){
            try {
                aux = JOptionPane.showInputDialog("Qual tipo de funcionario deseja calcular o salário?\n1-Funcionario\n2-Vigia Noturno\n3-Vendedor\nInsira:");
                opcoes = Integer.parseInt(aux);
                switch (opcoes) {
                    case 1:
                        nome = JOptionPane.showInputDialog("Informe nome do funcionario: ");
                        aux = JOptionPane.showInputDialog("Digite as horas trabalhadas: ");
                        valorhoratrabalho = Float.parseFloat(aux);
                        Funcionario func = new Funcionario(nome, valorhoratrabalho);
                        calculo = func.calcularSalario();
                        JOptionPane.showMessageDialog(null, String.format("Nome: %s\nSalário atual: %.2f", func.getNome(), calculo));
                        break;
                    case 2:
                        nome = JOptionPane.showInputDialog("Informe nome do vigia noturno: ");
                        aux = JOptionPane.showInputDialog("Digite as horas trabalhadas: ");
                        valorhoratrabalho = Float.parseFloat(aux);
                        aux = JOptionPane.showInputDialog("Informe o adicional noturno");
                        adicionalnoturno = Float.parseFloat(aux);
                        VigiaNoturno hurhurhurhur = new VigiaNoturno(nome, valorhoratrabalho, adicionalnoturno);
                        calculo = hurhurhurhur.calcularSalario();
                        JOptionPane.showMessageDialog(null, String.format("Nome: %s\nSalário atual: %.2f",hurhurhurhur.getNome(), calculo));
                        break;
                    case 3:
                        nome = JOptionPane.showInputDialog("Informe nome do vendedor: ");
                        aux = JOptionPane.showInputDialog("Digite as horas trabalhadas: ");
                        valorhoratrabalho = Float.parseFloat(aux);
                        aux = JOptionPane.showInputDialog("Informe o valor de comissão: ");
                        comissao = Float.parseFloat(aux);
                        Vendedor vende = new Vendedor(nome, valorhoratrabalho, comissao);
                        calculo = vende.calcularSalario();
                        JOptionPane.showMessageDialog(null, String.format("Nome: %s\nSalário atual: %.2f", vende.getNome(), calculo));
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opções inválidas!");
                }
                escolha = JOptionPane.showInputDialog("Deseja continuar o programa (sim|não)?");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Programa encerrado!");
    }
}
