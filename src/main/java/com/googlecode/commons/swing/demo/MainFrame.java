package com.googlecode.commons.swing.demo;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import com.googlecode.commons.swing.demo.component.datetime.DateTimePanel;
import com.googlecode.commons.swing.demo.component.datetime.MiniDateCalendarPanel;
import com.googlecode.commons.swing.demo.entity.Customer;
import com.googlecode.commons.swing.demo.form.FormDemo;
import com.googlecode.commons.swing.demo.table.TableDemo;
import com.googlecode.commons.swing.util.JFrameUtils;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 5105038963485659363L;

	private JTabbedPane tabs;
	
	public MainFrame() {
		super();
		JFrameUtils.configToApplicationFrame(this);
		
		tabs = new JTabbedPane();
		getContentPane().add(tabs);
		
		TableDemo table = new TableDemo();
		tabs.addTab("Table", new SourceTab(table, TableDemo.class, Customer.class));
		
		FormDemo form = new FormDemo();
		tabs.addTab("Form", new SourceTab(form, FormDemo.class, Customer.class));
		
		DateTimePanel datetime = new DateTimePanel();
		tabs.addTab("JDateTimeField", new SourceTab(datetime, DateTimePanel.class));
		
		MiniDateCalendarPanel miniCalendar = new MiniDateCalendarPanel();
		tabs.addTab("MiniDateCalendar", new SourceTab(miniCalendar, MiniDateCalendarPanel.class));
	}
	
}
