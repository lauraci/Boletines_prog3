package Boletin27;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Panel extends MouseAdapter {
        JFrame marco;
        JPanel panel,panel2;
        JButton boton1,boton2,boton3;
        JTextField textField1,textField2;
        JLabel label1,label2;
        JTextArea textArea,textArea2;

        public void crearVentana(){

            marco = new JFrame(" Boletin 27 ");
            // marco.setUndecorated(true);
            marco.setBounds(1200,50,600,800);
            marco.setLayout(null);


            panel = new JPanel();
            panel.setBounds(0,0,600,400);
            panel.setLayout(null);

            panel2 = new JPanel();
            panel2.setBounds(0,400,600,400);
            panel2.setLayout(null);

            //Panel1
            label1 = new JLabel("NOME");
            label1.setBounds(100,50,100,30);

            textField1 = new JTextField();
            textField1.setBounds(300,50,200,30);

            label2 = new JLabel("PASSWORD");
            label2.setBounds(100,150,100,30);

            textField2 = new JTextField();
            textField2.setBounds(300,150,200,30);


            boton1 = new JButton("PREMER");
            boton1.setBounds(100,300,100,50);

            boton2 = new JButton("LIMPAR");
            boton2.setBounds(400,300,100,50);
            boton2.setToolTipText("Limpiar texto");

            //Panel2
            textArea = new JTextArea();
            textArea.setBounds(50,50,200,200);
            textArea.setFont(new Font("Dialog", Font.BOLD, 18));

            textArea2 = new JTextArea();
            textArea2.setBounds(450,100,100,150);
            textArea2.setFont(new Font("Dialog", Font.BOLD, 18));

            boton3 = new JButton("FIESTAAA");
            boton3.setBounds(300,150,100,50);

            //add Panel1
            panel.add(label1);
            panel.add(label2);
            panel.add(textField1);
            panel.add(textField2);
            panel.add(boton1);
            panel.add(boton2);

            panel2.add(textArea);
            panel2.add(textArea2);
            panel2.add(boton3);

            marco.add(panel);
            marco.add(panel2);
            marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra Aplicacion cuando X;
            marco.setVisible(true);

            boton1.addMouseListener(this);
            boton2.addMouseListener(this);
            boton3.addMouseListener(this);
        }

        public void mousePressed(MouseEvent ev) {
            if(ev.getSource()==boton3){
                panel.setBackground(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
                panel2.setBackground(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
            }
            if(ev.getSource()==boton1){
                textArea.setText(textArea.getText()+ textField1.getText()+"\n");
            }

            if(ev.getSource()==boton2){
                textField1.setText("");
                textArea.setText("");
                textField2.setText("");
            }
        }

    }

