import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class GUIHelloWorld extends JFrame {	
	GUIHelloWorld(){
		dothis();
	}
	
	public void dothis(){
	JButton button = new JButton();	
	
	//SUBJECT
	button.setText("Hello");	
	JPanel panel= new JPanel();
	
	//REGISTER
	button.addActionListener(new ActionListener() {
		@Override
		//UPDATE
		public void actionPerformed(ActionEvent evt) {
			//Listener
			buttonClicked(evt);
		}
	});	
	
	panel.setSize(200, 400);
	panel.add(button);
	add(panel);
	setVisible(true);
	pack();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new GUIHelloWorld();

	}	
	//Listener
	public void buttonClicked(ActionEvent evt){
		
		JOptionPane dia = new JOptionPane();
		JOptionPane.showMessageDialog(this,
			    "Hello World.");			
	}
}
