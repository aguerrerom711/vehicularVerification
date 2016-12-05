/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.ipn.cidetec.view;

import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 *
 * @author andres
 */
public class MainWindow extends JFrame{
    
    private String titleLabel;
    
    private final JPanel panel;
    
    private Form form;
    
    public MainWindow(){
        titleLabel = "Verificación Vehicular";
        super.setSize(750, 450);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel = new JPanel();
        
        super.add(panel);
        
        super.setVisible(Boolean.TRUE);
    }

    public String getTitleLabel() {
        return titleLabel;
    }

    public void setTitleLabel(String titleLabel) {
        this.titleLabel = titleLabel;
    }  
}
