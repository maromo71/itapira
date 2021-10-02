package net.maromo.projetocaixa.visao;

import net.maromo.projetocaixa.modelo.Caixa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class formControleCaixa {
    private JTextField txtValor;
    private JTextField txtSaldo;
    private JButton depositarButton;
    private JButton sacarButton;
    private JButton saldoButton;
    private JButton sairButton;
    private JTextArea txtMensagem;
    private JPanel panelCaixa;

    public Caixa caixa = new Caixa();

    public formControleCaixa() {
        depositarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               double valor = Double.parseDouble(txtValor.getText());
               boolean resposta = caixa.depositar(valor);
               if(resposta){
                   txtMensagem.append("Depósito feito: " + valor + "\n");
                   txtValor.setText(null);
               }else{
                   JOptionPane.showMessageDialog(null,
                           "Valor inválido para depósito",
                           "Erro",
                           JOptionPane.ERROR_MESSAGE);
               }
            }
        });
        saldoButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txtSaldo.setText(Double.toString(caixa.saldo));
            }
        });
        sacarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double valor = Double.parseDouble(txtValor.getText());
                boolean resposta = caixa.sacar(valor);
                if(resposta){
                    txtMensagem.append("Saque feito no valor: " + valor + "\n");
                    txtValor.setText(null);
                }else{
                    JOptionPane.showMessageDialog(null,
                            "Saldo insuficiente para saque",
                            "Erro",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        sairButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
    }

    public Container getPanelCaixa() {
        return panelCaixa;
    }
}
