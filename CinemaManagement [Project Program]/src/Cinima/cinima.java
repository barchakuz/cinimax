package Cinima;



import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class cinima implements ActionListener{

    public static void show() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextArea textarea = new JTextArea(2,10);
	
	JButton m0 =new JButton("   MOVIES   ");
	JButton m1 =new JButton("   TICKET   ");
	JButton m2 =new JButton("CONTACT");
	JButton m3 =new JButton();

	

	public cinima() throws IOException, URISyntaxException {
		frame.setSize(950, 2000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("SP20-BSE-057");
		
		frame.setResizable(true);
		frame.add(panel);
		
		panel.setBackground(Color.yellow);
		Border border = BorderFactory.createLineBorder(Color.BLACK, 4);
		
		panel.add(textarea);
		 
		textarea.setBackground(Color.black);
		Border tborder = BorderFactory.createLineBorder(Color.blue, 3);
		textarea.setBorder(tborder);
		Font font = new Font ("SansSerif", Font.BOLD,33);
		textarea.setFont(font);
		textarea.setForeground(Color.WHITE);
		textarea.setText("\n\t   Cinima Managment System "); 

		
		textarea.setPreferredSize(new Dimension(1020,150));
		textarea.setLineWrap(true);
		
		m0.setPreferredSize(new Dimension(300,60)); 
		m0.setFont(new Font("Arial", Font.PLAIN, 40));
		m0.setForeground(Color.black);
		m0.setBackground(Color.yellow);
		
		m1.setPreferredSize(new Dimension(300,60)); 
		m1.setFont(new Font("Arial", Font.PLAIN, 40));
		m1.setForeground(Color.black);
		m1.setBackground(Color.yellow); 
		
		m2.setPreferredSize(new Dimension(300,60)); 
		m2.setFont(new Font("Arial", Font.PLAIN, 40));
		m2.setForeground(Color.black);
		m2.setBackground(Color.yellow); 
		
		
		m3.setPreferredSize(new Dimension(950,450));
		m3.setIcon(new ImageIcon("F:\\3rd semester\\OOP Lab\\cinima\\Icons\\footer.jpg"));
		m3.setBackground(Color.yellow); 
		m3.setBorderPainted(false);
		
	
		panel.add(m0);
		panel.add(m1); 
		panel.add(m2);
		panel.add(m3);

		m1.addActionListener(new ActionListener (){
                    public void actionPerformed(ActionEvent e){
                    try{
                        String myurl = "https://forms.gle/w2pvQ966pk27Ud7b9";
                        java.awt.Desktop.getDesktop().browse(java.net.URI.create(myurl));
                    }
                    catch(Exception e2)
                    {
                    e2.printStackTrace();
                    }
                    }
                });
		m2.addActionListener(new ActionListener (){
                    public void actionPerformed(ActionEvent e){
                    try{
                        String myurl = "https://forms.gle/iR5zxTisHzB1CteFA";
                        java.awt.Desktop.getDesktop().browse(java.net.URI.create(myurl));
                    }
                    catch(Exception e2)
                    {
                    e2.printStackTrace();
                    }
                    }
                });
		m0.addActionListener(new ActionListener (){
                    public void actionPerformed(ActionEvent e){
                    try{
                         Imageslider obj = new Imageslider();
                    }
                    catch(Exception e2)
                    {
                    e2.printStackTrace();
                    }
                    }
                });
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


}
