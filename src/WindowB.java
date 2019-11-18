import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class WindowB extends JFrame{

	private Controller mainControl;
	//WAIT - WHAT IF I NEED TO GENERATE THIS DATA?
	//YOU GENERATE THIS BY PASSING THE DATA INTO HERE. 
	private String data[][]={ 
								{"p1","101","Amit","670000"},    
             					{"p2","102","Jai","780000"},    
             					{"p3","101","Sachin","700000"}};    

	private String column[]={"Prompt Information: ", "ID","NAME","SALARY"};         
	private JTable jt=new JTable(data,column);    

	private MouseListener tableListen = new MouseListener() {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("clicked!");
			//DOWNCASTING
			//What is happening here is I am reassuring the computer that
			//when we look at MouseEvent e we will find a JTable
			JTable target = (JTable)e.getSource();
		    int row = target.getSelectedRow();
		    int column = target.getSelectedColumn();
		
		    System.out.println(row+" "+column);
		    
		    if (row == 0 && column == 0) {
		    	System.out.println("PULL UP NEW WINDOW");
		    }
		}
		
		

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
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
		
	};
	public WindowB(Controller c) {
		
		mainControl = c;
		
		jt.setBounds(30,40,200,300);     
		jt.addMouseListener(tableListen);
	    JScrollPane sp=new JScrollPane(jt);    
	    this.add(sp);          
	    this.setSize(300,400);    
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	
}
