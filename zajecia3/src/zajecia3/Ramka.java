package zajecia3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


	public class Ramka  extends JFrame implements ActionListener{
		// private JButton przycisk; zamiast 
		// private JButton przycisk2;
		private JTextField textField;
		
		public Ramka() {
			setTitle("Aplikacja");
			
			 
			
			GridLayout layout= new GridLayout(1, 3);
			setLayout(layout);
			
			JButton przycisk=new JButton("Klikaæ na w³asne ryzyko"); 
			JButton przycisk2=new JButton("Nowy");
			textField = new JTextField();
			add(przycisk);
			
			
			 przycisk.addActionListener(this:: actionPerformed);
			 
			add(przycisk2);
			add(textField);
			przycisk2.addActionListener(this:: actionPerformed);
			
			
			/* przycisk2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
				textField.setText("Klikniête!");
				}
			}); */
				
			
			pack();
		}
			@Override
			public void actionPerformed(ActionEvent e) {
				
			Object o = o.getSource();
			if(o== przycisk) {
				JOptionPane.showMessageDialog(null, "Dzia³a! Jestem genialny!");
			}else if(o==przycisk2){
				textField.setText("Klikniête!");
			}
			
			}
		
		}
		
	
	
		


