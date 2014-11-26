package oj;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScrollPaneTest();
	}
	
	public static void ScrollPaneTest(){
		JFrame frame = new JFrame();
		frame.setSize(500, 450);
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        JTextArea text = new JTextArea();
        text.setEditable(true);
        text.setAutoscrolls(true);
        Dimension d = new Dimension(100, 100);
        text.setMinimumSize(d);
        
        JScrollPane pane = new JScrollPane(text);
//Code fragment below doesn't work. 
//        pane.add(text);
        panel.add(pane,BorderLayout.CENTER);
        

    //   frame.setLayout(new BorderLayout());
       frame.add(panel,BorderLayout.CENTER);
        frame.setVisible(true);
    }

}
