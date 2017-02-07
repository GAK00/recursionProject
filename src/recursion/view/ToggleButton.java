package recursion.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ToggleButton extends JButton
{
	private String state1;
	private String state2;
	public ToggleButton(String state1, String state2)
	{
		super();
		this.state1 = state1;
		this.state2 = state2;
		this.setText(state1);
		this.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0)
			{
				toggle();
			}
			
		});
	}
	public void toggle()
	{
		if(state1.equals(this.getText()))
		{
			this.setText(state2);
		}
		else
		{
			this.setText(state1);
		}
	}

}
