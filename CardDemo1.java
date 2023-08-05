import java.awt.*;  
import java.awt.event.*;  
public class CardDemo1 extends Frame implements ActionListener
{  
Frame f;
CardLayout c_Card;  
Button box1,box2,box3;  
Panel d;  
	CardDemo1()
{  
		f=new Frame();
		d=new Panel();  
		c_Card=new CardLayout(40,30);  
		d.setLayout(c_Card);

		 box1=new Button("Card Panel_1");  
		 box2=new Button("Card Panel_2");  
		box3=new Button("Card Panel_3");  
		box1.addActionListener(this);  
		box2.addActionListener(this);  
		box3.addActionListener(this);  

		d.add("P",box1);
		d.add("Q",box2);
		d.add("R",box3); 
		f.add(d);
		f.setSize(500,500);  
		f.setVisible(true);  
		f.addWindowListener (new WindowAdapter ()
{public void windowClosing (WindowEvent we)
{
System.exit (0);
}
});
		
    }  
    public void actionPerformed(ActionEvent e) 
{  
		c_Card.next(d);  
	}  
    public static void main(String[] args) 
{  
		new CardDemo1();    
	}  
}