/*
	A basic extension of the java.awt.Window class
 */

package fuzzytesting.granddaddytest;

import java.awt.*;

public class statusWindow extends Window
{
	public statusWindow(Frame parent)
	{
		super(parent);
		// This code is automatically generated by Visual Cafe when you add
		// components to the visual environment. It instantiates and initializes
		// the components. To modify the code, only use code syntax that matches
		// what Visual Cafe can generate, or Visual Cafe may be unable to back
		// parse your Java file into its visual environment.
		//{{INIT_CONTROLS
		setLayout(null);
		setSize(798,470);
		setBackground(new Color(12632256));
		statusTextArea = new java.awt.TextArea();
		statusTextArea.setBounds(24,12,758,443);
		statusTextArea.setBackground(new Color(16710861));
		add(statusTextArea);
		//}}
	}

	public void addNotify()
	{
	    // Record the size of the window prior to calling parents addNotify.
	    Dimension d = getSize();
	    
		super.addNotify();

		if (fComponentsAdjusted)
			return;

		// Adjust components according to the insets
		setSize(insets().left + insets().right + d.width, insets().top + insets().bottom + d.height);
		Component components[] = getComponents();
		for (int i = 0; i < components.length; i++)
		{
			Point p = components[i].getLocation();
			p.translate(insets().left, insets().top);
			components[i].setLocation(p);
		}
		fComponentsAdjusted = true;
	}

    // Used for addNotify check.
	boolean fComponentsAdjusted = false;

	//{{DECLARE_CONTROLS
	java.awt.TextArea statusTextArea;
	//}}
}
