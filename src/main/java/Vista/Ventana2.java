/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;


public class Ventana2 extends JFrame{
    private List<JPanel> jPanelList;
    private JPanel panelPrincipal;
    private JPanel subPanel;
    private List<JLabel> jLabelList;
    private JTextField jTextField;
    

    public Ventana2(){
        setTitle("Actualizacion de datos");
        setSize(700,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        iniciarComponentes();
        
    }
  

    private void iniciarComponentes(){
        crearPaneles();
        this.setContentPane(this.panelPrincipal);
        crearEtiquetas();

    }

    private void crearPaneles(){
        panelPrincipal = new JPanel();        
        subPanel = new JPanel();
        jPanelList = new ArrayList<>();
        

        for(int x=0;x<19;x++){
            jPanelList.add(new JPanel());
            
        }

        jPanelList.get(0).setBackground(Color.YELLOW);
        this.jPanelList.get(0).setBorder(new BevelBorder(BevelBorder.RAISED));
        panelPrincipal.setBackground(Color.WHITE);

        panelPrincipal.setLayout(new BorderLayout());
        
        this.panelPrincipal.add(this.subPanel, BorderLayout.CENTER);
        this.panelPrincipal.add(this.jPanelList.get(0), BorderLayout.NORTH);
        
        
        subPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED),"Datos personales",TitledBorder.LEFT, TitledBorder.DEFAULT_POSITION));        
        subPanel.setLayout(new GridLayout(9,2));

        
        
        //paneles 
        for(int i=1;i<19;i++){
            subPanel.add(this.jPanelList.get(i));
            
        }
       
      


    }

    private void crearEtiquetas(){
        jLabelList = new ArrayList<>();
        //Etiquetas
        
        jLabelList.add(new JLabel("DATOS PERSONALES:"));
        jLabelList.get(0).setForeground(Color.BLACK);
        jLabelList.get(0).setFont(new Font("Arial", Font.PLAIN, 20));

        
        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jLabelList.get(0).setHorizontalAlignment(SwingConstants.CENTER);
        this.jLabelList.get(0).setVerticalAlignment(SwingConstants.CENTER);
        
        
        //etiquetas
        jLabelList.add(new JLabel("Apellidos:"));
        jLabelList.add(new JLabel("Clavijo Marthell"));
        jLabelList.add(new JLabel("Nombre:"));
        jLabelList.add(new JLabel("Alex Daniel"));
        jLabelList.add(new JLabel("Nacionalidad:"));
        jLabelList.add(new JLabel("El Salvador"));
        jLabelList.add(new JLabel("Género:"));
        jLabelList.add(new JLabel("Aleatorio"));
        jLabelList.add(new JLabel("Correo:"));
        jLabelList.add(new JLabel("Alexpromaincra@yahoo.com"));
        jLabelList.add(new JLabel("Fecha de nacimiento:"));
        jLabelList.add(new JLabel("01-09-2003"));
        jLabelList.add(new JLabel("Telf:"));
        jLabelList.add(new JLabel("0732465557"));
        jLabelList.add(new JLabel("Celular:"));
        jLabelList.add(new JLabel("09567697986"));
        jLabelList.add(new JLabel("Whats App"));
        jTextField = new JTextField("",23);
        

   
        
        for(int i=1; i<18; i++){
            this.jPanelList.get(i).add(this.jLabelList.get(i));
                      
        }
        
        this.jPanelList.get(18).add(jTextField);
        
  
        




    }

    
}