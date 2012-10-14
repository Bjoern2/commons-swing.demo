package com.googlecode.commons.swing.demo.component.table2;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import com.googlecode.commons.swing.component.table2.BeanTableModel;
import com.googlecode.commons.swing.component.table2.CheckBoxTableCellRenderer;
import com.googlecode.commons.swing.component.table2.ColumnConfig;
import com.googlecode.commons.swing.component.table2.HeaderTableCellRenderer;
import com.googlecode.commons.swing.component.table2.LabelTableCellRenderer;
import com.googlecode.commons.swing.component.table2.TableModel;
import com.googlecode.commons.swing.component.table2.TablePlus;
import com.googlecode.commons.swing.demo.entity.Customer;

public class TablePlusPanel extends JPanel {

	private TablePlus table;
	
	public TablePlusPanel() {
		super();
		
		setLayout(new BorderLayout());
		
		List<ColumnConfig> cols = new ArrayList<ColumnConfig>();
		ColumnConfig colChk = new ColumnConfig();
		colChk.setId("");
		colChk.setName("");
		colChk.setMinimumWidth(20);
		colChk.setMaximumWidth(20);
		colChk.setPreferredWidth(20);
		colChk.setRenderer(new LabelTableCellRenderer());
		colChk.setHeaderRenderer(new HeaderTableCellRenderer() {
			@Override
			public double getColumnWeight(int row, int col) {
				return 0.0;
			}
		});
		cols.add(colChk);
		
		ColumnConfig colId = new ColumnConfig();
		colId.setId("id");
		colId.setName("ID");
//		colId.setMaximumWidth(50);
		colId.setRenderer(new LabelTableCellRenderer() {
			@Override
			public double getColumnWeight(int row, int col) {
				return 0.0;
			}
		});
		colId.setHeaderRenderer(new HeaderTableCellRenderer() {
			@Override
			public double getColumnWeight(int row, int col) {
				return 0.0;
			}
		});
		cols.add(colId);
		
		ColumnConfig colFirstName = new ColumnConfig();
		colFirstName.setId("firstName");
		colFirstName.setName("Vorname");
		colFirstName.setRenderer(new LabelTableCellRenderer());
		cols.add(colFirstName);
		
		List<Customer> data = new ArrayList<Customer>();
		for (int i = 0; i < 100; i++) {
			data.add(Customer.createCustomer());
		}

		TableModel model = new BeanTableModel<Customer>(cols, data);
		
		table = new TablePlus(null, model);
		add(table);
	}
	
}
