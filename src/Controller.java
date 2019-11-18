import java.util.ArrayList;

public class Controller {

	
	//GUI CLASSES
	WindowA mainWindow = new WindowA(this);
	WindowB winB = new WindowB(this);
	
	//DATA CLASSES
	ArrayList<Student> students = new ArrayList<Student>();
	
	public Controller() {
		
		
		//The controllor has not window its managing stuff. 
		
		//LOAD ALL STUDENTS INTO list student
	
		
		//LOAD any active students 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller c = new Controller();
	}
	
	public void activateWindow(int a) {
		
		//set all to false
		mainWindow.setVisible(false);
		winB.setVisible(false);
		
		if (a == 0) {
			mainWindow.setVisible(true);
		}
		else if (a == 1) {
			winB.setVisible(true);
		}
	}

}
