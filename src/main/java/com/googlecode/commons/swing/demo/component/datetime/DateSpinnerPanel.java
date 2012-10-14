package com.googlecode.commons.swing.demo.component.datetime;

import com.googlecode.commons.swing.component.datetime.DateSpinner;
import com.googlecode.commons.swing.component.datetime.DateMultiSpinner;
import com.googlecode.commons.swing.form.FormPanel;
import com.googlecode.commons.swing.layout.util.ColoratorKeyListener;
import com.googlecode.commons.swing.layout.util.ColoratorMouseListener;

public class DateSpinnerPanel extends FormPanel {

	private static final long serialVersionUID = 618473341841964310L;
	
	private DateSpinner spinner1;
	private DateMultiSpinner spinner2;
	
	public DateSpinnerPanel() {
		super();

		spinner1 = new DateSpinner();
		addField("DateSpinner", spinner1);
		
		spinner2 = new DateMultiSpinner();
		addField("DateSpinner2", spinner2);
		
//		addKeyListener(new ColoratorKeyListener());
		addMouseListener(new ColoratorMouseListener());
	}
	
}
