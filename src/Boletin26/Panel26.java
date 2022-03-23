package Boletin26;

import javax.swing.*;
import java.awt.*;

    public class Panel26 {
        JFrame marco;
        JPanel panel;
        JButton boton1, boton2;
        JLabel etiqueta1, etiqueta2;
        JTextField lineaTexto1, lineaTexto2;
        JTextArea areaTexto;


        public void crearPanel(){

            marco=new JFrame();
            panel=new JPanel();
            etiqueta1=new JLabel("NOME");
            etiqueta2=new JLabel("PASSWORD");
            lineaTexto1=new JTextField();
            lineaTexto2=new JTextField();
            areaTexto=new JTextArea("Area de Texto");
            boton1= new JButton("PREMER");
            boton2=new JButton("LIMPAR");


            //Le damos características a los componentessiiii

            panel.setLayout(null);
            marco.setSize(650,650);

            panel.setSize(600,600);

            //etiquetas
            etiqueta1.setBounds(100, 100, 100,50);
            etiqueta2.setBounds(100, 200, 100,50);

            //caja de Texto
            lineaTexto1.setSize(200, 50);
            lineaTexto1.setLocation(300, 100);
            lineaTexto2.setBounds(300, 200, 200, 50 );

            //area de texto
            areaTexto.setBounds(100, 300, 400, 120);


            //Boton1
            boton1.setBounds(100, 450 , 200,50);
            boton1.setBackground(Color.red);

            //Boton2
            boton2.setBounds(320, 450, 200,50);
            boton2.setBackground(Color.black);
            boton2.setToolTipText("Limpia el texto");

            //Añadimos componentes al panel y el panel al marco

            panel.setLayout(null); //poner nuestras coordenadas
            panel.add(etiqueta1);
            panel.add(etiqueta2);
            panel.add(lineaTexto1);
            panel.add(lineaTexto2);
            panel.add(boton1);
            panel.add(boton2);
            panel.add(areaTexto);

            marco.add(panel);
            marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //cerramos la aplicación
            marco.setVisible(true);
        }
    }

