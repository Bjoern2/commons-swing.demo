package com.googlecode.commons.swing.demo.i18n;

import com.googlecode.commons.swing.resources.AbstractI18N;

public class I18N extends AbstractI18N {

	private static I18N instance;
	
	private I18N() {
		// Singleton
	}
	
	public static I18N getInstance() {
		if (instance == null) {
			instance = new I18N();
		}
		return instance;
	}
	
}
