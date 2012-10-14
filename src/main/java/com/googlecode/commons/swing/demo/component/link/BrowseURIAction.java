package com.googlecode.commons.swing.demo.component.link;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class BrowseURIAction implements ActionListener {

	private URI uri;

	public BrowseURIAction(URI uri) {
		super();
		this.uri = uri;
	}
	
	public BrowseURIAction(String uri) {
		super();
		try {
			this.uri = new URI(uri);
		} catch (URISyntaxException e) {
			throw new RuntimeException(e);
		}
	}

	public void actionPerformed(ActionEvent e) {
		try {
			Desktop.getDesktop().browse(uri);
		} catch (IOException e1) {
			throw new RuntimeException(e1);
		}
		
	}
	
}
