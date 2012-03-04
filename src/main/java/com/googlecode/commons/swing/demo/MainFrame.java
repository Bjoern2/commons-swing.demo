package com.googlecode.commons.swing.demo;

import javax.swing.JFrame;

import com.googlecode.commons.swing.demo.form.FormDemo;
import com.googlecode.commons.swing.util.JFrameUtils;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 5105038963485659363L;

	public MainFrame() {
		super();
		JFrameUtils.configToApplicationFrame(this);
		getContentPane().add(new FormDemo());
	}
	
}
