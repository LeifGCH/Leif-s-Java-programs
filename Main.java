import java.io.FileWriter;
import java.io.File;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Main extends JFrame {
	public Main() {
		setTitle("Leif's App");
        
		setSize(400, 400);
        
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
		setLayout(null);

        JButton button1 = new JButton("Button 1");
        button1.setBounds(120, 100, 180, 15);
		button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("Clicked \"Button 1\" button");
            }
        });
			
        JButton button2 = new JButton("Button 2");
        button2.setBounds(120, 300, 180, 15);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Clicked \"Button 2\" button");
			}
		});
	
        add(button1);
        add(button2);
    }
    public static void main(String[] args) {
		Main frame = new Main();
		
		frame.setVisible(true);
    }
}