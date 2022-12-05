/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;



public class Ventana4 extends JFrame {
   private List<JPanel> jPanelList;
   private List<JButton> jButtonList;
   private List<JLabel> jLabelList;
   private List<JTextField> jTextFile;
   private List<JComboBox> jComboBox;
   
   
    public Ventana4() throws HeadlessException{
    this.setTitle("Datos de la informacion de carrera");
    this.setSize(600, 500);
    this.setLocation(200, 100);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.iniciarPaneles();
    this.iniciarJlabels(); 
    this.iniciarJComboBox();
    this.iniciarJButtons();
  
    
    this.setContentPane(this.jPanelList.get(0));
    this.setVisible(true);
            }
    public void iniciarPaneles(){
    this.jPanelList= new ArrayList<>();
    this.jPanelList.add(new JPanel());
    this.jPanelList.add(new JPanel());
    this.jPanelList.add(new JPanel());
    this.jPanelList.add(new JPanel());
    this.jPanelList.add(new JPanel());
    this.jPanelList.add(new JPanel());
    this.jPanelList.add(new JPanel());
    this.jPanelList.add(new JPanel());
    this.jPanelList.add(new JPanel());
    
    this.jPanelList.get(5).setBackground(Color.white);
    this.jPanelList.get(2).setBackground(Color.white);
    this.jPanelList.get(3).setBackground(Color.white);
    this.jPanelList.get(4).setBackground(Color.white);
    this.jPanelList.get(6).setBackground(Color.white);
    this.jPanelList.get(7).setBackground(Color.white);
    this.jPanelList.get(7).setBackground(Color.white);
    this.jPanelList.get(1).setBackground( Color.YELLOW);
    
    this.jPanelList.get(1).setBorder(new BevelBorder(BevelBorder.RAISED));
    
    
    this.jPanelList.get(0).setLayout( new GridLayout(8, 1));
    this.jPanelList.get(0).add(this.jPanelList.get(1));
    this.jPanelList.get(0).add(this.jPanelList.get(2));
    this.jPanelList.get(0).add(this.jPanelList.get(3));
    this.jPanelList.get(0).add(this.jPanelList.get(4));
    this.jPanelList.get(0).add(this.jPanelList.get(5));
    this.jPanelList.get(0).add(this.jPanelList.get(6));
    this.jPanelList.get(0).add(this.jPanelList.get(7));
    this.jPanelList.get(0).add(this.jPanelList.get(8));
    }
    public void iniciarJlabels(){
    this.jLabelList=new ArrayList<>();
    this.jLabelList.add(new JLabel("DATOS DE CARRERA"));
    this.jLabelList.add(new JLabel("Seleccione una Sede: "));
    this.jLabelList.add(new JLabel("CARRERA:"));
    this.jLabelList.add(new JLabel("MODALIDAD:"));
    this.jLabelList.add(new JLabel("Periodo academico:               2021-2022"));
    this.jLabelList.add(new JLabel("Fecha de registro:      15-10-2022 "));
    this.jLabelList.add(new JLabel("JORNADA:"));
    
    this.jLabelList.get(0).setFont(new Font("Arial",Font.PLAIN,20));
    this.jPanelList.get(1).add(this.jLabelList.get(0));
    
    this.jLabelList.get(4).setFont(new Font("Arial",Font.PLAIN,14));
    this.jPanelList.get(5).add(this.jLabelList.get(1));
    
    this.jLabelList.get(2).setFont(new Font("Arial",Font.PLAIN,14));
    this.jPanelList.get(3).add(this.jLabelList.get(2));
    
    this.jLabelList.get(3).setFont(new Font("Arial",Font.PLAIN,14));
    this.jPanelList.get(4).add(this.jLabelList.get(3));
    
    this.jLabelList.get(1).setFont(new Font("Arial",Font.PLAIN,14));
    this.jPanelList.get(2).add(this.jLabelList.get(4));
    
    this.jLabelList.get(6).setFont(new Font("Arial",Font.PLAIN,14));
    this.jPanelList.get(7).add(this.jLabelList.get(5));
    
    this.jLabelList.get(5).setFont(new Font("Arial",Font.PLAIN,14));
    this.jPanelList.get(6).add(this.jLabelList.get(6));
    
    
    }
    public void iniciarJButtons(){
    this.jButtonList=new ArrayList<>();
    
    this.jButtonList.add(new JButton("Siquiente:"));
    this.jPanelList.get(8).add(this.jButtonList.get(0));
    
    
    }
    public void iniciarJComboBox(){
    this.jComboBox = new ArrayList<>();
       String[] sedes=new String[3];
    sedes[0]="MATRIZ CUENCA";
    sedes[1]="MATRIZ GUAYAQUIL";
    sedes[2]="MATRIZ QUITO";

    this.jComboBox.add(new JComboBox(sedes));
    String[] tipodocuemntos= new String[4];
    tipodocuemntos[0]="ARQUITECTURA";
    tipodocuemntos[1]="INGENIERIA";
    tipodocuemntos[2]="DERECHO";
    tipodocuemntos[3]="ODONTOLOGIA";
    this.jComboBox.add(new JComboBox(tipodocuemntos));
    
    String[] modalidad=new String[2];
    modalidad[0]="Presencial";
    modalidad[1]="Virtual";
    this.jComboBox.add(new JComboBox(modalidad));
    
    String[] jornada=new String[2];
    jornada[0]="Diurna";
    jornada[1]="Nocturna";
    this.jComboBox.add(new JComboBox(jornada));
    
    
    
    
    this.jPanelList.get(5).add(this.jComboBox.get(0));
    this.jPanelList.get(3).add(this.jComboBox.get(1));
    this.jPanelList.get(4).add(this.jComboBox.get(2));
    this.jPanelList.get(6).add(this.jComboBox.get(3));

    
    
    }
    
    
    }

    
    