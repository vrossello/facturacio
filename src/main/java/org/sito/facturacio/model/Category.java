package org.sito.facturacio.model;

import java.util.Date;

import lombok.Data;

@Data
public class Category {
	private Long id;
	private Enterprise enterprise;
	private String name;
	private Boolean visible;
	private Date activationDate;
	private Integer position;
	private Long parentId;
}
