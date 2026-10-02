import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OrderDialog extends JDialog implements ActionListener{
	JLabel nameLbl,addresslbl;
	JTextField nameField,addressField;
	JSpinner qtySpinner;
	JRadioButton online,cod;
	ButtonGroup payGroup;
	JButton confirmBtn,backBtn;
    Jersey jersey;
    String size;

	public OrderDialog(JFrame parent, Jersey jersey, String size){
		super (parent,"Order Details", true);
		this.jersey=jersey;
		this.size=size;
		setSize(350,300);
		setLocationRelativeTo(parent);
		setLayout(null);
		
		JLabel nameLbl=new JLabel("User Name:");
		nameLbl.setBounds(30,30,100,25);
		add(nameLbl);
		
		nameField=new JTextField();
		nameField.setBounds(140,30,150,25);
		add(nameField);
		
		JLabel qtyLbl=new JLabel("Quantity:");
		qtyLbl.setBounds(30,70,100,25);
		add(qtyLbl);
		
		qtySpinner=new JSpinner(new SpinnerNumberModel(1,1,10,1));
		qtySpinner.setBounds(140,70,60,25);
		add(qtySpinner);
		
		JLabel payLbl=new JLabel("Payment:");
		payLbl.setBounds(30,110,80,25);
		add(payLbl);
		
		online=new JRadioButton("Online");
		online.setBounds(140,110,80,25);
		add(online);
		
		cod=new JRadioButton("Cash On Delivery");
		cod.setBounds(140,140,150,25);
		add(cod);
		
		payGroup=new ButtonGroup();
		payGroup.add(online);
		payGroup.add(cod);
		
		addresslbl=new JLabel("Address:");
		addresslbl.setBounds(30,180,100,25);
		add(addresslbl);
		
		addressField =new JTextField();
		addressField.setBounds(140,180,180,25);
		add(addressField);
		
		confirmBtn=new JButton("Confirm Order");
		confirmBtn.setBounds(50, 220, 120, 35);
		confirmBtn.addActionListener(this);
		add(confirmBtn);
		
		backBtn = new JButton("Back");
        backBtn.setBounds(200, 220, 120, 35);
        backBtn.addActionListener(this);
        add(backBtn);

	
		
	}
	public void actionPerformed(ActionEvent ae){

   
    if(ae.getSource() == backBtn){

        int choice = JOptionPane.showConfirmDialog(
            this, "Are you sure you want to go back?", "Confirm",
            JOptionPane.YES_NO_OPTION
        );

        if(choice == JOptionPane.YES_OPTION){
            dispose();   
        }
        return; 
    }

    if(ae.getSource() == confirmBtn){

        String name = nameField.getText();
        String address = addressField.getText();
        int qty = (int) qtySpinner.getValue();
        String payment = null;

        if(online.isSelected()) payment = "Online";
        else if(cod.isSelected()) payment = "Cash on Delivery";

        if(name.isEmpty() || address.isEmpty() || payment == null){
            JOptionPane.showMessageDialog(this,"Please fill all details");
            return;
        }

        int total = jersey.getPrice() * qty;

        JOptionPane.showMessageDialog(this,
            "Order Confirmed\n" +
            "Name: " + name + "\n" +
            "Team: " + jersey.getTeam() + "\n" +
            "Size: " + size + "\n" +
            "Quantity: " + qty + "\n" +
            "Address: " + address + "\n" +
            "Payment: " + payment + "\n" +
            "Total: " + total + " BDT"
        );

        dispose();
    }
}

}
		
		
		