package com.moeller.launchcode;

import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

@Component

public class StartScreen {
    public StartScreen(){



        }

    public void  build(){
        // Define frame, label and panel

        JFrame frame = new JFrame("Hello Swing");

        JLabel label = new JLabel("I'm a JLabel", JLabel.CENTER);

        JPanel panel = new JPanel();

        JTextField userInput = new JTextField("Station Selection");


        // Setting for the panel

        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);

        panel.setLayout(boxlayout);

        panel.setBorder(new EmptyBorder(new Insets(45, 70, 45, 70)));


        // Define new buttons

        JButton jb1 = new JButton("Button 1");

        JButton jb2 = new JButton("Button 2");

        JButton jb3 = new JButton("Button 3");



        // Add buttons to the frame (and spaces between buttons)

        panel.add(jb1);

        panel.add(jb2);

        panel.add(jb3);

        panel.add(userInput);

        // Add the label and panel to the frame

        frame.setLayout(new GridLayout(2, 1));

        frame.add(label);

        frame.add(panel);



        // Settings for the frame

        frame.pack();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);


    }
//    public class txtInputListener implements ActionListener    {
//        public void actionPerformed(ActionEvent event)
//        {
//            input = user.getText();   //receive input from text field
//            System.out.println(input);
//        }
//    }
    }
//        JFrame frame = new JFrame();
//        frame.add( new JLabel(" Outout" ), BorderLayout.NORTH );
//
//        JTextArea ta = new JTextArea();
//        TextAreaOutputStream taos = new TextAreaOutputStream( ta, 60 );
//        PrintStream ps = new PrintStream( taos );
//        System.setOut( ps );
//        System.setErr( ps );
//
//
//        frame.add( new JScrollPane( ta )  );
//
//        frame.pack();
//        frame.setVisible( true );
//        frame.setSize(800,600);
//
//        for( int i = 0 ; i < 100 ; i++ ) {
//            System.out.println( i );
//            Thread.sleep( 500 );
//        }
//    }
//}
