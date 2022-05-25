/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio.aula5;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

/**
 *
 * @author guilh
 */
public class ExercicioAula5 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        JFrame application = new JFrame("um programa paint simples");
        
        PaintPanel panel = new PaintPanel();
        JPanel newPanel = new JPanel();
        JMenuBar menuBar = new JMenuBar();
        
        application.setJMenuBar(menuBar);
        
        JMenu menu = new JMenu("Arquivo");
        
        menuBar.add(menu);
        
        application.add(panel, BorderLayout.CENTER);
        
        application.add(new JLabel("arraste o mouse para desenhar"), BorderLayout.SOUTH);
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        application.setSize(1000, 1000);
        
        application.setVisible(true);
        
        
    }
}
