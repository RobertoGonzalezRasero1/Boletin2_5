/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_5;

import javax.swing.JOptionPane;

/**
 *
 * @author rgonzalezrasero
 */
public class Boletin2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float milla=1852;
       float metros;
       float distancia;
        metros = Float.parseFloat(JOptionPane.showInputDialog("Metros"));
        distancia = metros * milla;
        JOptionPane.showMessageDialog(null, "distancia = "+distancia);
                
    }
    
}
