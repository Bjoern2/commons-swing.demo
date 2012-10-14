package com.googlecode.commons.swing.demo.component.link;

import com.googlecode.commons.swing.component.link.HyperLink;
import com.googlecode.commons.swing.form.FormPanel;
import com.googlecode.commons.swing.layout.util.ColoratorMouseListener;

public class HyperLinkPanel extends FormPanel {

	private HyperLink link1;
	
	public HyperLinkPanel() {
		super();

		link1 = new HyperLink();
		link1.setText("Hallo Welt");
		link1.addActionListener(new BrowseURIAction("http://www.google.de"));
		addField("Link 1", link1);
		
		addMouseListener(new ColoratorMouseListener());
	}
	
}
