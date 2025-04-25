import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            JFrame janela = new JFrame();
            janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            janela.setSize(500, 500);
            janela.setLayout(null);

            JLabel label = new JLabel("UnniPlanning");
            label.setBounds(210, -240, 500, 500);

            JLabel label2 = new JLabel("Seleção de Função");
            label2.setBounds(195, -200, 500, 500);

            String[] funcao = {"Aluno", "Professor"};
            JComboBox<String> funcoes = new JComboBox(funcao);
            funcoes.setBounds(200, 80, 100, 25);
            JButton botao = new JButton("Selecionar");
            botao.setBounds(200, 150, 100, 25);



            janela.add(label);
            janela.add(label2);
            janela.add(funcoes);
            janela.add(botao);

            janela.setVisible(true);
    }
}