package recursion.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import recursion.controller.RecursionController;

public class RecursionPanel extends JPanel
{
	RecursionController baseController;
	JButton firstButton;
	JButton secondButton;
	ToggleButton toggle;
	JTextArea textArea;
	JTextField textField;
	SpringLayout baseLayout;

	public RecursionPanel(RecursionController baseController)
	{
		this.baseController = baseController;
		this.firstButton = new JButton("Calculate Factorial");
		this.secondButton = new JButton("Calculate Fibonacci");
		this.toggle = new ToggleButton("Recursive", "Iterative");
		this.textArea = new JTextArea("Output");
		this.textField = new JTextField("Input");
		this.baseLayout = new SpringLayout();
		baseLayout.putConstraint(SpringLayout.WEST, toggle, 0, SpringLayout.WEST, firstButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, toggle, -52, SpringLayout.NORTH, secondButton);
		this.textArea.setEnabled(false);
		this.textArea.setEditable(false);
		this.textArea.setDisabledTextColor(Color.black);
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(secondButton);
		this.add(toggle);
		this.add(textArea);
		this.add(textField);
		this.setBackground(Color.magenta);
	}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, textArea, 30, SpringLayout.EAST, firstButton);
		baseLayout.putConstraint(SpringLayout.WEST, secondButton, 15, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 25, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 0, SpringLayout.WEST, secondButton);
		baseLayout.putConstraint(SpringLayout.WEST, textField, 25, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, textField, -30, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, secondButton, -25, SpringLayout.NORTH, textField);
		baseLayout.putConstraint(SpringLayout.SOUTH, textField, -50, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, textArea, 25, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, textArea, -25, SpringLayout.NORTH, textField);
		baseLayout.putConstraint(SpringLayout.EAST, textArea, -30, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstButton, 140, SpringLayout.WEST, secondButton);
	}

	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if (baseController.stringIsInt(textField.getText()))
				{
					textArea.setText(baseController.calculateFactorial(Double.parseDouble(textField.getText())));
				}

			}
		});
		secondButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if (baseController.stringIsInt(textField.getText()))
				{
					textArea.setText(baseController.calculateFibonacci(Double.parseDouble(textField.getText())));
				}
			}
		});
		toggle.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				baseController.switchTool();
			}
		});

	}

}
