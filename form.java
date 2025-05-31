package formSwing_Ativd;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class form extends JFrame {
    private JPanel panel;
    private JLabel titulo, tipoLabel, cpfLabel, fornLabel, nomeLabel, rgLabel, oxLabel, emailLabel, cepLabel, paisLabel, ufLabel, muniLabel, lograLabel, numLabel, comLabel, baiLabel, teleLabel, sitLabel;
    private JComboBox<String> tipoCombo;
    private JTextField cpfField, nomeField, rgField, oxField, emailField, cepField, paisField, ufField, ufFieldII, muniField, lograField, numField, comField, baiField, teleField;
    private JCheckBox c0, c1, c2;
    private JButton exButton, limButton, confButton;

    public form() {
        super("Cadastro de pessoa");
        tab();
    }

    private void tab() {// aba interior
        panel = new JPanel();
        panel.setLayout(null);

        // titulo
        titulo = new JLabel("Cadastro de pessoa");
        titulo.setBounds(20, 10, 200, 25);

        // tipo
        tipoLabel = new JLabel("Tipo");
        tipoLabel.setBounds(20, 80, 150, 25);
        tipoLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        String[] tipos = { "fisica", "jurídica" };
        tipoCombo = new JComboBox<>(tipos);
        tipoCombo.setBounds(180, 80, 260, 25);

        // cpf e cnpj
        cpfLabel = new JLabel("CPF / CNPJ");
        cpfLabel.setBounds(450, 80, 150, 25);
        cpfLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        cpfField = new JTextField();
        cpfField.setBounds(610, 80, 260, 25);

        // fornecedor 
        fornLabel = new JLabel("Fornecedor");
        fornLabel.setBounds(880, 80, 150, 25);
        fornLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        c0 = new JCheckBox();
        c0.setBounds(1040, 80, 100, 25);

        // nome
        nomeLabel = new JLabel("Nome");
        nomeLabel.setBounds(20, 110, 150, 25);
        nomeLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        nomeField = new JTextField();
        nomeField.setBounds(180, 110, 960, 25);

        // RG
        rgLabel = new JLabel("RG / inscrição Estadual");
        rgLabel.setBounds(20, 140, 150, 25);
        rgLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        rgField = new JTextField();
        rgField.setBounds(180, 140, 260, 25);  

        // orgão expeditor
        oxLabel = new JLabel("Orgão Expeditor");
        oxLabel.setBounds(450, 140, 150, 25);
        oxLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        oxField = new JTextField();
        oxField.setBounds(610, 140, 530, 25);  

        // email
        emailLabel = new JLabel("Email");
        emailLabel.setBounds(20, 170, 150, 25);
        emailLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        emailField = new JTextField();
        emailField.setBounds(180, 170, 260, 25); 

        // cep
        cepLabel = new JLabel("CEP");
        cepLabel.setBounds(450, 170, 150, 25);
        cepLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        cepField = new JTextField();
        cepField.setBounds(610, 170, 530, 25);  

        // país
        paisLabel = new JLabel("País");
        paisLabel.setBounds(20, 200, 150, 25);
        paisLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        paisField = new JTextField("BRASIL");
        paisField.setBounds(180, 200, 260, 25); 

        // UF
        ufLabel = new JLabel("UF");
        ufLabel.setBounds(450, 200, 150, 25);
        ufLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        ufField = new JTextField();
        ufField.setBounds(610, 200, 260, 25);  
        ufFieldII = new JTextField();
        ufFieldII.setBounds(880, 200, 260, 25); 

        // município
        muniLabel = new JLabel("Município");
        muniLabel.setBounds(20, 230, 150, 25);
        muniLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        muniField = new JTextField();
        muniField.setBounds(180, 230, 960, 25); // ajustado para terminar em 1140

        // Logradouro
        lograLabel = new JLabel("Logradouro");
        lograLabel.setBounds(20, 260, 150, 25);
        lograLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lograField = new JTextField();
        lograField.setBounds(180, 260, 960, 25); // ajustado para terminar em 1140

        // Número
        numLabel = new JLabel("Número");
        numLabel.setBounds(20, 290, 150, 25);
        numLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        numField = new JTextField();
        numField.setBounds(180, 290, 260, 25);  

        // Complemento
        comLabel = new JLabel("Complemento");
        comLabel.setBounds(450, 290, 150, 25);
        comLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        comField = new JTextField();
        comField.setBounds(610, 290, 530, 25); // ajustado para terminar em 1140

        // Bairro
        baiLabel = new JLabel("Bairro");
        baiLabel.setBounds(20, 320, 150, 25);
        baiLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        baiField = new JTextField();
        baiField.setBounds(180, 320, 260, 25);

        // Telefone
        teleLabel = new JLabel("Telefone");
        teleLabel.setBounds(450, 320, 150, 25);
        teleLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        teleField = new JTextField();
        teleField.setBounds(610, 320, 260, 25); // termina em 870

        // situação
        sitLabel = new JLabel("Situação");
        sitLabel.setBounds(880, 320, 90, 25);
        sitLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        c1 = new JCheckBox("Ativo");
        c1.setBounds(980, 320, 80, 25);
        c2 = new JCheckBox("Inativo");
        c2.setBounds(1060, 320, 80, 25);

        //btn confirmar
        confButton = new JButton("confirmar");
        confButton.setBounds(20, 360, 120, 30);

        //btn excluir
        exButton = new JButton("Excluir");
        exButton.setBounds(160, 360, 120, 30);

        //btn limpar
        limButton = new JButton("Limpar");
        limButton.setBounds(300, 360, 120, 30);

        panel.add(titulo);
        panel.add(tipoLabel);
        panel.add(tipoCombo);
        panel.add(cpfLabel);
        panel.add(cpfField);
        panel.add(fornLabel);
        panel.add(c0);
        panel.add(nomeLabel);
        panel.add(nomeField);
        panel.add(rgLabel);
        panel.add(rgField);
        panel.add(oxLabel);
        panel.add(oxField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(cepLabel);
        panel.add(cepField);
        panel.add(paisLabel);
        panel.add(paisField);
        panel.add(ufLabel);
        panel.add(ufField);
        panel.add(ufFieldII);
        panel.add(muniLabel);
        panel.add(muniField);
        panel.add(lograLabel);
        panel.add(lograField);
        panel.add(numLabel);
        panel.add(numField);
        panel.add(comLabel);
        panel.add(comField);
        panel.add(baiLabel);
        panel.add(baiField);
        panel.add(teleLabel);
        panel.add(teleField);
        panel.add(sitLabel);
        panel.add(c1);
        panel.add(c2);
        panel.add(confButton);
        panel.add(limButton);
        panel.add(exButton);

        //funções
        confButton.addActionListener(ActionEvent e){
            
        }

        this.setContentPane(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1200, 550); // Aumentado largura para 1200 para acomodar os checkboxes
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new form();
    }
}