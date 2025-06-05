import java.awt.*;
import javax.swing.*;

public class TelaLogin extends JFrame {
    public TelaLogin() {
        super("Login");
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        Font fonteTitulo = new Font("SansSerif", Font.BOLD, 20);
        Font fonteCampo = new Font("SansSerif", Font.PLAIN, 14);
        Color corFundo = new Color(245, 245, 255);

        JPanel painelPrincipal = new JPanel(new BorderLayout(10, 10));
        painelPrincipal.setBackground(corFundo);
        painelPrincipal.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel titulo = new JLabel("Bem-vindo!", SwingConstants.CENTER);
        titulo.setFont(fonteTitulo);
        painelPrincipal.add(titulo, BorderLayout.NORTH);

        JPanel painelCampos = new JPanel(new GridLayout(2, 2, 10, 10));
        painelCampos.setBackground(corFundo);
        JLabel lblUsuario = new JLabel("Usuário:");
        JLabel lblSenha = new JLabel("Senha:");
        JTextField campoUsuario = new JTextField();
        JPasswordField campoSenha = new JPasswordField();

        lblUsuario.setFont(fonteCampo);
        lblSenha.setFont(fonteCampo);
        campoUsuario.setFont(fonteCampo);
        campoSenha.setFont(fonteCampo);

        painelCampos.add(lblUsuario);
        painelCampos.add(campoUsuario);
        painelCampos.add(lblSenha);
        painelCampos.add(campoSenha);

        painelPrincipal.add(painelCampos, BorderLayout.CENTER);

        JButton btnEntrar = new JButton("Entrar");
        btnEntrar.setFont(fonteCampo);
        btnEntrar.addActionListener(e -> {
            String usuario = campoUsuario.getText();
            String senha = new String(campoSenha.getPassword());

            if (usuario.equals("admin") && senha.equals("123")) {
                JOptionPane.showMessageDialog(this, "Login bem-sucedido!");
                new TelaPrincipal();
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Usuário ou senha inválidos.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });

        JPanel painelBotao = new JPanel();
        painelBotao.setBackground(corFundo);
        painelBotao.add(btnEntrar);

        painelPrincipal.add(painelBotao, BorderLayout.SOUTH);

        setContentPane(painelPrincipal);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TelaLogin();
    }
}
