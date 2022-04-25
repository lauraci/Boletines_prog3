package Boletin29;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventanita implements ActionListener {

        JFrame ventana;
        JPanel panel;
        JLabel nombrecito, apellido, nombre, apellidito,curso;
        JTextField tnome, tapellido;
        JComboBox<String> clases;
        JButton agregar;



        String [] columnas={"Nombre","Apellido","Curso"};
        DefaultTableModel modelo = new DefaultTableModel();

        JTable tabla = new JTable (modelo);



        public void run(){

            ventana = new JFrame();
            ventana.setBounds(1200,50,600,600);
            ventana.setLayout(null);

            panel = new JPanel();
            panel.setBounds(0,0,600,600);
            panel.setLayout(null);

            nombre = new JLabel("NOME");
            nombre.setBounds(40,40,100,30);

            tnome = new JTextField();
            tnome.setBackground(new Color(254,254,254));
            tnome.setBounds(150,40,180,30);

            clases = new JComboBox<String>();
            clases.addItem("DAM1");
            clases.addItem("DAM2");
            clases.addItem("ASIR1");
            clases.addItem("ASIR2");
            clases.setBackground(new Color(254,254,254));
            clases.setBounds(380,40,180,30);

            apellido = new JLabel("APELLIDO");
            apellido.setBounds(40,140,100,30);
            apellido.setBackground(Color.orange);

            tapellido = new JTextField();
            tapellido.setBackground(new Color(254,254,254));
            tapellido.setBounds(150,140,180,30);

            agregar = new JButton("AGREGAR TABOA");
            agregar.setBounds(380,140,180,30);

            tabla.setBounds(50,250,500,270);
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Curso");
            modelo.setColumnIdentifiers(columnas);


            nombrecito = new JLabel("         Nombre");
            nombrecito.setBounds(50,220,160,30);
            nombrecito.setBackground(new Color(133, 133, 133));
            nombrecito.setOpaque(true);



            apellidito = new JLabel("         Apellido");
            apellidito.setBounds(220,220,160,30);
            apellidito.setBackground(new Color(133,133,133));
            apellidito.setOpaque(true);

            curso = new JLabel("        Curso");
            curso.setBounds(390,220,160,30);
            curso.setBackground(new Color(133,133,133));
            curso.setOpaque(true);


            panel.add(nombre);
            panel.add(apellidito);
            panel.add(curso);
            panel.add(nombrecito);
            panel.add(tnome);
            panel.add(clases);
            panel.add(apellido);
            panel.add(tapellido);
            panel.add(agregar);
            panel.add(tabla);


            ventana.add(panel);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra Aplicacion cuando X;
            ventana.setVisible(true);

            agregar.addActionListener(this);

        }

        @Override
        public void actionPerformed(ActionEvent e) {

            //panel.setBackground(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
            if(e.getSource()==agregar){
                modelo.addRow(new Object[]{tnome.getText(),tapellido.getText(),clases.getSelectedItem()});

            }
        }
    }

