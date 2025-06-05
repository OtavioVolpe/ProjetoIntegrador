import javax.swing.*;
import java.awt.*;

class TelaPrincipal extends JFrame {
    private DefaultListModel<Turma> ListModel = new DefaultListModel<>();
    private JList<Turma> listaTurmas = new JList<>(ListModel);
    private JTextArea areaAlunos = new JTextArea();

    public TelaPrincipal(){
        super("Tela Principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(500, 700);

        JLabel label = new JLabel("Lista de Turmas", JLabel.CENTER);
        label.setBounds(250, 30, 200, 30);
        add(label);
        JLabel lblTurma = new JLabel("Turmas");
        lblTurma.setBounds(120, 30, 200, 30);
        add(lblTurma);

        JScrollPane scrollPane = new JScrollPane(listaTurmas);
        scrollPane.setBounds(50, 60, 180, 400);
        listaTurmas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listaTurmas.addListSelectionListener(e -> {mostrarAlunos();});
        add (scrollPane);

        areaAlunos.setBounds(250, 60, 200, 400);
        add(areaAlunos);
        areaAlunos.setEditable(false);

        JButton botaoCurso = new JButton("Cadastrar Curso");
        botaoCurso.setBounds(50, 480, 160, 30);
        add(botaoCurso);
        JButton botaoAluno = new JButton("Cadastrar Aluno");
        botaoAluno.setBounds(250, 480, 160, 30);
        add(botaoAluno);

        botaoCurso.addActionListener(e -> cadastrarCurso());
        botaoAluno.addActionListener(e -> cadastrarAluno());

        setVisible(true);
    }

    private void cadastrarCurso() {
        JTextField campoNome = new JTextField();
        JTextField campoTermo = new JTextField();

        JPanel painel2 = new JPanel(new GridLayout(0, 2));
        painel2.add(new JLabel("Nome do Curso:"));
        painel2.add(campoNome);
        painel2.add(new JLabel("Termo:"));
        painel2.add(campoTermo);

        int resultado = JOptionPane.showConfirmDialog(this, painel2, "Cadastrar Curso",
                JOptionPane.OK_CANCEL_OPTION);

        if (resultado == JOptionPane.OK_OPTION) {
            String nome = campoNome.getText();
            String termo = campoTermo.getText();
            Turma turmanova = new Turma(nome, termo);
            ListModel.addElement(turmanova);


        }
    }

    private void cadastrarAluno() {
        Turma turmaSelecionada = listaTurmas.getSelectedValue();

        if (turmaSelecionada == null) {
            JOptionPane.showMessageDialog(this, "Selecione uma turma antes de cadastrar um aluno.");
            return;
        }

        JTextField campoNome = new JTextField();
        JTextField campoMatricula = new JTextField();

        JPanel painel = new JPanel(new GridLayout(0, 2));
        painel.add(new JLabel("Nome do Aluno:"));
        painel.add(campoNome);
        painel.add(new JLabel("Matrícula:"));
        painel.add(campoMatricula);

        int resultado = JOptionPane.showConfirmDialog(this, painel, "Cadastrar Aluno",
                JOptionPane.OK_CANCEL_OPTION);

        if (resultado == JOptionPane.OK_OPTION) {
            String nome = campoNome.getText();
            String matricula = campoMatricula.getText();

            Aluno novoAluno = new Aluno(nome, matricula);
            turmaSelecionada.adicionarAluno(novoAluno);

            mostrarAlunos();
        }
    }

    private void mostrarAlunos() {
        Turma turma = listaTurmas.getSelectedValue();
        if (turma != null) {
            StringBuilder texto = new StringBuilder("Alunos da Turma:\n");
            for (Aluno a : turma.getAlunos()) {
                texto.append("- ").append(a.getNome()).append(" (" + a.getMatricula() + ")\n");
            }
            areaAlunos.setText(texto.toString());
        } else {
            areaAlunos.setText("");
        }
    }
}
