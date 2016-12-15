import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorTeacher implements MouseListener{
JFrame frame = new JFrame("Color Teacher");
JPanel panel = new JPanel();
JButton red = new JButton();
JButton blue = new JButton();
JButton green = new JButton();
JButton yellow = new JButton();

public ColorTeacher(){
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	red.setBackground(new Color(200,0,0));
	red.setOpaque(true);
	red.addMouseListener(this);
	blue.setBackground(new Color(0,0,200));
	blue.setOpaque(true);
	blue.addMouseListener(this);
	green.setBackground(new Color(200,100,0));
	green.setOpaque(true);
	green.addMouseListener(this);
	yellow.setBackground(new Color(0,200,0));
	yellow.setOpaque(true);
	yellow.addMouseListener(this);
	panel.add(yellow);
	panel.add(red);
	panel.add(blue);
	panel.add(green);
	frame.add(panel);
	frame.setVisible(true);
	frame.pack();
}

public static void main(String[] args){
	
	ColorTeacher teacher = new ColorTeacher();
}

@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	
	if(buttonPressed == red){
		speak("Red");
	} else if(buttonPressed == yellow){
		speak("Yellow");
	} else if(buttonPressed == blue){
		speak("Blue");
	} else if(buttonPressed == green){
		speak("Green");
	}
}

@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

void speak(String words){
	try {
		Runtime.getRuntime().exec("say " + words);
	} catch (IOException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}

}
