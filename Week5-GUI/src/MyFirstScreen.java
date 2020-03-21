import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import javax.awt.event.JPanel;

public class MyFirstScreen extends JFrame implements ActionListener{

    // the attributes ussually equal the components that youll have on your screen

    JLabel  label1,label2;
    JButton button1,button2;
    JPanel  centrePanel,southPanel,northPanel;


    public MyFirstScreen(String MyTittle)
    {
        super(MyTittle);
        setSize(300, 300);
        label1= new JLabel("Java Screen Building");
        label2= new JLabel("Top of Screen");
        button1= new JButton("Click Me!!!");
        button2= new JButton("Then Me!!");
        button1.addActionListener(this);
        button2.addActionListener(this);


        centrePanel = new JPanel();
        southPanel  = new JPanel();
        northPanel  = new JPanel();

        centrePanel.add(label1);
        southPanel.add(button1);
        southPanel.add(button2);
        northPanel.add(label2);

        add(centrePanel, BorderLayout.CENTER);
        add(southPanel,  BorderLayout.SOUTH);
        add(southPanel,  BorderLayout.SOUTH);
        add(northPanel,  BorderLayout.NORTH);


        setVisible(true);

    }




    @Override
    public void actionPerformed(ActionEvent myEvent)
    {
        if (myEvent.getSource() == button1)
        {
            JOptionPane.showMessageDialog(this,"The button click worked");
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Its working!!1");
        }

    }




}
