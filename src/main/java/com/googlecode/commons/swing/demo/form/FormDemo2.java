package com.googlecode.commons.swing.demo.form;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.Box;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.googlecode.commons.swing.form.FormFieldBox;

public class FormDemo2 extends JPanel {

	public FormDemo2() {
		Box b = Box.createVerticalBox();
		add(b);
		
		
		FormFieldBox box1 = new FormFieldBox("Firstname", new JTextField(), "Enter your first name.");
		b.add(box1);
		
		FormFieldBox box2 = new FormFieldBox("Lastname", new JTextField(), "");
		b.add(box2);
		
		FormFieldBox box3 = new FormFieldBox("Street and house number", new JTextField(), "Enter your last name.");
		b.add(box3);
		
		List<Component> hobbies = new ArrayList<Component>();
		for (int i = 0; i < 5; i++) {
			hobbies.add(new JTextField());
		}
		
		FormFieldBox box4 = new FormFieldBox("Hobbies", hobbies, "I.e. Horses, Chess, Internet...");
		b.add(box4);
	}
	
}
