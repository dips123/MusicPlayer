/*
 * Class which builds the GUI
 * Author : Karthik Abinav S ; CS10B057
 */

import java.awt.*;
import java.util.List;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class GraphicalInterface {
	static JFrame window;
	static JPanel player;
	static JButton play;
	static JButton stop;
	static JButton pause;
	static JButton open;
	static JSlider js;
	static JLabel name;

	
	public static void main(String args[]) {
		GUI();
	}

	/*
	 * Function which creates the open file and stop buttons
	 * 
	 * @params : void
	 * 
	 * @return : void
	 */
	public static void createButtons() {

		open = new JButton();
		open.setText("Select Song");
		Listener.openListener();
		player.add(open);
		open.setToolTipText("Click to brows file");
		
		pause = new JButton();
		pause.setText("Pause");
		Listener.pauseListener();
		player.add(pause);
		pause.setToolTipText("pause");

		stop = new JButton();
		stop.setText("Stop");
		Listener.stopListener();
		player.add(stop);
		stop.setToolTipText("stop");
		

		//window.pack();
	}

	/*
	 * Initialises the basic GUI
	 * 
	 * @params: void
	 * 
	 * @return : void
	 */
	public static void GUI() {
		
		Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
		window = new JFrame("Wave Player");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(dim.width/4-120, dim.height/2);
		window.setLocation(dim.width/2, dim.height/2-200);
		window.setIconImage(new ImageIcon("g.jpg").getImage());
		window.setResizable(false);

		player = new JPanel();
		player.setBackground(Color.black); 
		
		window.add(player);
		
		ImageIcon img2=new ImageIcon("img.jpg");
		JLabel lim2=new JLabel(img2); 
		player.add(lim2);
		
		ImageIcon img1=new ImageIcon("1.gif");
		JLabel lim1=new JLabel(img1);
		player.add(lim1);
		
		ImageIcon img=new ImageIcon("loading.gif");
		JLabel lim=new JLabel(img);
		player.add(lim);
		
		
		createButtons();
		js=new JSlider(0,100);
		js.setMinorTickSpacing(10);
		js.setToolTipText("Adjust Volume");
		js.addChangeListener(new ChangeListener() {
			
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				int val=js.getValue();
			
						
				}
		});
		player.add(js);
		 
	/*	String s=Logic.file.toString();
		name=new JLabel(s);
		player.add(name);*/
		
		//window.pack();
		window.setVisible(true);

		
	}

}
