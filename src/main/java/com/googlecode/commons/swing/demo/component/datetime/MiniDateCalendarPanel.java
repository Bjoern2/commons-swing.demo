package com.googlecode.commons.swing.demo.component.datetime;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.apache.commons.lang3.time.DateFormatUtils;

import com.googlecode.commons.swing.component.datetime.MiniDateCalendar;

public class MiniDateCalendarPanel extends JPanel {

	private MiniDateCalendar calendar;
	
	public MiniDateCalendarPanel() {
		super();
		calendar = new MiniDateCalendar();
		calendar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(MiniDateCalendarPanel.this, DateFormatUtils.format(calendar.getValue(), "dd.MM.yyyy HH:mm:ss"));
			}
		});
		add(calendar);
		
		
	}

}
