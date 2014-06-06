import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;

//import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class display {

	JFrame window = new JFrame();
	Container pane = window.getContentPane();
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	JLabel label4 = new JLabel();
	
	public display() {
		//Create window
        window.setTitle("Now Playing");
        window.setSize(480, 360);
        pane.setLayout(new GridLayout(4,1));
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pane.setBackground(Color.white);
        window.setExtendedState(Frame.MAXIMIZED_BOTH);
        window.setUndecorated(true);
        window.setVisible(true);
        
        label1.setText("This Program Was Created For BASH SC");
        label1.setFont(new Font("Arial", Font.PLAIN, 48));
        label1.setForeground(Color.black);
        label1.setVerticalAlignment(JLabel.CENTER);
        label1.setHorizontalAlignment(JLabel.CENTER);
        
        label2.setText("This Program Was Created By Ben Shaner");
        label2.setFont(new Font("Arial", Font.PLAIN, 48));
        label2.setForeground(Color.black);
        label2.setVerticalAlignment(JLabel.CENTER);
        label2.setHorizontalAlignment(JLabel.CENTER);
        
        label3.setText("For Support Email: ben@skybasetech.com");
        label3.setFont(new Font("Arial", Font.PLAIN, 48));
        label3.setForeground(Color.black);
        label3.setVerticalAlignment(JLabel.CENTER);
        label3.setHorizontalAlignment(JLabel.CENTER);
        
        label4.setText("Connecting (I Think)");
        label4.setFont(new Font("Arial", Font.PLAIN, 48));
        label4.setForeground(Color.black);
        label4.setVerticalAlignment(JLabel.CENTER);
        label4.setHorizontalAlignment(JLabel.CENTER);
        
        pane.add(label1);
        pane.add(label2);
        pane.add(label3);
        pane.add(label4);
	}
	
	public void songUpdate(int i, String t, String c){
        if(i == 1){
        	label1.setText(t + ": " + c);
        }else if(i == 2){
        	label2.setText(t + ": " + c);
        }else if(i == 3){
        	label3.setText(t + ": " + c);
        }else if(i == 4  && t != ""){
        	label4.setText(t + ": " + c);
        }else if(i == 4){
        	label4.setText("");
        }
	}
	
	public void specialText(int i, String t){
		if(i == 1){
        	label1.setText(t);
        }else if(i == 2){
        	label2.setText(t);
        }else if(i == 3){
        	label3.setText(t);
        }else if(i == 4){
        	label4.setText(t);
        }
	}

}
