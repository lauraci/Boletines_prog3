package Boletin29;

import javax.swing.*;

public class Ventana {
    JFrame marco;
    JPanel panel;
    JLabel etiqueta1, etiqueta2;
    JTextField campoTexto1, campoTexto2;
    JComboBox cajaEleccion;
    JButton boton;
    JTable tabla;


    public void crearVentana(){
        marco= new JFrame();
        panel=new JPanel();
        etiqueta1= new JLabel("NOME");
        etiqueta2= new JLabel("APELIDO");
        campoTexto1=new JTextField();
        campoTexto2=new JTextField();
        cajaEleccion= new JComboBox<>();
        boton= new JButton("AGREGAR TABOA");
        tabla= new JTable(2,3);

        marco.setSize(650,650);
        panel.setSize(600,600);

        //etiquetas
        etiqueta1.setBounds(50, 50, 100,50);
        etiqueta2.setBounds(50, 100, 100,50);

        //campo de Texto
        campoTexto1.setBounds(125,60,200,25);
        campoTexto2.setBounds(125,110, 200,25);

        //cajaEleccion
        cajaEleccion.setBounds(400, 50, 100,50);
        cajaEleccion.addItem("DAM1");
        cajaEleccion.addItem("DAM2");
        cajaEleccion.addItem("DAW1");
        cajaEleccion.addItem("DAW2");

        //boton
        boton.setBounds(400,110, 150,50);

        //tabla
        tabla.setBounds(10,300, 550,200);

        //AÑADIMOS COMPONENTES
        panel.setLayout(null);
        panel.add(etiqueta1);
        panel.add(etiqueta2);
        panel.add(campoTexto1);
        panel.add(campoTexto2);
        panel.add(cajaEleccion);
        panel.add(boton);
        panel.add(tabla);

        marco.add(panel);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //cerramos la aplicación
        marco.setVisible(true);

    }
    
}
