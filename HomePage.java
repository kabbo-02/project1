import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class HomePage extends JFrame implements ActionListener{
	JLabel bgLabel, teamlbl,pricelbl,imglbl;
	JPanel panel;
	JComboBox<String> jerseyBox;
	JRadioButton s,m,l,xl;
	ButtonGroup sizeGroup;
	JButton viewbtn;
	JButton orderbtn,backBtn;
	ImageIcon bgImage;
	public HomePage(){
		super("Jersey Page");
		this.setSize(800,450);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
	    panel = new JPanel();
		panel.setLayout(null);
		
		String[] jerseys={"Select jersey",
		"Argentina",
		"Brazil",
		"Barcelona",
		"Real Madrid",
		"LiverPool",
		"Manchester City",
        "Manchester United",
        "Arsenal",
        "Chelsea",
        "Tottenham"};
		jerseyBox=new JComboBox(jerseys);
		jerseyBox.setBounds(50,50,200,30);
		panel.add(jerseyBox);
		
		
		s=new JRadioButton("S");
		s.setBounds(50,100,50,30);
		panel.add(s);
		
		m=new JRadioButton("M");
		m.setBounds(110,100,50,30);
		panel.add(m);
		
		l=new JRadioButton("L");
		l.setBounds(170,100,50,30);
		panel.add(l);
		
		xl=new JRadioButton("XL");
		xl.setBounds(230,100,50,30);
		panel.add(xl);
		
		sizeGroup=new ButtonGroup();
		sizeGroup.add(s);
		sizeGroup.add(m);
		sizeGroup.add(l);
		sizeGroup.add(xl);
		
		teamlbl=new JLabel("Team");
		teamlbl.setBounds(50,150,300,30);
		panel.add(teamlbl);
		
		pricelbl=new JLabel("Price");
		pricelbl.setBounds(50,190,300,30);
		panel.add(pricelbl);
		
		
		orderbtn = new JButton("Place Order");
        orderbtn.setBounds(220, 240, 150, 35); 
        orderbtn.addActionListener(this);
        panel.add(orderbtn);

        backBtn = new JButton("Back");
        backBtn.setBounds(50, 290, 150, 35); 
        backBtn.addActionListener(this);
        panel.add(backBtn);

		
		//bgImage=new ImageIcon("IMAGEFILEkl.jpg");
		//bgLabel =new JLabel(bgImage);
		//bgLabel.setBounds(0,0,800,450);
		//panel.add(bgLabel);
		
		imglbl=new JLabel();
		imglbl.setBounds(300,0,400,350);
		panel.add(imglbl);
		
		bgImage=new ImageIcon("WHITE.jpg");
		bgLabel =new JLabel(bgImage);
		bgLabel.setBounds(0,0,800,450);
		panel.add(bgLabel);

		
		viewbtn=new JButton("View Details");
		viewbtn.setBounds(50,240,150,35);
		viewbtn.addActionListener(this);
		panel.add(viewbtn);
		this.add(panel);
		
		//bgImage=new ImageIcon("IMAGEFILE.jpg");
		//bgLabel =new JLabel(bgImage);
		//bgLabel.setBounds(0,0,800,450);
		//panel.add(bgLabel);
		
	}
	
	private void setImage(String path){
		ImageIcon icon= new ImageIcon(path);
		Image img=icon.getImage();
		Image scaledImg=img.getScaledInstance(
		imglbl.getWidth(),
		imglbl.getHeight(),
	    Image.SCALE_SMOOTH
		);
		imglbl.setIcon(new ImageIcon(scaledImg));
		
	}
	

public void actionPerformed(ActionEvent ae) {

   
    String jerseyName = (String) jerseyBox.getSelectedItem();

   
    if(ae.getSource() == viewbtn){

        if("Select jersey".equals(jerseyName)){
            JOptionPane.showMessageDialog(this, "Please select a jersey");
            return;
        }

        Jersey jersey = OrderManager.getJersey(jerseyName);
        if(jersey != null){
          
            teamlbl.setText("Team: " + jersey.getTeam());
            pricelbl.setText("Price: " + jersey.getPrice() + " BDT");

            
            if(jerseyName.equals("Argentina"))

				setImage("argentinajersey.jpg");
				
            else if(jerseyName.equals("Brazil"))

				setImage("brazil.jpg");
				
            else if(jerseyName.equals("Barcelona"))

				setImage("barcelona.jpg");
				
            else if(jerseyName.equals("Real Madrid"))

				setImage("realmadridjersey.jpg");
				
            else if(jerseyName.equals("LiverPool")) 
				
			setImage("liverpooljersey.jpg");
			
			else if(jerseyName.equals("Manchester City")) 
				
			setImage("mancity.jpg");
			
			else if(jerseyName.equals("Manchester United")) 
				
			setImage("man united.jpg");
			
			else if(jerseyName.equals("Chelsea")) 
				
			setImage("chelsea.jpg");
			
			else if(jerseyName.equals("Arsenal")) 
				
			setImage("arsenal1.jpg");
			else if(jerseyName.equals("Tottenham")) 
				
			setImage("tot.jpg");
        }
    }

   
    else if(ae.getSource() == orderbtn){

        if("Select jersey".equals(jerseyName)){
            JOptionPane.showMessageDialog(this, "Please select a jersey");
            return;
        }        
        String size = null;
        if(s.isSelected()) size = "S";
		
        else if(m.isSelected()) size = "M";
		
        else if(l.isSelected()) size = "L";
		
        else if(xl.isSelected()) size = "XL";

        if(size == null){
            JOptionPane.showMessageDialog(this, "Please select a size");
            return;
        }
        Jersey jersey = OrderManager.getJersey(jerseyName);
        OrderDialog dialog = new OrderDialog(this,jersey,size);
        dialog.setVisible(true);
        }
		 else if(ae.getSource() == backBtn){   
        int choice = JOptionPane.showConfirmDialog(
            this, "Are you sure you want to go back?","Confirm",
            JOptionPane.YES_NO_OPTION
        );

        if(choice == JOptionPane.YES_OPTION){
            this.dispose();  
		}
     }
}
}