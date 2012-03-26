package com.googlecode.commons.swing.demo;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

import org.apache.commons.io.IOUtils;


public class SourceTab extends JPanel {

	private static final long serialVersionUID = 6809970338671550242L;
	
	private JSplitPane split;
	private JTabbedPane tabs;
	
	public SourceTab(Component top, Class<?>... sources) {
		setLayout(new BorderLayout());
		
		tabs = new JTabbedPane();
		for (Class<?> source : sources) {
			try {
				String path = "/" + source.getName().replace(".", "/") + ".java";
				InputStream stream = getClass().getResourceAsStream(path);
				String text = IOUtils.toString(stream);
				JTextArea txt = new JTextArea(text);
				txt.setFont(Font.decode("Courier New"));
				txt.setTabSize(4);
				txt.setEditable(false);
//				SizeUtils.setAllHeights(txt, 200);
				tabs.addTab(source.getSimpleName() + ".java", new JScrollPane(txt));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		split = new JSplitPane(JSplitPane.VERTICAL_SPLIT, top, tabs);
		split.setDividerLocation(300);
		split.setOneTouchExpandable(true);
		add(split, BorderLayout.CENTER);
		

	}
	
}
