package com.googlecode.commons.swing.demo.table;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.googlecode.commons.swing.demo.entity.Customer;
import com.googlecode.commons.swing.table.BeanTableColumnModel;
import com.googlecode.commons.swing.table.BeanTableModel;
import com.googlecode.commons.swing.table.ColumnConfig;

public class TableDemo extends JPanel {

	private static final long serialVersionUID = 2721564246722853618L;
	
	private BeanTableModel<Customer> model;
	private BeanTableColumnModel colModel;
	private JTable table;
	
	public TableDemo() {
		super();
		setLayout(new BorderLayout());
		
		List<ColumnConfig> configs = new ArrayList<ColumnConfig>();
		
		ColumnConfig colId = new ColumnConfig();
		colId.setName("id");
		colId.setTitle("ID");
		configs.add(colId);
		
		ColumnConfig colFirstname = new ColumnConfig();
		colFirstname.setName("firstName");
		colFirstname.setTitle("First name");
		configs.add(colFirstname);
		
		ColumnConfig colLastname = new ColumnConfig();
		colLastname.setName("lastName");
		colLastname.setTitle("Last name");
		configs.add(colLastname);
		
		ColumnConfig colStreet = new ColumnConfig();
		colStreet.setName("address.address1");
		colStreet.setTitle("Street");
		configs.add(colStreet);
		
		ColumnConfig colZip = new ColumnConfig();
		colZip.setName("address.zip");
		colZip.setTitle("ZIP");
		configs.add(colZip);
		
		ColumnConfig colCity = new ColumnConfig();
		colCity.setName("address.city");
		colCity.setTitle("City");
		configs.add(colCity);
		
		model = new BeanTableModel<Customer>(configs);
		colModel = new BeanTableColumnModel(configs);
		
		table = new JTable(model, colModel);
		add(new JScrollPane(table));
		
		model.setData(Arrays.asList(Customer.createCustomer(), Customer.createCustomer()));
	}

}
