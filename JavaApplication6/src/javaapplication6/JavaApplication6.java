/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Adrianvo
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String nombre = JOptionPane.showInputDialog("nombre");
        Random r = new Random();
        int azar = r.nextInt();
        System.out.println(azar+") hi GIT, I'm "+nombre);
        System.out.println("You have a nice day!");
    }
    
}
