package com.googlecode.commons.swing.demo;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import com.googlecode.commons.swing.demo.component.datetime.DateSpinnerPanel;
import com.googlecode.commons.swing.demo.component.datetime.DateTimePanel;
import com.googlecode.commons.swing.demo.component.datetime.MiniDateCalendarPanel;
import com.googlecode.commons.swing.demo.component.link.HyperLinkPanel;
import com.googlecode.commons.swing.demo.component.table2.TablePlusPanel;
import com.googlecode.commons.swing.demo.entity.Customer;
import com.googlecode.commons.swing.demo.form.FormDemo;
import com.googlecode.commons.swing.demo.form.FormDemo2;
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

		tabs.addTab("TablePlus", new SourceTab(new TablePlusPanel(), TablePlusPanel.class));
		
		tabs.addTab("DateSpinner", new SourceTab(new HyperLinkPanel(), HyperLinkPanel.class));
		
		DateSpinnerPanel spinner = new DateSpinnerPanel();
		tabs.addTab("DateSpinner", new SourceTab(spinner, DateSpinnerPanel.class));
		
		TableDemo table = new TableDemo();
		tabs.addTab("Table", new SourceTab(table, TableDemo.class, Customer.class));
		
		FormDemo form = new FormDemo();
		tabs.addTab("Form", new SourceTab(form, FormDemo.class, Customer.class));
		
		FormDemo2 form2 = new FormDemo2();
		tabs.addTab("Form2", new SourceTab(form2, FormDemo2.class, Customer.class));
		
		DateTimePanel datetime = new DateTimePanel();
		tabs.addTab("JDateTimeField", new SourceTab(datetime, DateTimePanel.class));
		
		MiniDateCalendarPanel miniCalendar = new MiniDateCalendarPanel();
		tabs.addTab("MiniDateCalendar", new SourceTab(miniCalendar, MiniDateCalendarPanel.class));
	}
	
}
