package org.sito.facturacio.model;

import lombok.Data;

@Data
public class EmployeesInvoice {
	private Employee employee;
	private Invoice invoice;
}
