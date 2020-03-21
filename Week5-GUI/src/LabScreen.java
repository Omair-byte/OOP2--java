import javax.swing.*;

import java.awt.*;

import java.awt.BorderLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LabScreen extends JFrame implements ActionListener,MouseListener

{
    JTextField field1;
    JRadioButton radio1;
    JButton button1,button2;
    JLabel label1, label2,label3;
    JPanel centrePanel,southPanel,northPanel,westPanel;

    public LabScreen(String Lab)
    {
        super("This is my lab Screen ");
        setSize(450,450);

        field1 = new JTextField("Enter your Name");
        label1 = new JLabel("Java Screen building");
        label2 = new JLabel("Second Label of my making");
        label3 = new JLabel("The panel is in existance here");
        button1= new JButton("Click Me");
        button2 =new JButton("Second Button of my making");
        radio1 = new JRadioButton("First Radio");

        field1.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);


        westPanel = new JPanel();
        westPanel.setBackground(Color.RED);
        westPanel.addMouseListener(this);


        //the panel is set here
        centrePanel = new JPanel();
        southPanel = new JPanel();
        northPanel = new JPanel();


        centrePanel.add(radio1);
        centrePanel.add(label1);
        northPanel.add(label2);
        southPanel.add(button1);
        southPanel.add(button2);
        northPanel.add(field1);
        westPanel.add(label3);



        add(northPanel,BorderLayout.NORTH);
        add(centrePanel, BorderLayout.CENTER);
        add(southPanel, BorderLayout.SOUTH);
        add(southPanel, BorderLayout.SOUTH);
        add(westPanel, BorderLayout.WEST);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent LabEvent)
    {
        if(LabEvent.getSource() == button1) {
            JOptionPane.showMessageDialog(this, "You are amazing for clicking the first button");
        }
        if(LabEvent.getSource() == button2)
        {
            JOptionPane.showMessageDialog(this, "You won the lotto ");
        }
        if(LabEvent.getSource() == field1)
        {
            JOptionPane.showMessageDialog(this,"Your name is "+ field1.getText());
        }
    }



    public void mouseEntered(MouseEvent e)
    {
        if (e.getSource() == westPanel) {
            label3.setText("Mouse has entered the panel");
        }
    }

    public void mouseExited(MouseEvent e)
    {
        label3.setText("Mouse has exited the panel");
    }

    public void mouseClicked(MouseEvent e)
    {
        if (e.getButton() == 1) label3.setText("Mouse has left clicked the panel");
        else label3.setText("Mouse has right clicked the panel");
    }

    public void mouseReleased(MouseEvent e) { }
    public void mousePressed(MouseEvent e) { }
}
