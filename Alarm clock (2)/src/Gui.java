import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
/**
 * 
 * @author Muhammad Omer Saeed
 *
 */

public class Gui extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7003580777457978910L;
	private CBeanRolloverButton New,newAlarm,newBirthday,newTask,newList,newTodo;
	private JTable alarmTable;
	private JLabel currentTime;
	private JMenuBar menuBar;
	private JMenu fileMenu;
	private JMenu aboutMenu;
	private JPanel panel1, panel2;
	private JMenuItem about;
	
	/**
	 * 
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws UnsupportedLookAndFeelException
	 */
	public Gui() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException{
		initGui();
		addToPane();
		addMenu();
		addListeners();
	}
	/**
	 * Initialize the user interface here
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public void initGui() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException{
		
		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		
		New = CBeanRolloverButton.GetOkButton("New..",null);
		currentTime = new JLabel("current time: " + new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));
		panel1 = new JPanel();
		panel2 = new JPanel();
		
		New.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("New.png"))));
		
		/////////////////////////////////table for alarms
		String headings[] = {"","Message","Day","Time"};
		DefaultTableModel model = new DefaultTableModel( 5 , 4);
		model.setColumnIdentifiers((String[])headings);
		alarmTable = new JTable(model);
		/////////////////////////////////end
		
	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	/**
	 * Add components
	 */
	public void addToPane(){
		Container pane = this.getContentPane();
		
		/////////////////////////////panel1
		panel1.setLayout(new GridLayout(1,2));
		panel1.add(New);
		panel1.add(currentTime);
		/////////////////////////////end
		
		///////////////////////////panel2
		panel2.setLayout(new FlowLayout());
		panel2.add(alarmTable);
		/////////////////////////////end
		pane.setLayout(new BoxLayout(pane , BoxLayout.Y_AXIS));
		pane.add(panel1);
		pane.add(panel2);
		
		
		
		this.setVisible(true);
		this.setSize(new Dimension(640,480));
	}
	/**
	 * Add listeners of the components
	 */
	public void addListeners(){
		New.addActionListener(this);
		about.addActionListener(this);
	}
	/**
	 * Add the menu to this frame
	 */
	public void addMenu(){
		menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		fileMenu = new JMenu("File");
        aboutMenu = new JMenu("About");
        about = new JMenuItem("About developers");
        
        menuBar.add(fileMenu);
        menuBar.add(aboutMenu);
        
        aboutMenu.add(about);
	}
	/**
	 * 
	 */
	public void openMenu(){
	
		newAlarm = CBeanRolloverButton.GetRandomButton("New alarm", "Set up a new alarm");
		newList = CBeanRolloverButton.GetRandomButton("New List", "Make a new list");
		newTodo = CBeanRolloverButton.GetRandomButton("New todo list", "Make a new todo list");
		newBirthday = CBeanRolloverButton.GetRandomButton("New Birthday", "Save someone's birthday");
		newTask = CBeanRolloverButton.GetRandomButton("New Task", "Set up a new task");
		//////////////////////////////////add icons
		
		newAlarm.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("alarm.png"))));
		newList.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("List.png"))));
		newTodo.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("Todo.png"))));
		newBirthday.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("birthday.png"))));
		newTask.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("Task.png"))));
		
		final JDialog Menu = new JDialog();
		Menu.setLayout(new GridLayout(6,1));
		Menu.setTitle("Select option");
		Menu.add(newAlarm);
		Menu.add(newTodo);
		Menu.add(newTask);
		Menu.add(newList);
		Menu.add(newBirthday);
		
		CBeanRolloverButton cancel = CBeanRolloverButton.GetCancelButton("Cancel", "Cancel and go back");
		Menu.add(cancel);
		
		Menu.setModal(true);
		
		cancel.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				Menu.dispose();
			}
			
		});
		
		cancel.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("cancel.png"))));
		
		Menu.setSize(new Dimension(260,390));
		Menu.setLocationRelativeTo(null);
		Menu.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent event) {

		if(event.getSource().equals(New)){
			openMenu();
		}
		/////////////////////////////////// about dialog
		
		if(event.getSource().equals(about)){
			//TODO Saad Saeed , you have to make a dialog within this if statement
		}
	}
}
