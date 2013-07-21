import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.UnsupportedLookAndFeelException;


public class MainClass {
	public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException{
		final Gui g  = new Gui();
		
		g.addWindowListener(new WindowAdapter()  
	    {  public void windowClosing(WindowEvent e)  
	        {  
	        	for(int i = 1; i < 30 ; i++){
	    			g.setSize(new Dimension((int)400/i,(int)240/i));
	    			try {
	    				Thread.sleep(30);
	    			} catch (InterruptedException e1) {
	    				e1.printStackTrace();
	    			}
	    		}
	    		
	    		System.exit(0);	      
	        }		});  
	
   }
}