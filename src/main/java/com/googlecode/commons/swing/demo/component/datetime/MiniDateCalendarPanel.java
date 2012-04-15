package com.googlecode.commons.swing.demo.component.datetime;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import org.apache.commons.lang3.time.DateFormatUtils;

import com.googlecode.commons.swing.component.datetime.MiniDateCalendar;

public class MiniDateCalendarPanel extends MiniDateCalendar {

	public MiniDateCalendarPanel() {
		super();
		addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(MiniDateCalendarPanel.this, DateFormatUtils.format(getValue(), "dd.MM.yyyy HH:mm:ss"));
			}
		});
	}

}
