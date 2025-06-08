package formSwing_Ativd;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class form extends JFrame {
    private JPanel panel;
    private JLabel titulo, tipoLabel, cpfLabel, fornLabel, nomeLabel, rgLabel, oxLabel, emailLabel, cepLabel, paisLabel,
            ufLabel, muniLabel, lograLabel, numLabel, comLabel, baiLabel, teleLabel, sitLabel;
    private JComboBox<String> tipoCombo;
    private JTextField cpfField, nomeField, rgField, oxField, emailField, cepField, paisField, ufField, ufFieldII,
            muniField, lograField, numField, comField, baiField, teleField;
    private JCheckBox c0, c1, c2;
    private JButton exButton, limButton, confButton;

    public form() {
        super("Cadastro de pessoa");
        tab();
    }

    private void tab() {// aba interior
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(250, 250, 250));

        // definição de cores
        Color borderColor = new Color(194, 194, 194);
        int borderThickness = 1;

        Color backgroundColor = new Color(255, 255, 255);

        Color colorPrimary = new Color(235, 113, 52);

        Color grey = new Color(230, 230, 230);

        // titulo
        titulo = new JLabel("Cadastro de Pessoa");
        titulo.setFont(new Font("Arial", Font.PLAIN, 48));
        titulo.setBounds(20, 20, 1000, 70);
        titulo.setForeground(colorPrimary);

        // tipo
        tipoLabel = new JLabel("Tipo");
        tipoLabel.setBounds(20, 100, 150, 25);
        tipoLabel.setBorder(BorderFactory.createLineBorder(borderColor, borderThickness));
        tipoLabel.setHorizontalAlignment(JLabel.CENTER);
        tipoLabel.setOpaque(true);
        tipoLabel.setBackground(backgroundColor);
        String[] tipos = { "fisica", "jurídica" };
        tipoCombo = new JComboBox<>(tipos);
        tipoCombo.setBounds(180, 100, 260, 25);
        tipoCombo.setBackground(backgroundColor);

        // cpf e cnpj
        cpfLabel = new JLabel("CPF / CNPJ");
        cpfLabel.setBounds(450, 100, 150, 25);
        cpfLabel.setBorder(BorderFactory.createLineBorder(borderColor, borderThickness));
        cpfLabel.setOpaque(true);
        cpfLabel.setBackground(backgroundColor);
        cpfLabel.setHorizontalAlignment(JLabel.CENTER);
        cpfField = new JTextField();
        cpfField.setBounds(610, 100, 260, 25);

        // fornecedor
        fornLabel = new JLabel("Fornecedor");
        fornLabel.setBounds(880, 100, 150, 25);
        fornLabel.setBorder(BorderFactory.createLineBorder(borderColor, borderThickness));
        fornLabel.setHorizontalAlignment(JLabel.CENTER);
        fornLabel.setOpaque(true);
        fornLabel.setBackground(backgroundColor);
        c0 = new JCheckBox();
        c0.setBounds(1040, 100, 100, 25);
        c0.setBackground(new Color(250, 250, 250));

        // nome
        nomeLabel = new JLabel("Nome");
        nomeLabel.setBounds(20, 130, 150, 25);
        nomeLabel.setBorder(BorderFactory.createLineBorder(borderColor, borderThickness));
        nomeLabel.setHorizontalAlignment(JLabel.CENTER); // Centraliza o texto
        nomeLabel.setOpaque(true);
        nomeLabel.setBackground(backgroundColor);
        nomeField = new JTextField();
        nomeField.setBounds(180, 130, 960, 25);

        // RG
        rgLabel = new JLabel("RG / inscrição Estadual");
        rgLabel.setBounds(20, 160, 150, 25);
        rgLabel.setBorder(BorderFactory.createLineBorder(borderColor, borderThickness));
        rgLabel.setHorizontalAlignment(JLabel.CENTER); // Centraliza o texto
        rgLabel.setOpaque(true);
        rgLabel.setBackground(backgroundColor);
        rgField = new JTextField();
        rgField.setBounds(180, 160, 260, 25);

        // orgão expeditor
        oxLabel = new JLabel("Orgão Expeditor");
        oxLabel.setBounds(450, 160, 150, 25);
        oxLabel.setBorder(BorderFactory.createLineBorder(borderColor, borderThickness));
        oxLabel.setHorizontalAlignment(JLabel.CENTER); // Centraliza o texto
        oxLabel.setOpaque(true);
        oxLabel.setBackground(backgroundColor);
        oxField = new JTextField();
        oxField.setBounds(610, 160, 530, 25);

        // email
        emailLabel = new JLabel("Email");
        emailLabel.setBounds(20, 190, 150, 25);
        emailLabel.setBorder(BorderFactory.createLineBorder(borderColor, borderThickness));
        emailLabel.setHorizontalAlignment(JLabel.CENTER); // Centraliza o texto
        emailLabel.setOpaque(true);
        emailLabel.setBackground(backgroundColor);
        emailField = new JTextField();
        emailField.setBounds(180, 190, 260, 25);

        // cep
        cepLabel = new JLabel("CEP");
        cepLabel.setBounds(450, 190, 150, 25);
        cepLabel.setBorder(BorderFactory.createLineBorder(borderColor, borderThickness));
        cepLabel.setHorizontalAlignment(JLabel.CENTER); // Centraliza o texto
        cepLabel.setOpaque(true);
        cepLabel.setBackground(backgroundColor);
        cepField = new JTextField();
        cepField.setBounds(610, 190, 530, 25);

        // país
        paisLabel = new JLabel("País");
        paisLabel.setBounds(20, 220, 150, 25);
        paisLabel.setBorder(BorderFactory.createLineBorder(borderColor, borderThickness));
        paisLabel.setHorizontalAlignment(JLabel.CENTER); // Centraliza o texto
        paisLabel.setOpaque(true);
        paisLabel.setBackground(backgroundColor);
        paisField = new JTextField("BRASIL");
        paisField.setBackground(grey);
        paisField.setBounds(180, 220, 260, 25);

        // UF
        ufLabel = new JLabel("UF ...");
        ufLabel.setBounds(450, 220, 150, 25);
        ufLabel.setBorder(BorderFactory.createLineBorder(borderColor, borderThickness));
        ufLabel.setHorizontalAlignment(JLabel.CENTER); // Centraliza o texto
        ufLabel.setOpaque(true);
        ufLabel.setBackground(backgroundColor);
        ufField = new JTextField();
        ufField.setBounds(610, 220, 260, 25);
        ufFieldII = new JTextField();
        ufFieldII.setBounds(880, 220, 260, 25);
        ufFieldII.setBackground(grey);

        // município
        muniLabel = new JLabel("Município");
        muniLabel.setBounds(20, 250, 150, 25);
        muniLabel.setBorder(BorderFactory.createLineBorder(borderColor, borderThickness));
        muniLabel.setHorizontalAlignment(JLabel.CENTER); // Centraliza o texto
        muniLabel.setOpaque(true);
        muniLabel.setBackground(backgroundColor);
        muniField = new JTextField();
        muniField.setBounds(180, 250, 960, 25);
        muniField.setBackground(grey); // ajustado para terminar em 1140

        // Logradouro
        lograLabel = new JLabel("Logradouro");
        lograLabel.setBounds(20, 280, 150, 25);
        lograLabel.setBorder(BorderFactory.createLineBorder(borderColor, borderThickness));
        lograLabel.setHorizontalAlignment(JLabel.CENTER); // Centraliza o texto
        lograLabel.setOpaque(true);
        lograLabel.setBackground(backgroundColor);
        lograField = new JTextField();
        lograField.setBounds(180, 280, 960, 25); // ajustado para terminar em 1140

        // Número
        numLabel = new JLabel("Número");
        numLabel.setBounds(20, 310, 150, 25);
        numLabel.setBorder(BorderFactory.createLineBorder(borderColor, borderThickness));
        numLabel.setHorizontalAlignment(JLabel.CENTER); // Centraliza o texto
        numLabel.setOpaque(true);
        numLabel.setBackground(backgroundColor);
        numField = new JTextField();
        numField.setBounds(180, 310, 260, 25);

        // Complemento
        comLabel = new JLabel("Complemento");
        comLabel.setBounds(450, 310, 150, 25);
        comLabel.setBorder(BorderFactory.createLineBorder(borderColor, borderThickness));
        comLabel.setHorizontalAlignment(JLabel.CENTER); // Centraliza o texto
        comLabel.setOpaque(true);
        comLabel.setBackground(backgroundColor);
        comField = new JTextField();
        comField.setBounds(610, 310, 530, 25); // ajustado para terminar em 1140

        // Bairro
        baiLabel = new JLabel("Bairro");
        baiLabel.setBounds(20, 340, 150, 25);
        baiLabel.setBorder(BorderFactory.createLineBorder(borderColor, borderThickness));
        baiLabel.setHorizontalAlignment(JLabel.CENTER); // Centraliza o texto
        baiLabel.setOpaque(true);
        baiLabel.setBackground(backgroundColor);
        baiField = new JTextField();
        baiField.setBounds(180, 340, 260, 25);

        // Telefone
        teleLabel = new JLabel("Telefone");
        teleLabel.setBounds(450, 340, 150, 25);
        teleLabel.setBorder(BorderFactory.createLineBorder(borderColor, borderThickness));
        teleLabel.setHorizontalAlignment(JLabel.CENTER); // Centraliza o texto
        teleLabel.setOpaque(true);
        teleLabel.setBackground(backgroundColor);
        teleField = new JTextField();
        teleField.setBounds(610, 340, 260, 25); // termina em 870

        // situação
        sitLabel = new JLabel("Situação");
        sitLabel.setBounds(880, 340, 90, 25);
        sitLabel.setBorder(BorderFactory.createLineBorder(borderColor, borderThickness));
        sitLabel.setHorizontalAlignment(JLabel.CENTER); // Centraliza o texto
        sitLabel.setOpaque(true);
        sitLabel.setBackground(backgroundColor);
        c1 = new JCheckBox("Ativo");
        c1.setBounds(980, 340, 80, 25);
        c1.setBackground(new Color(250, 250, 250));
        c2 = new JCheckBox("Inativo");
        c2.setBounds(1060, 340, 80, 25);
        c2.setBackground(new Color(250, 250, 250));

        // btn confirmar
        confButton = new JButton("Confirmar");
        confButton.setBounds(20, 380, 120, 30);
        confButton.setFont(new Font("Arial", Font.BOLD, 12));
        confButton.setBackground(colorPrimary);
        confButton.setForeground(backgroundColor);

        // btn excluir
        exButton = new JButton("Excluir");
        exButton.setBounds(160, 380, 120, 30);
        exButton.setBackground(colorPrimary);
        exButton.setForeground(backgroundColor);

        // btn limpar
        limButton = new JButton("Limpar");
        limButton.setBounds(300, 380, 120, 30);
        limButton.setBackground(grey);

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

        // funções
        confButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Confirmado!", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        
        // ação do botão limpar
        limButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Limpar todos os campos
                cpfField.setText("");
                nomeField.setText("");
                rgField.setText("");
                oxField.setText("");
                emailField.setText("");
                cepField.setText("");
                paisField.setText("BRASIL");
                ufField.setText("");
                ufFieldII.setText("");
                muniField.setText("");
                lograField.setText("");
                numField.setText("");
                comField.setText("");
                baiField.setText("");
                teleField.setText("");
                c0.setSelected(false);
                c1.setSelected(false);
                c2.setSelected(false);
            }
        });

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