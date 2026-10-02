import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.BevelBorder;


public class FrameDemo extends JFrame implements MouseListener,ActionListener{
	JPanel panel;
	JLabel namelbl,passlbl,imgelbl;
	JTextField namefld;
	JPasswordField passfld;
	JButton lgnbtn,sgnbtn,backbtn;
	Color mycolor,mycolor1,mycolor2;
	Font myfont;
	ImageIcon imge;
	
	public FrameDemo(String name, String pass){
    this(); 
    namefld.setText(name);
    passfld.setText(pass);
}
	
	public FrameDemo(){
		super("GUIPROJECT");
		this.setSize(800,450);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	

		
		mycolor=new Color(227,106,224);
		mycolor1=new Color(128,234,255);
		mycolor2=new Color(169,255,134);
		myfont=new Font("Times New Roman",Font.PLAIN,24);
		
		
		panel = new JPanel();
		panel.setLayout(null);
		
		namelbl=new JLabel("Name");
		namelbl.setBounds(150,50,100,50);
		namelbl.setFont(myfont);
		panel.add(namelbl);
		namefld=new JTextField();
		namefld.setBounds(250,50,200,50);
		panel.add(namefld);
		
		passlbl=new JLabel("Password");
		passlbl.setBounds(150,150,100,50);
		passlbl.setFont(myfont);
		panel.add(passlbl);
		
		passfld=new JPasswordField();
		passfld.setBounds(250,150,200,50);
		panel.add(passfld);
		
		lgnbtn=new JButton("Log in");
		lgnbtn.setBounds(120,250,100,50);
		lgnbtn.setBackground(mycolor);
		lgnbtn.setForeground(Color.BLACK);
		lgnbtn.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		panel.add(lgnbtn);
		lgnbtn.addMouseListener(this);
		lgnbtn.addActionListener(this);
		panel.add(lgnbtn);
		
		sgnbtn=new JButton("Sign Up");
		sgnbtn.setBounds(250,250,100,50);
		sgnbtn.setBackground(mycolor1);
		sgnbtn.setForeground(Color.BLACK);
		sgnbtn.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		panel.add(sgnbtn);
		sgnbtn.addMouseListener(this);
		sgnbtn.addActionListener(this);
		
		backbtn=new JButton("Exit");
		backbtn.setBounds(380,250,100,50);
		backbtn.setBackground(mycolor2);
		backbtn.setForeground(Color.BLACK);
		backbtn.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		panel.add(backbtn);
		backbtn.addMouseListener(this);
		backbtn.addActionListener(this);
		
		imge=new ImageIcon("GIF.gif");
		imgelbl=new JLabel(imge);
		imgelbl.setBounds(0,0,800,450);
		panel.add(imgelbl);
		panel.setComponentZOrder(imgelbl,panel.getComponentCount()-1);
		this.add(panel);
	}

public void mouseClicked(MouseEvent me){}
public void mousePressed(MouseEvent me){}
public void mouseReleased(MouseEvent me){}
public void mouseEntered(MouseEvent me){
	
		if(me.getSource()==lgnbtn){
		lgnbtn.setBackground(Color.WHITE);
		lgnbtn.setForeground(Color.BLACK);
	}
	else if(me.getSource()==sgnbtn){
		sgnbtn.setBackground(Color.PINK);
		sgnbtn.setForeground(Color.BLACK);
	}
	else if(me.getSource()==backbtn){
		backbtn.setBackground(Color.YELLOW);
		backbtn.setForeground(Color.BLACK);
	}
	}
		
public void mouseExited(MouseEvent me){
	if(me.getSource()==lgnbtn){
		lgnbtn.setBackground(mycolor);
		lgnbtn.setForeground(Color.BLACK);
	}
	else if(me.getSource()==sgnbtn){
		sgnbtn.setBackground(mycolor1);
		sgnbtn.setForeground(Color.BLACK);
	}
	else if(me.getSource()==backbtn){
		backbtn.setBackground(mycolor2);
		backbtn.setForeground(Color.BLACK);
	}
}
public void actionPerformed(ActionEvent ae){
	if(ae.getSource()==sgnbtn){
		this.setVisible(false);
		Rejister r1=new Rejister(this);
		r1.setVisible(true);
	}
	else if(ae.getSource() == backbtn){
        System.exit(0);
}
 if(ae.getSource()==lgnbtn){
	String name=namefld.getText();
	String pass = new String(passfld.getPassword());
	
	 if(name.isEmpty() || pass.isEmpty()){
		JOptionPane.showMessageDialog(this,"fill up boxes");
	}
	else {
		HomePage home=new HomePage();
		home.setVisible(true);
		this.setVisible(false);
	}		
}
}
}
	