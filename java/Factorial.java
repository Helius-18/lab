import java.awt.*; 
import java.awt.event.*;
/*<applet code="Factorial.class" width=500 height=200></applet>*/

public class Factorial extends java.applet.Applet implements ActionListener
{
	TextField t1,t2;
	Label l1,l2;
	Button b1;
	int fact=1,n,i; 	
	Factorial e; 
	public void init()
	{
		e=this;
		t1=new TextField(10); 
		t1.setText("0"); 
		t2=new TextField(10);
		l1=new Label("Enter value");
		l1.setForeground(Color.BLUE); 		
		l2=new Label("Result");
		l2.setForeground(Color.BLUE); 
		b1=new Button("compute"); 
		add(l1);
		add(t1);
        		add(b1);
		add(l2);		
		add(t2); 
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		String str=t1.getText(); 
		n=Integer.parseInt(str); 
		for(i=n;i>1;i--)
			fact=fact*i;
		String msg=""+fact; 
		t2.setText(msg);
	}
}
