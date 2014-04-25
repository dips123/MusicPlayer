/*
 * Class which contains the various button listeners
 * Author : Karthik Abinav; CS10B057
 */

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Listener {
	/*
	 * Listener for the open button
	 * 
	 * @params:void
	 * 
	 * @return:void
	 */
	public static void openListener() {
		GraphicalInterface.open.addMouseListener(new MouseListener() {

			public void mouseReleased(MouseEvent arg0) {

			}

			public void mousePressed(MouseEvent arg0) {

			}

			public void mouseExited(MouseEvent arg0) {

			}

			public void mouseEntered(MouseEvent arg0) {

			}

			public void mouseClicked(MouseEvent arg0) {

				Thread thread = new Thread(new Runnable() {

					public void run() {
						try {
							Logic.openFile();
						} catch (UnsupportedAudioFileException e) {
							System.out.println("Unsupported File Format");
						} catch (IOException e) {
							System.out.println("He is a dead JIM :(");
						} catch (LineUnavailableException e) {
							System.out.println("He is a dead JIM :(");
						}

					}
				});

				thread.start();
			}
		});

	}

	/*
	 * Listener for the stop button
	 * 
	 * @params:void
	 * 
	 * @return:void
	 */
	public static void stopListener() {
		GraphicalInterface.stop.addMouseListener(new MouseListener() {

			public void mouseReleased(MouseEvent arg0) {

			}

			public void mousePressed(MouseEvent arg0) {

			}

			public void mouseExited(MouseEvent arg0) {

			}

			public void mouseEntered(MouseEvent arg0) {

			}

			public void mouseClicked(MouseEvent arg0) {

				Thread thread = new Thread(new Runnable() {

					public void run() {

						Logic.stopSong();

					}
				});

				thread.start();
			}
		});

	}

	public static void pauseListener() {
		// TODO Auto-generated method stub
		GraphicalInterface.pause.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				Thread thread = new Thread(new Runnable() {

					public void run() {
				Logic.click++;
				
				if(Logic.click%2==0)
				{
					Logic.stopSong();
					GraphicalInterface.pause.setText("Play");
				}
				if(Logic.click%2!=0)
				{
					
					try {
						Logic.pause_play();
						GraphicalInterface.pause.setText("Pause");
					} catch (LineUnavailableException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("click count :"+Logic.click);
					}
				});

				thread.start();
			}

				
			
		});
			}
}

