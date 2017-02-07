package recursion.view;

import javax.swing.*;
import recursion.controller.RecursionController;

public class RecursionPanel extends JPanel
{
	RecursionController baseController;
	JButton firstButton;
	JButton secondButton;
	JTextArea textArea;
	JTextField textField;
	SpringLayout baseLayout;
	public RecursionPanel(RecursionController baseController)
	{
		this.baseController = baseController;
		this.firstButton = new JButton("First");
		this.secondButton = new JButton("Second");
		this.textArea = new JTextArea("TextArea");
		this.textField = new JTextField("TextField");
		this.baseLayout = new SpringLayout();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(secondButton);
		this.add(textArea);
		this.add(textField);
	}
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, textArea, 0, SpringLayout.NORTH, firstButton);
		baseLayout.putConstraint(SpringLayout.WEST, textArea, 52, SpringLayout.EAST, firstButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, textArea, 0, SpringLayout.SOUTH, secondButton);
		baseLayout.putConstraint(SpringLayout.EAST, textArea, 0, SpringLayout.EAST, textField);
		baseLayout.putConstraint(SpringLayout.WEST, secondButton, 14, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 24, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 0, SpringLayout.WEST, secondButton);
		baseLayout.putConstraint(SpringLayout.WEST, textField, 24, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, textField, -32, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, secondButton, -24, SpringLayout.NORTH, textField);
		baseLayout.putConstraint(SpringLayout.SOUTH, textField, -51, SpringLayout.SOUTH, this);
	}
	private void setupListeners()
	{
		
	}
}
