package com.googlecode.commons.swing.demo.form;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import com.googlecode.commons.swing.binding.Binding;
import com.googlecode.commons.swing.binding.Bindings;
import com.googlecode.commons.swing.component.FieldNotifier;
import com.googlecode.commons.swing.component.FormNotifier;
import com.googlecode.commons.swing.demo.entity.Customer;
import com.googlecode.commons.swing.demo.entity.Gender;
import com.googlecode.commons.swing.form.FormPanel;
import com.googlecode.commons.swing.util.SizeUtils;
import com.googlecode.commons.swing.validate.EMailAddressValidator;
import com.googlecode.commons.swing.validate.NotEmptyValidator;
import com.googlecode.commons.swing.validate.NotNullValidator;
import com.googlecode.commons.swing.validate.ValidationListener;
import com.googlecode.commons.swing.validate.Validators;

public class FormDemo extends JPanel {

	private static final long serialVersionUID = 6876712914780301797L;

	private FormNotifier notForm;
	
	private FormPanel panForm;
	private JTextField txtFirstname;
	private FieldNotifier notFirstname;
	
	private JTextField txtLastname;
	
	private JTextField txtEMail;
	private FieldNotifier notEMail;
	
	private JComboBox cmbGender;
	private FieldNotifier notGender;
	
	private JCheckBox chkNewsletter;
	
	private JToolBar barButtons;
	private JButton btnSave;
	
	private Validators validators;
	private Bindings<Customer> bindings;
	
	public FormDemo() {
		super();
		init();
		initBindings();
		initValidators();
	}
	
	private void init() {
		this.setLayout(new BorderLayout());
		
		notForm = new FormNotifier();
		add(notForm, BorderLayout.NORTH);
		
		panForm = new FormPanel();
		add(new JScrollPane(panForm), BorderLayout.CENTER);
		
		txtFirstname = new JTextField();
		txtFirstname.setName("First name");
		SizeUtils.setAllWidths(txtFirstname, 200);
		notFirstname = new FieldNotifier();
		panForm.addField("First name:", txtFirstname, notFirstname);
		
		txtLastname = new JTextField();
		txtLastname.setName("Last name");
		panForm.addField("Last name:", txtLastname);
		
		txtEMail = new JTextField();
		txtEMail.setName("E-Mail");
		notEMail = new FieldNotifier();
		panForm.addField("E-Mail:", txtEMail, notEMail);
		
		cmbGender = new JComboBox(Gender.values());
		cmbGender.setName("Gender");
		cmbGender.setRenderer(new DefaultListCellRenderer() {
			public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
				if (value == Gender.MALE) {
					value = "Male";
				} else if (value == Gender.FEMALE) {
					value = "Female";
				} else if (value == Gender.UNKNOWN) {
					value = "Unknown";
				} 
				return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
			}
		});
		notGender = new FieldNotifier();
		panForm.addField("Gender:", cmbGender, notGender);
		
		chkNewsletter = new JCheckBox("Yes");
		chkNewsletter.setBackground(Color.WHITE);
		panForm.addField("Newsletter:", chkNewsletter);
		
		panForm.addDummyOnEnd();
		
		barButtons = new JToolBar();
		add(barButtons, BorderLayout.SOUTH);
		
		btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onSave();
			}
		});
		btnSave.setEnabled(false);
		barButtons.add(btnSave);
	}
	
	private void initValidators() {
		this.validators = new Validators();
		validators.add(txtFirstname, new NotEmptyValidator(), notFirstname, notForm);
		
		validators.add(txtEMail, new EMailAddressValidator(), notEMail, notForm);
		validators.add(cmbGender, new NotNullValidator(), notGender, notForm);
		
		validators.addValidationListener(new ValidationListener() {
			public void validate(boolean valid) {
				btnSave.setEnabled(valid);
			}
		});
		validators.revalidate();
	}
	
	private void initBindings() {
		bindings = new Bindings<Customer>();
		bindings.addBinding(new Binding(txtFirstname, "firstName"));
		bindings.addBinding(new Binding(txtLastname, "lastName"));
		bindings.addBinding(new Binding(txtEMail, "eMailAddress"));
		bindings.addBinding(new Binding(cmbGender, "gender"));
		bindings.addBinding(new Binding(chkNewsletter, "newsletter"));
		bindings.bind(Customer.createCustomer());
	}
	
	private void onSave() {
		JOptionPane.showMessageDialog(this, bindings.getModel());
	}
	
}
