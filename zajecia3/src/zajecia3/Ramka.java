package zajecia3;
import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;
import java.util.EventObject;

	public class Ramka  extends JFrame implements ActionListener{
		// private JButton przycisk; zamiast 
		// private JButton przycisk2;
		private JTextField textField;
		
		public Ramka() {
			setTitle("Aplikacja");
			
			 
			
			GridLayout layout= new GridLayout(1, 3);
			setLayout(layout);
			
			JButton przycisk=new JButton("Klikać na własne ryzyko"); 
			JButton przycisk2=new JButton("Nowy");
			textField = new JTextField();
			add(przycisk);
			
			
			 przycisk.addActionListener(this:: actionPerformed);
			 
			add(przycisk2);
			add(textField);
			przycisk2.addActionListener(this:: actionPerformed);
			
			 przycisk.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
					textField.setText("Działa! Jestem genialny!");
					}
				}); 
			
			
			 przycisk2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
				textField.setText("Kliknięte!");
				}
			}); 
				
			
			pack();
		}
			@Override
			public void actionPerformed(ActionEvent e) {
				
			Object o = o.getSource();
			if(o== przycisk) {
				JOptionPane.showMessageDialog(null, "Działa! Jestem genialny!");
			}else if(o==przycisk2){
				textField.setText("Kliknięte!");
			}
			
			}
		
		}
		
	
	
		



	
		


