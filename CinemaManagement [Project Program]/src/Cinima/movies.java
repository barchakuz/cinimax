/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cinima;

/**
 *
 * @author Barchakuz
 */
import java.awt.*;
 import javax.swing.*;
 import java.awt.event.*;
 class Imageslider extends JFrame  implements ActionListener
{
ImageIcon s[];
JLabel l;
JButton b1,b2,b3;
int i,l1;
JPanel p;
public Imageslider()
{
    setLayout(new BorderLayout( ));
    setSize(800, 700);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    JPanel p=new JPanel(new FlowLayout());
    b1=new JButton("<<");
    b2=new JButton(">>");
    b3=new JButton("Home");
    p.add(b1);
    p.add(b2);
    add(p,BorderLayout.SOUTH);
    b1.addActionListener(this);
    b2.addActionListener(this);
    s = new ImageIcon[14]; 
    s[0] = new ImageIcon("F:\\3rd semester\\OOP Lab\\Cinima\\Icons\\Form\\m1.JPG");
    s[1] = new ImageIcon("F:\\3rd semester\\OOP Lab\\Cinima\\Icons\\Form\\m2.JPG");
    s[2] = new ImageIcon("F:\\3rd semester\\OOP Lab\\Cinima\\Icons\\Form\\m3.JPG");
    s[3] = new ImageIcon("F:\\3rd semester\\OOP Lab\\Cinima\\Icons\\Form\\m4.JPG");
    s[5] = new ImageIcon("F:\\3rd semester\\OOP Lab\\Cinima\\Icons\\Form\\m5.JPG");
    s[6] = new ImageIcon("F:\\3rd semester\\OOP Lab\\Cinima\\Icons\\Form\\m6.JPG");
    s[7] = new ImageIcon("F:\\3rd semester\\OOP Lab\\Cinima\\Icons\\Form\\m7.JPG");
    s[8] = new ImageIcon("F:\\3rd semester\\OOP Lab\\Cinima\\Icons\\Form\\m8.JPG");
    s[9] = new ImageIcon("F:\\3rd semester\\OOP Lab\\Cinima\\Icons\\Form\\m9.JPG");
    s[10] = new ImageIcon("F:\\3rd semester\\OOP Lab\\Cinima\\Icons\\Form\\m10.JPG");
    s[11] = new ImageIcon("F:\\3rd semester\\OOP Lab\\Cinima\\Icons\\Form\\m11.JPG");
    s[12] = new ImageIcon("F:\\3rd semester\\OOP Lab\\Cinima\\Icons\\Form\\m12.JPG");
    s[13] = new ImageIcon("F:\\3rd semester\\OOP Lab\\Cinima\\Icons\\Form\\m13.JPG");
    
    
    l = new JLabel("",JLabel.CENTER); 
    add(l,BorderLayout.CENTER);
    l.setIcon(s[0]);
    
}
public  void actionPerformed(ActionEvent e)
{
    if(e.getSource()==b1)
    {
        if(i==0)
        {
            JOptionPane.showMessageDialog(null,"This is First Image");
        }
        else
            {
            i=i-1;
            l.setIcon(s[i]);
        }
    }
    if(e.getSource()==b2)
    {
        if(i==s.length-1)
        {
            JOptionPane.showMessageDialog(null,"This is LastImage");
        }
        else
            {
            i=i+1;
            l.setIcon(s[i]);
            }
        }
     }

 }
