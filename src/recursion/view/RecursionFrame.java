package recursion.view;

import javax.swing.JFrame;
import recursion.controller.RecursionController;

public class RecursionFrame extends JFrame
{
	RecursionController baseController;
	RecursionPanel panel;
	public RecursionFrame(RecursionController baseController)
	{
		super();
		this.baseController = baseController;
		this.panel = new RecursionPanel(baseController);
		setup();
	}
	private void setup()
	{
		this.setTitle("Recursion Project");
		this.setContentPane(panel);
		this.setSize(500,500);
		this.setVisible(true);
	}
}
