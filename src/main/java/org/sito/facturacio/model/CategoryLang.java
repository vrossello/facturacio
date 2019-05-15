package org.sito.facturacio.model;

import lombok.Data;

@Data
public class CategoryLang {
	private Category category;
	private Language language;
	private String name;
	private String description;
}
