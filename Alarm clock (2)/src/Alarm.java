import java.util.Date;


public class Alarm {

	private String Message;
	private Date time;
	
	/**
	 * Constructor
	 * @param time
	 * @param message
	 */
	public Alarm(Date time , String message){
		this.time = time;
		Message = message;
	}
	/**
	 * 
	 * @param time
	 */
	public Alarm(Date time){
		this.time = time;
		this.Message = "";
	}
	/**
	 * 
	 * @return the time of the alarm
	 */
	public Date getTime(){
		return time;
	}
	/**
	 * 
	 * @return the message associated with the alarm
	 */
	public String getMessage(){
		return this.Message;
	}
	/**
	 * This will show a form which can be filled to set an alarm
	 */
	public static void showAlarmForm(){
		
	}
	
}
