import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class jradio extends JApplet implements ItemListener
{
	Container c ;
	JRadioButton r1,r2,r3;
	ButtonGroup br;
	public void init()
	{
		 c = getContentPane();
		 c.setLayout(new FlowLayout());
		
		 br = new ButtonGroup();
		 r1 = new JRadioButton("RED");
		 r2 = new JRadioButton("GREEN");
		 r3 = new JRadioButton("BLUE");
		 
		 r1.addItemListener(this);
		 r2.addItemListener(this);
		 r3.addItemListener(this);
		 
		 br.add(r1);
		 br.add(r2);
		 br.add(r3);
		 
		 c.add(r1);
		 c.add(r2);
		 c.add(r3);
		 
	}
	
	public void itemStateChanged (ItemEvent ie)
	{
		if (ie.getSource() == r1)
		{
			c.setBackground(Color.RED);
		}
		
		if (ie.getSource() == r2)
		{
			c.setBackground(Color.GREEN);
		}
		
		if (ie.getSource() == r3)
		{
			c.setBackground(Color.BLUE);
		}
	}

}

/*<applet code = "jradio.class" width = 1000 height = 1000 > </applet>*/
