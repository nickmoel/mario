package com.moeller.launchcode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Component
public class GUI extends JFrame{
    @Autowired
   public Stops stops;
    public Validation validation;// Tells the application context to inject an instance of Validation here



    public void run() {


            //Creating the Frame
            JFrame frame = new JFrame("METROLINK ARRIVAL TIMES");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 800);

            //Creating Panes and North, Center, South alignments
            JPanel p1=new JPanel();

            JPanel newPanel = new JPanel();


            newPanel.add(p1);


            JPanel p3=new JPanel();
            newPanel.add(p3);

            //P1 the North panel at top and adding components
            JLabel instruction = new JLabel("Input the number for the METROLINK STATION that you wish to see the next arrival time for");
            p1.add(instruction);

            //center in new pane
            JList list = new JList();
            list = new JList(stops.outputStations().toArray(new String[0]));
            newPanel.add(list);



            //P3 the panel at bottom and adding components

            JLabel label = new JLabel("Enter Station number");

            JTextField input = new JTextField(2); // accepts up to 2 characters


            p3.add(label); // Components Added using Flow Layout
            p3.add(input);


            JButton jb1 = new JButton("Get the Arrival Time");

            jb1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    String input1 = input.getText().toString();
                    int user_Input = Integer.parseInt(input1);

                    JOptionPane.showMessageDialog(null,validation.validate(user_Input));

                }
            });

            p3.add(jb1);

            //Adding Components to the frame.
            frame.getContentPane().add(BorderLayout.NORTH,p1);
            frame.getContentPane().add(BorderLayout.CENTER,newPanel);
            frame.getContentPane().add(BorderLayout.SOUTH, p3);
            input.requestFocus();

            frame.setVisible(true);
        }

}

