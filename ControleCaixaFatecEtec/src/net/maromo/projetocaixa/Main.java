package net.maromo.projetocaixa;

import net.maromo.projetocaixa.visao.formControleCaixa;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame tela = new JFrame();
        tela.setContentPane(new formControleCaixa().getPanelCaixa());
        tela.setTitle("Controle de Caixa");
        tela.setSize(500, 450);
        tela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        tela.setVisible(true);

    }
}
