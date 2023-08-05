import java.awt.*;

import java.awt.event.*;

class MouseEvents extends Frame implements MouseListener, MouseMotionListener

{int x,y; MouseEvents ()

{setLayout (new FlowLayout()); addMouseListener (this); addMouseMotionListener (this); addWindowListener (new WindowAdapter ()

{public void windowClosing (WindowEvent we)

{	System.exit (0);

}

});

}

public void paint (Graphics g)

{g.drawString (x +" , "+ y, x, y);

}

public void mouseClicked (MouseEvent me)

{setBackground (Color.yellow);

}

public void mousePressed(MouseEvent me)

{setBackground (Color.red);

}

public void mouseReleased(MouseEvent me)

{setBackground (Color.green);

}

public void mouseEntered (MouseEvent me)

{setBackground (Color.blue);

}

public void mouseExited(MouseEvent me)

{setBackground (Color.white);

}

public void mouseDragged(MouseEvent me)

{setBackground (Color.black);

}

public void mouseMoved(MouseEvent me)

{	x = me.getX ();	y = me.getY ();

setBackground (Color.cyan);

repaint ();

}

public static void main(String args[])

{MouseEvents ob = new MouseEvents (); ob.setSize(600,200); ob.setVisible(true);



}

}