
package exemploevento;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Ventana implements ActionListener {
    JFrame marco ;
    JPanel panel;
    JButton boton ;
    JLabel etiqueta;
    public void crearVentana(){
     marco = new JFrame(" eventos ");
     panel = new JPanel();
     boton = new JButton(" preme");
     etiqueta = new JLabel();
     
     marco.setSize(800, 800);
     panel.setSize(600, 600);
     boton.setSize(50,50);
     boton.setBackground(Color.yellow);
     panel.add(boton);
     panel.add(etiqueta);
     marco.add(panel);
     boton.addActionListener(new ActionListener(){
    
     public void actionPerformed(ActionEvent ae){
         etiqueta.setText("** etiqueta nunha clase anonima**");
         
     }  
    
    
    });
     
     
     marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     marco.setVisible(true);     
     
    
    }  

    @Override
    public void actionPerformed(ActionEvent ae) {
        etiqueta.setText(" ***** premiches o boton****");
    }
}
