package com.googlecode.commons.swing.demo;

import com.googlecode.commons.swing.util.SizeUtils;

public class DemoApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MainFrame frm = new MainFrame();
		frm.setVisible(true);
		frm.pack();
		SizeUtils.setHeight(frm, 600);
		frm.setLocationRelativeTo(null);
	}

}
