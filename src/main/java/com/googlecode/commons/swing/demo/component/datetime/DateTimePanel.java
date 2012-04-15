package com.googlecode.commons.swing.demo.component.datetime;

import com.googlecode.commons.swing.component.datetime.JDateTimeField;
import com.googlecode.commons.swing.form.FormPanel;

public class DateTimePanel extends FormPanel {

	private static final long serialVersionUID = 618473341841964310L;
	
	private JDateTimeField dat1;
	
	public DateTimePanel() {
		super();

		dat1 = new JDateTimeField();
		addField("Field 1", dat1);
	}

}
