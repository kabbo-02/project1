import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rejister extends JFrame implements ActionListener{
	JPanel panel;
	JLabel rnamelbl,rpasslbl,agelbl,rimgelbl;
	JTextField rnamefld;
	JPasswordField rpassfld;
	JButton rsgnbtn,rbackbtn,ragebtn;
	ImageIcon rimge;
	FrameDemo framedemo;

	public Rejister(FrameDemo fd){
		
		super("Registration");
		this.framedemo=fd;
		this.setSize(800,450);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		panel = new JPanel();
		panel.setLayout(null);
		
		rnamelbl=new JLabel("Name");
		rnamelbl.setBounds(150,50,100,50);
		panel.add(rnamelbl);
		
		rnamefld=new JTextField();
		rnamefld.setBounds(250,50,200,50);
		panel.add(rnamefld);
		
		rpasslbl=new JLabel("Password");
		rpasslbl.setBounds(150,150,100,50);
		panel.add(rpasslbl);
		
		rpassfld=new JPasswordField();
		rpassfld.setBounds(250,150,200,50);
		panel.add(rpassfld);
		
		rsgnbtn=new JButton("Sing Up");
		rsgnbtn.setBounds(250,250,100,50);
		panel.add(rsgnbtn);
		rsgnbtn.addActionListener(this);
		
		rbackbtn=new JButton("Exit");
		rbackbtn.setBounds(380,250,100,50);
		panel.add(rbackbtn);
		rbackbtn.addActionListener(this);
		
		
		rimge=new ImageIcon("gui image.jpg");
		rimgelbl=new JLabel(rimge);
		panel.add(rimgelbl);
		
		this.add(panel);
		this.setVisible(true);
	
	}
	
public void actionPerformed(ActionEvent ae){

    if(ae.getSource()==rsgnbtn){
        String name = rnamefld.getText();
        String pass = new String(rpassfld.getPassword());
        this.setVisible(false);
        framedemo.setVisible(true);

        //framedemo.namefld.setText(name);
       // framedemo.passfld.setText(pass);
    }
    else if(ae.getSource()==rbackbtn){
        this.setVisible(false);
        framedemo.setVisible(true);
    }
}

}